# Project Title

Assignment which will have the web application running behind the nginx load balanacer. Dockerfile will be used to deploy the image using docker container and docker-compose will be used to maintain the multi-container apps.
Ansible playbook is also checked-in to the repository but is not required for this use case.  


## Getting Started
The source code is java based source and uses maven to build. spring boot framework is used to develop the application. it has been tested with Centos 7

### Prerequisites

JAVA 1.8

Maven 3.x 

Ansible 

Docker 

Nginx


### Installing

```
1: Install two linux machine (better centos 7 would be fine)
2: install java, maven, docker, docker-compose 
3: Build the application using following command:
      mvn clean package 
4: application jar file will be created in the target folder. BTW, target folder is already checked in this repo.
5: dockerfile is created for application and nginx as well 
6: build the docker images using following command 
                      docker build --no-cache -f Dockerfile -t coupa:latest .
                      docker build --no-cache -f Dockerfile-nginx -t nginx:latest .
7: run the docker-compose up command to access the application at : http://<ip-address>:8080

```
## Using ansible playbook:

ansible playbook does follwoing tasks :
```
1: setup the machine with java/jdk 8 installed 
2: setup yum repo 
3: setup nginx web server and configures it
4: run the sample application as service 
5: configures the nginx to work as load balancer 
6: run the command : ansible-playbook -i dev site.yml

```
## Versioning

0.0.1-SNAPSHOT

