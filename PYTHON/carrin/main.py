from item import Item
from carrinho import Carrinho

item1 = Item(69, 'Celeste', 1, "A true hidden gem")
item2 = Item(
    preco = 69,
    nome ='Celeste 2',
    descricao ='I AM COOMMING AND CONSOOMING')

print(item1.get_nome())
print(item1)

carrinho = Carrinho()

print('tamanho: ', carrinho.get_tamanho())
print('valor: ', carrinho.get_valor_total())

carrinho.adicionar(item1)
carrinho.adicionar(item2)

print('tamanho: ', carrinho.get_tamanho())
print('valor: ', carrinho.get_valor_total())