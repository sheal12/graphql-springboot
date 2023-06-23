FROM openjdk:17
EXPOSE 9090
ADD target/tech-0.0.1.jar  tech-0.0.1.jar
ENTRYPOINT [ "java","jar","/tech-0.0.1.jar" ]
