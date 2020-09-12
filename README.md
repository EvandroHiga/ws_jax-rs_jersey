# Web service RESTful Jersey
![#ffff1a](https://via.placeholder.com/15/ffff1a/000000?text=+) *Em andamento...*

![proj_webservice_jersey](https://user-images.githubusercontent.com/26691091/93001540-1c33ff00-f506-11ea-812f-5c951bd88e96.jpg)

### Sobre
> Implementação de um *web service* ***RESTful*** Java.

> Este projeto tem a intenção de demonstrar a criação e utilização de um webservice *JAX-RS*, utilizando a sua implementação ***Jersey***.

> Neste projeto, é possível fazer requisições *GET* e obter respostas serializadas em *XML* e *JSON*, quanto requisições *POST* enviando recursos p/ serem "persistidos", seja inserindo novos registros ou atualizando registros já existentes.

> **Obs. 1:** por ter a intenção de mostrar estritamente a implementação de um web service, este projeto não possui camada de persistência, tendo sido utilizado apenas um HashMap para simular as operações.

> **Obs. 2:** caso tenha o interesse de conhecer outra famosa implementação do JAX-RS, pesquise por [RESTEasy](https://resteasy.github.io/)

### O que foi utilizado
> ***eclipse IDE*** para o desenvolvimento e o ***Postman*** para a realização dos testes.

> ***Apache Maven*** para resolver as dependências do projeto e o ***Tomcat 8.5*** como *servlet container*.

> ***Jersey framework***, ***JAXB*** para o *serializing/deserializing* de objetos em XML, ***Google GSON*** para mesma tarefa em JSON e ***HK2*** para realizar a *injeção de dependências*.

### Como usar
> `git clone --branch branch01 https://github.com/EvandroHiga/ws_jax-rs_jersey.git`

> Importe o projeto Maven para a sua IDE. No caso do eclipse, vá em *File > Import... > Existing Maven Project*

> Insira o projeto no servlet container e inicie-o. 

> Para verificar se está tudo certo, acesse a URI de teste `localhost:8080/ws_jax-rs_jersey/encomenda/test`
