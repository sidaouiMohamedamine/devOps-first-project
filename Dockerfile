FROM openjdk:17-jdk
EXPOSE 8080
ADD target/devops-project-sid-0.0.1-SNAPSHOT.jar sidaouimohamedamine/devops-project-sid.jar
ENTRYPOINT ["java","-jar","devops-project-sid.jar"]