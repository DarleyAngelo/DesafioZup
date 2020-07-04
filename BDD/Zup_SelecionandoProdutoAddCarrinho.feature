# language: pt
# encoding: utf-8

Funcionalidade: Selecionar Produto e adicionar ao carrinho
Como um usuário consumidor
Eu desejo realizar uma pesquisba por determinado produto
Para que eu possa realizar um compra 


Cenario: Selecionar produto.
Dado que o usuário abra o browser 
E o usuário acesse ao endereço web https://www.connectparts.com.br/
Quando eu digitar no campo pesquisa o texto "Antena AM FM" 
E eu aciono o comando [Buscar]
Então será apresentando o produtor pesquisado.
Quando eu aciono o link do produto desejado
Então serei redirecionando a página de detalhes do produto

Cenario: Adicionando protudo ao carrinho.
Dado que o usuário abra o browser 
E o usuário acesse ao endereço web https://www.connectparts.com.br/
Quando eu digitar no campo pesquisa o texto "Antena AM FM" 
E eu aciono o comando [Buscar]
Então será apresentando o produtor pesquisado.
Quando eu aciono o link do produto desejado
Então serei redirecionando a página de detalhes do produto
Quando eu aciono o comando [Comprar]
Então e adicionado ao meu carrinho o produto


Cenario: Removendo Produto Carrinho.
Dado que eu esteja com o acesso ao  https://www.connectparts.com.br/
E eu esteja na opção "Meu Carrinho" 
E esteja com algum produto
Quando eu acionar a opção [Remover] 
Então será removido o produto do carrinho