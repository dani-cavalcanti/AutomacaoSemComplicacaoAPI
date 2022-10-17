#language:pt
Funcionalidade: JsonPlaceHokder com token

  Contexto: 
    Quando for realizado uma requisição do tipo POST do Token e o valor do token é armazenado

  @JsonPlaceHolder
  Cenário: Valida JsonPlaceHolder
    Dado que sejam preenchidos os campos do JsonPlaceHolder
    Quando forem alterados os campos do JsonPlaceHolder
      | nome  | Gabi |
      | idade |   28 |
    E for realizado uma requisição do tipo POST do JsonPlaceHolder
    Então o sistema devolve o status 201
    Então o sistema devolve o campo "nome" com o valor "Gabi"
    Então o sistema devolve o campo "idade" com o valor "28"