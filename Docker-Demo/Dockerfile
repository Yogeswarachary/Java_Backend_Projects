#define base docker image
FROM openjdk:11

#Author of the docker file
LABEL maintainer="Yogesh"

#Adding the Jar file to the Spring boot application
ADD target/Springboot-Docker-Application-Demo-0.0.1-SNAPSHOT.jar springboot-docker-demo.jar

#Giving name for the docker image
ENTRYPOINT ["java", "-jar", "springboot-docker-demo.jar"]

#We can give port number also
#EXPOSE 8080
