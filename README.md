# ManagementAPI

Rest API de gestão de estoque feita em Java com Spring Boot.


## Instalação

Faça o clone do repositório:

```Ruby
  git clone https://github.com/matheusnascimentods/ManagementAPI.git
```

Entre na pasta do repositório
```Ruby
  cd manegement/target
```

Antes de rodar o projeto crie uma banco de dados MySQL assim como o de `application.properties` e cole no terminal 
```Ruby
  java -jar api.jar
```


## Endpoints

`GET` Consultar todos os produtos
```Ruby
 http://localhost:8080/manegement
```


`GET` Consultar produto pelo id
```Ruby
 http://localhost:8080/manegement/{id}
```


`POST` Cadastrar produto
```Ruby
 http://localhost:8080/manegement
```
```Ruby
{
  "name": "",
  "price": 0,
  "stock": 0
}
```


`PUT` Atualizar produto
```Ruby
 http://localhost:8080/manegement/{id}
```
```Ruby
{
  "name": "",
  "price": 0,
  "stock": 0
}
```


`DELETE` Excluir produto
```Ruby
 http://localhost:8080/manegement/{id}
```


`GET` Documentação mais detalhada
```Ruby
 http://localhost:8080/swagger-ui/index.html
```
