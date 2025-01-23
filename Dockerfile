# Use uma imagem base do OpenJDK
FROM openjdk:17-alpine

# Defina o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copie o arquivo Java para o contêiner
COPY src/MediaMaiorMenor.java .

# Compile o programa Java
RUN javac MediaMaiorMenor.java

# Comando para executar o programa
CMD ["java", "MediaMaiorMenor"]
