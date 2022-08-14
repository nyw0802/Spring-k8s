FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} manet-service.jar
ENTRYPOINT ["java","-jar","/manet-service.jar"]
EXPOSE 9001