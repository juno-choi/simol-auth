FROM openjdk:22-ea-21-slim-bullseye

# jar파일 복사
COPY build/libs/auth-1.0.jar auth.jar
ENTRYPOINT ["java","-jar","auth.jar"]
EXPOSE 8080