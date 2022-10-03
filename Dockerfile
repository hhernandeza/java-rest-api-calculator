FROM openjdk:11-jre-slim

WORKDIR /app
COPY ./target/calculator-0.0.1-SNAPSHOT.jar /app

EXPOSE 8081

CMD ["java", "-jar", "calculator-0.0.1-SNAPSHOT.jar"]