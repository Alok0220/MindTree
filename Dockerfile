ARG baseImageVersion=3.4
FROM ubuntu:latest
RUN apt-get -y update && apt-get -y upgrade
RUN apt-get -y install openjdk-8-jdk wget
RUN mkdir /usr/local/tomcat
RUN wget http://apachemirror.wuchna.com/tomcat/tomcat-8/v8.5.57/bin/apache-tomcat-8.5.57.tar.gz -O /tmp/tomcat.tar.gz
RUN cd /tmp && tar xvfz tomcat.tar.gz
RUN cp -Rv /tmp/apache-tomcat-8.5.57/* /usr/local/tomcat/
#COPY target/Entity-1.0-SNAPSHOT.jar service.jar
#EXPOSE 8081
#CMD /usr/local/tomcat/bin/catalina.sh run
#COPY Administrator-1.0-SNAPSHOT.jar service.jar
