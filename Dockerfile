FROM openjdk:8
ARG JAR_FILE=target/*.jar

ENTRYPOINT ["java","-jar","/rate-servece.jar"]
EXPOSE 2001
