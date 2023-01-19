FROM openjdk
EXPOSE 8080
ADD target/alticci-api.jar alticci-api.jar
ENTRYPOINT ["java", "-jar", "alticci-api.jar"]