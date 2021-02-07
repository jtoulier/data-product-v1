FROM openjdk:11-jre
COPY ./target/data-product-v1-0.0.1-SNAPSHOT.jar /opt/data-product-v1.jar
ENTRYPOINT ["java", "-Djava.file.encoding=UTF-8", "-jar", "/opt/data-product-v1.jar"]