To create a Docker image for your Spring Boot microservice, you'll need to create a Dockerfile and then build the image. Below are the steps to create a Docker image for your "review" microservice:

**Step 1: Create a Dockerfile**

Create a file named `Dockerfile` (without any file extension) in the root directory of your "review" microservice project. 
  This file defines how the Docker image for your application should be built.

Here's an example of a Dockerfile for a Spring Boot application:

```Dockerfile
# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/review-service.jar /app/review-service.jar

# Expose the port your application will run on (default for Spring Boot is 8080)
EXPOSE 8080

# Define the command to run the application when the container starts
CMD ["java", "-jar", "review-service.jar"]
```

In this Dockerfile:

- We use the official OpenJDK 11 runtime image as the base image.
- We set the working directory in the container to `/app`.
- We copy the JAR file (assuming it's named `review-service.jar`) from the `target` directory of your project into the `/app` directory in the container.
- We expose port 8080, which is the default port for Spring Boot applications.
- We define the command to run the JAR file with Java.

**Step 2: Build the Docker Image**

To build the Docker image, open a terminal/command prompt, navigate to the directory containing your Dockerfile and your Spring Boot project, and run the following command:

```bash
docker build -t review-service:1.0 .
```

- `-t review-service:1.0` assigns a name and tag to the Docker image. Replace `review-service` with the desired image name and `1.0` with the desired tag.

**Step 3: Run the Docker Container**

Once the image is built, you can run a Docker container using the following command:

```bash
docker run -p 8080:8080 review-service:1.0
```

- `-p 8080:8080` maps port 8080 inside the container to port 8080 on your host machine.

Your Spring Boot application should now be running inside a Docker container. You can access it by opening a web browser and navigating to `http://localhost:8080` if your application exposes a web interface.

Make sure to replace `review-service.jar` with the actual name of your JAR file and customize other Dockerfile settings as needed.
