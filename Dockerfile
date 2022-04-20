FROM ubuntu:18.04

USER root

RUN apt update
RUN apt install -y git default-jre maven git

RUN git clone https://github.com/sinisterprog/Blah.git

WORKDIR "/Blah"

RUN mvn clean install

