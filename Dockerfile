FROM openjdk:15.0.1
WORKDIR /Flight-deploy
COPY ./target/21-jpa-crud-0.0.1-SNAPSHOT.jar /Flight-deploy
COPY . /Flight-deploy
EXPOSE 8080
CMD ["java","-jar","21-jpa-crud-0.0.1-SNAPSHOT.jar"]