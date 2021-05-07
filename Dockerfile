FROM openjdk:11

USER root
WORKDIR /app/

COPY build/libs/*.jar /app/app.jar

CMD ["java", "-jar", "/app/app.jar"]

#docker build -t hataketed/ws-sidecar-ingress:1.0.0 .
#docker push hataketed/ws-sidecar-ingress:1.0.0
