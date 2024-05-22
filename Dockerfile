FROM openjdk:18
ADD build/libs/springboot-docker-demo-2.0.0.jar springboot-docker-demo.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","springboot-docker-demo.jar"]