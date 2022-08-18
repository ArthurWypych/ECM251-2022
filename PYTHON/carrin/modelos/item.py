class Item():
    def __init__(self, preco, nome, id=None, descricao=None):
        self._nome = nome
        self._preco = preco
        self._descricao = descricao
        self._id = id

    def get_nome(self):
        return self._nome

    def get_preco(self):
        return self._preco

    def get_descricao(self):
        return self._descricao

    def __str__(self) -> str:
        return f'Nomers: {self._nome} / preço: R${self._preco}'

    def __eq__(self, __o: object) -> bool:
        if isinstance(__o, Item):
            return self._nome == __o.get_nome()
        return False