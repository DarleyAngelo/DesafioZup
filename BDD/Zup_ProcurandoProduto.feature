# language: pt
# encoding: utf-8

Funcionalidade: Pesquisar Produto
Como um usuário consumidor
Eu desejo realizar uma pesquisba por determinado produto
Para que eu possa realizar um compra


Cenario: Realizar uma pesquisa.
Dado que o usuário abra o browser 
E o usuário acesse ao endereço web https://www.connectparts.com.br/
Quando o usuário digitar no campo pesquisa o texto "Antena AM FM" 
E acionar o comando [Buscar]
Então será apresentando o produtor pesquisado.

Cenario: Realizar uma pesquisa por inexistente.
Dado que o usuário abra o browser 
E o usuário acesse ao endereço web https://www.connectparts.com.br/
Quando o usuário digitar no campo pesquisa o texto "Molho de Tomate" 
E acionar o comando [Buscar]
Então será apresentando o produtor pesquisado.







