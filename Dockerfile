# Use uma imagem base oficial do OpenJDK com uma versão do JRE
# Escolha uma versão compatível com a que você usou para desenvolver
# Exemplo: OpenJDK 17
FROM openjdk:17-jdk-slim

# Argumento para o nome do arquivo JAR
ARG JAR_FILE=target/*.jar

# Copie o arquivo JAR da sua aplicação para dentro da imagem
# O nome do JAR pode variar dependendo da sua configuração de build
COPY ${JAR_FILE} app.jar

# Exponha a porta que sua aplicação Spring Boot usa (padrão é 8080)
EXPOSE 8080

# Comando para executar a aplicação quando o container iniciar
ENTRYPOINT ["java","-jar","/app.jar"]