FROM openjdk:17
COPY target/demo-2.jar demo-2.jar
EXPOSE 8088
ENTRYPOINT ["java", "-jar", "/demo-2.jar"]