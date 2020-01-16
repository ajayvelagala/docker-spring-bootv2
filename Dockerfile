FROM openjdk:8
ADD target/docker-spring-boot.jar docker-spring-boot.jar
VOLUME /tmp
EXPOSE 8087
ENTRYPOINT ["java","-jar","docker-spring-boot.jar"]