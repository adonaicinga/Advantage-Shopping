# language: pt
#Author: adonai_cinga@hotmail.com

@test
Funcionalidade: cadastro 
  Eu como usuario quero me cadastrar no site

  @positivo
  Cenario: cadastro com sucesso
  Dado que acesse o site
  E entre na pagina de cadastro
  E preencher os campos obrigatorios
  Quando finalizar o cadastro
  Então Valido o usuario logado

  @negativo
  Cenario: cadastro ja existe
  Dado que acesse o site
  E entre na pagina de cadastro
  Mas preencher dados ja cadastrados
  Quando finalizar o cadastro
  Então Valido mensagem de erro no cadastro
  

    