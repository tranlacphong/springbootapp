FROM openjdk:8-jdk-alpine
VOLUME /main-app
ADD build/libs/spring-boot-postgresql-demo-project-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","/app.jar"]
# ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=container", "-jar", "/app.jar"]