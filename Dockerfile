FROM openjdk:8-jdk-alpine
MAINTAINER Ony Novianti <2041720029@student.polinema.ac.id>
RUN mkdir -p /app
WORKDIR /app

COPY Ucapan.java /app

#compile file java
RUN javac Ucapan.java

#running java
CMD ["java","Ucapan"]
