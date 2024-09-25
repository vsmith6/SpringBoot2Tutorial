
FROM assertivasolucoes/openjdk-17 AS build

# Set the working directory in the container
WORKDIR /app

COPY pom.xml .
RUN mvn dependency:go-offline

# Copy the rest of the application source code and build the application
COPY src ./src
RUN mvn package

# Use the official OpenJDK 17 runtime image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the built application from the build stage
COPY --from=build /app/target/booting-web-0.0.1-SNAPSHOT.jar /app/booting-web-0.0.1-SNAPSHOT.jar

# Specify the command to run the application
ENTRYPOINT ["java", "-jar", "/app/booting-web-0.0.1-SNAPSHOT.jar"]
