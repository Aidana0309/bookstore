FROM openjdk:21
EXPOSE 8080
ADD target/bookstore.jar bookstore.jar
ENTRYPOINT ["java", "-jar", "/bookstore.jar"]