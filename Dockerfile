# Use Maven + JDK image
FROM maven:3.9.12-jdk-17

# Set working directory
WORKDIR /app

# Copy project files
COPY . .

# Build project
RUN mvn clean package

# Run the JAR
CMD ["java", "-jar", "target/movieapi-0.0.1-SNAPSHOT.jar"]
