FROM openjdk:17-jdk
EXPOSE 8080
ADD target/devops-project-0.0.1-SNAPSHOT.jar devops-project.jar
ENTRYPOINT ["java","-jar","devops-project.jar"]