FROM openjdk:11-jdk-oracle
COPY target/gateway-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]