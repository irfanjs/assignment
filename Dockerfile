FROM centos:7

ENV JAVA_VERSION 8u191
ENV BUILD_VERSION b12

RUN yum -y install wget; wget --no-cookies --no-check-certificate --header "Cookie: oraclelicense=accept-securebackup-cookie" "http://download.oracle.com/otn-pub/java/jdk/$JAVA_VERSION-$BUILD_VERSION/2787e4a523244c269598db4e85c51e0c/jdk-$JAVA_VERSION-linux-x64.rpm" -O /tmp/jdk-8-linux-x64.rpm; yum -y install /tmp/jdk-8-linux-x64.rpm

# JDK stripping
RUN rm -f /usr/java/jdk1.8.0_191/src.zip /usr/java/jdk1.8.0_191/javafx-src.zip
RUN rm -rf /usr/java/jdk1.8.0_191/lib/missioncontrol/ /usr/java/jdk1.8.0_191/lib/visualvm/ /usr/java/jdk1.8.0_191/db/

RUN alternatives --install /usr/bin/java java /usr/java/latest/bin/java 1
RUN alternatives --install /usr/bin/javac javac /usr/java/latest/bin/javac 1

ENV JAVA_HOME /usr/java/latest
ENV PATH=$PATH:/usr/java/latest/bin/java
RUN echo "$PATH"

RUN rm -f /tmp/jdk-8-linux-x64.rpm; yum -y remove wget; yum -y clean all

COPY target/gs-handling-form-submission-0.1.0.jar /tmp/gs-handling-form-submission-0.1.0.jar

CMD [ "java", "-jar", "/tmp/gs-handling-form-submission-0.1.0.jar" ]
