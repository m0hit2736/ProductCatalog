FROM openjdk:11-jre-slim
COPY build/libs/ProductCatalog-0.0.1-SNAPSHOT.jar /app/ProductCatalog.jar
WORKDIR /app
CMD ["java", "-jar", "ProductCatalog.jar"]
