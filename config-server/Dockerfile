FROM openjdk:11.0.3-jdk-slim-stretch
ADD ./target/config-server-0.0.1-SNAPSHOT.jar /app/config/config-server-0.0.1-SNAPSHOT.jar
WORKDIR app/config
ENTRYPOINT ["java","-jar","config-server-0.0.1-SNAPSHOT.jar"]



