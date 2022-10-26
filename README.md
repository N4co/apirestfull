# apirestfull

Aplicação sendo iniciada na versão Java 18
Spring Boot versão 3.0(RC1)
Repositório de Dependências ( MAVEM ) POM.XML


-------------------------------------------------------------------------------------------------------------------------------------------------------------------------

SPRING 

@RestController agrega @Controller e @ResponseBody foi adicionado na versão 4.0 do springMVC para facilitar o desenvolvimento de serviços restful com o framework Spring, se familiarizando com os serviços rest a diferença fundamental entre uma aplicação Web e uma APIREST é que a resposta de uma aplicação web é uma visualização HTML, CSS JAVASCRIPT enquanto API REST apenas retorna os dados na forma de JSON ou XML ou outro contentTYPE que está sendo usado, o trabalho do controller é criar um map<> do model object e encontrar uma view equivalente enquanto no contexto  restController retorna o objeto e os dados do objeto são escritos diretamente na respota HTTP como JSON ou XML.

um exemplo de response em formato json retornando um bad_request de um client solicitando uma request para uma URL "/" informando um tipo não numérico. 
{
"timeStamp":"2022-10-26T03:45:07.061+00:00",
"message":"Operação suporta apenas tipos numericos",
"description":"uri=/sum/3/p"
}

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
