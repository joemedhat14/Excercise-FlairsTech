FROM openjdk:8-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app
ENTRYPOINT ["java","-cp","app:app/lib/*","com.example.excersise.ExcersiseApplication"]




#FROM ubuntu:16.04
#RUN apt-get update; apt-get install git -y
#WORKDIR /Excersise
#RUN git clone https://github.com/ghusta/docker-postgres-world-db.git
#RUN ls
#WORKDIR docker-postgres-world-db
#RUN ls
#RUN apt-get -yqq update
#RUN apt-get -yqq install docker.io 
#RUN service docker start
#CMD docker build --tag ghusta/postgres-world-db .



#RUN apt-get update; apt-get install curl -y
#RUN apt-get update; apt-get install git -y
#RUN curl -fsSLO https://get.docker.com/builds/Linux/x86_64/docker-17.04.0-ce.tgz \&& tar xzvf docker-17.04.0-ce.tgz \
#&& mv docker/docker /usr/local/bin \
#&& rm -r docker docker-17.04.0-ce.tgz
#VOLUME ["/var/run/docker.sock"]
#RUN apt-get -yqq install docker.io 
#RUN git clone https://github.com/ghusta/docker-postgres-world-db ./mydatabase
#RUN docker build .
#RUN docker --version
#RUN service docker start
#CMD git clone https://github.com/ghusta/docker-postgres-world-db.git
#RUN docker build --pull --tag docker build --pull --tag ghusta/postgres-world-db .
#CMD docker run --name spring-db -p:5432:5432 spring-db