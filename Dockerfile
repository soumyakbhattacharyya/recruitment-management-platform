FROM java:8-jdk-alpine
COPY ./target/opening-1.0.0.jar /usr/app/
WORKDIR /usr/app
RUN sh -c 'touch opening-1.0.0.jar'
ENTRYPOINT ["java","-jar","opening-1.0.0.jar"]