FROM openjdk:17-alpine
RUN mkdir /app
COPY build/libs/app.jar /app/app.jar
WORKDIR /app
ENTRYPOINT ["java", "-jar", "app.jar"]

EXPOSE 8081
EXPOSE 8082