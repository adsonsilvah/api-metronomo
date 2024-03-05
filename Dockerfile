FROM ubuntu:latest AS build

RUN apt-get update && \
    apt-get upgrade -y && \
    apt-get install openjdk-17-jdk -y

COPY . .

RUN apt-get install maven -y
RUN mvn clean install

FROM openjdk:17-jdk-slim

EXPOSE 8080

RUN mkdir -p /home/user/.local/share/buildkit/runc-overlayfs/cachemounts/buildkit945241751/bin
COPY ./target/api-metronomo-0.0.1-SNAPSHOT.jar /home/user/.local/share/buildkit/runc-overlayfs/cachemounts/buildkit945241751/bin/


#COPY --from=build /home/adsonhenrique/Adson/ProjetosJava/api-metronomo/target/api-metronomo-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT [ "java", "-jar", "app.jar" ]