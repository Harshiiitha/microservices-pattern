FROM openjdk:11.0.3-jdk-slim-stretch
ADD ./target/muzix-service-0.0.1-SNAPSHOT.jar /app/music/muzix-service-0.0.1-SNAPSHOT.jar
WORKDIR app/music
ENTRYPOINT ["java","-jar","muzix-service-0.0.1-SNAPSHOT.jar"]