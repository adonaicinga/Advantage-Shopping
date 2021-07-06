# language: pt
#Author: adonai_cinga@hotmail.com

@test
Funcionalidade: Login de Usuario
  Eu como usuario quero acessar meu cadastro para comprar

  @positivo
  Cenario: Login com sucesso
  Dado que acesse o site
  E acesse a pagina de login
  Quando informar o usuario e senha
  Então valido usuario logado
  
  @negativo
  Cenario: Login Invalido
  Dado que acesse o site
  E acesse a pagina de login
  Mas informar o usuario e senha Invalidos
  Então valido mensagem de erro no login
  