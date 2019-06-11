FROM openjdk:11.0.3-jdk-slim-stretch
ADD ./target/eureka-service-0.0.1-SNAPSHOT.jar /app/eureka/eureka-service-0.0.1-SNAPSHOT.jar
WORKDIR app/eureka
ENTRYPOINT ["java","-jar","eureka-service-0.0.1-SNAPSHOT.jar"]



