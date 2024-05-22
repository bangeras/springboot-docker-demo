# Read Me First

* This is a demo Springboot project to expose a simple hello rest endpoint.
* The Springboot executable jar is built as a docker image 
* The docker engine runs the container(i.e. build-time image = runtime container) & exposes the endpoint

# Getting Started

1. Create a simple rest endpoint
2. Gradle build bootJar to generate the exec jar
2. Create a Dockerfile
2. $ docker build -f Dockerfile -t springboot-docker-demo .
3. $ docker images
   REPOSITORY               TAG       IMAGE ID       CREATED          SIZE
   springboot-docker-demo   latest    88ea319a0ce8   27 seconds ago   484MB
4. Running the container
   $ docker run -p 8080:8085 springboot-docker-demo
   http://localhost:8080/rest/docker/hello
6. Tagging
   $ docker tag springboot-docker-demo surajvbangera/springbootdemos:springboot-docker-demo
7. Pushing
   $ docker login -u surajvbangera
   $ docker push surajvbangera/springbootdemos:springboot-docker-demo
7. Removing image from local
   $ docker rmi -f surajvbangera/springbootdemos:springboot-docker-demo
8. Pulling
   $ docker pull surajvbangera/springbootdemos:springboot-docker-demo
9. Running
   $ docker run -p 8080:8085 surajvbangera/springbootdemos:springboot-docker-demo