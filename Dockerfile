FROM openjdk:15-jdk-alpine
COPY target/springcloud-kubernetes.jar springcloud-kubernetes.jar
ENV JAVA_OPTS=""
ENTRYPOINT exec java -Djava.security.egd=file:/dev/./urandom -jar /springcloud-kubernetes.jar