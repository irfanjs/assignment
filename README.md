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
1: dockerfile is created for application and nginx as well 
2: build the docker images using following command 
                      docker build --no-cache -f Dockerfile -t coupa:latest .
                      docker build --no-cache -f Dockerfile-nginx -t nginx:latest .
3: run the docker-compose up command to access the application at : http://<ip-address>:8080

```
## Versioning

0.0.1-SNAPSHOT

