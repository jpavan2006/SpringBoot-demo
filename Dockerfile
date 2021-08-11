from openjdk:11
expose 8080
add target/demo-0.0.1-SNAPSHOT.jar demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java","-jar","demo-0.0.1-SNAPSHOT.jar" ]