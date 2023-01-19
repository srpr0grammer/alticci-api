<br>
<h1 align="center">
API-ALTICCI ️
</h1>
<br>

## 💬 Um pouco sobre API-ALTICCI

O serviço Alticci Sequence calcula um valor da sequência Alticci com base em um número passado pelo o ulitzador, na qual é definida da seguinte forma:

n=0 => a(0) = 0

n=1 => a(1) = 1

n=2 => a(2) = 1

n>2 => a(n) = a(n-3) + a(n-2)

## ⚠ Pré-requisitos para execução do projeto

* docker instalado
* docker-compose instalado

## 📌 Como utilizar?

Para utilizar o serviço locamente basta seguir os seguintes passos abaixo:
* baixar/clone o proejto para a propria maquina:
```
git@github.com:srpr0grammer/alticci-api.git 
```
* ir na raiz do projeto e digitar no terminal:
```
docker-compose up -d 
```
Após a execução deste comando, o serviço irá ser executado e dessa forma poderás testar a api-rest correndo em docker.

Com este  baseUrl do [Swagger] (http://localhost:8080/swagger-ui/index.html#/) poderá tanto testar o serviço quanto consultar a documentaçao da API.

## Testando o EndPoint

### Alticci Sequence Number
```
Method: GET
URL: http://localhost:8080/alticci//{number}
{number}: valor a ser passado pelo o utilizador
```



---
