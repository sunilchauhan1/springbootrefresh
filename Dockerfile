FROM openjdk:8
COPY build/libs/springboot-0.0.1-SNAPSHOT.jar /spring-boot/
WORKDIR /spring-boot
EXPOSE 8080
ENTRYPOINT java -jar springboot-0.0.1-SNAPSHOT.jar
