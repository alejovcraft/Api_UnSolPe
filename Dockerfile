# Usa una imagen oficial de Maven con Java 17 para construir el proyecto
FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

# Usa una imagen de Java 17 más ligera para ejecutar el proyecto
FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/finanzas-api-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 10000
ENTRYPOINT ["java","-Dserver.port=10000","-jar","app.jar"]