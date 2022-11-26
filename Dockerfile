FROM maven:3.6.0-jdk-11-slim  AS build

COPY pom.xml /build/
COPY src /build/src/

WORKDIR /build/

RUN mvn clean package

FROM openjdk:11-jre-slim

WORKDIR /app

COPY --from=build /build/target/idp-project-0.0.1-SNAPSHOT.jar /app/

CMD ["java", "-jar", "idp-project-0.0.1-SNAPSHOT" ]
