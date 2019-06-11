FROM openjdk:11.0.3-jdk-slim-stretch
ADD ./target/zuul-service-0.0.1-SNAPSHOT.jar /app/zuul/zuul-service-0.0.1-SNAPSHOT.jar
WORKDIR app/zuul
ENTRYPOINT ["java","-jar","zuul-service-0.0.1-SNAPSHOT.jar"]




