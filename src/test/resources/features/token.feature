#language:pt
Funcionalidade: Token

  @efetuaLogin
  Cenario: Efetuar Login
    Dado que sejam preenchidos os campos para autenticação
    Quando for realizado uma requisição do tipo POST do Token
    Então o sistema devolve o status 201
    E o valor do token é armazenado

  @EfetuarLoginCompleto
  Cenario: Efetuar Login passo único
    Quando for realizado uma requisição do tipo POST do Token e o valor do token é armazenado
