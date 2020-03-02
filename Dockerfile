FROM openjdk
FROM openjdk:8
EXPOSE 9000
ADD target/mydockerimage.jar mydockerimage.jar
ENTRYPOINT ["java","-jar","mydockerimage.jar"]