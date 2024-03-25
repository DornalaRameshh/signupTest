FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean install






FROM openjdk:17-alpine

WORKDIR /app
COPY --from=build  /app/out/artifacts/signup_jar/signup.jar ./signup.jar
EXPOSE 8080
CMD["java","-jar","signup.jar"]
