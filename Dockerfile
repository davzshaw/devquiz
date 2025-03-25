FROM openjdk:17
COPY target/devquiz-0.0.1-SNAPSHOT.jar /app/devquiz.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/devquiz.jar"]
