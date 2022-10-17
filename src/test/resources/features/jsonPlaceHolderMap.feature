#language:pt
Funcionalidade: JsonPlaceHokderMap com token

  Contexto: 
    Quando for realizado uma requisição do tipo POST do Token e o valor do token é armazenado

  @JsonPlaceHolderMap
  Cenário: Valida JsonPlaceHolder Map
    Dado que sejam preenchidos os campos do JsonPlaceHolderMap
    Quando forem alterados os campos do JsonPlaceHolderMap
      | nome  | Gabi |
      | idade |   28 |
    E for realizado uma requisição do tipo POST do JsonPlaceHolderMap
    Então o sistema devolve o status 201
    Então o sistema devolve o campo "nome" com o valor "Gabi"
    Então o sistema devolve o campo "idade" com o valor "28"