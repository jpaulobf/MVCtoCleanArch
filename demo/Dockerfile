# Use uma imagem base que já tenha o Maven instalado
FROM maven:3.8.7-openjdk-18-slim AS build

# Define o diretório de trabalho dentro do container
WORKDIR /app

# Copia os arquivos do projeto para o container
COPY . .

# Executa o Maven para compilar e gerar o JAR
RUN mvn clean package -DskipTests

# Agora, a imagem final
FROM alpine/java:22-jdk

# Define o diretório de trabalho
WORKDIR /app

# Copia o JAR gerado da imagem anterior
COPY --from=build /app/target/*.jar app.jar

# Copia a pasta de dados
COPY data/. /app/data/

# Expõe a porta da aplicação
EXPOSE 8080

# Comando para rodar a aplicação
CMD ["java", "-jar", "app.jar"]