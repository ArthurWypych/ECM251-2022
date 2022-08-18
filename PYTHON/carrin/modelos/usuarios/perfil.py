from datetime import date
from subprocess import DETACHED_PROCESS
class Perfil:
    def __init__(self, nome) -> None:
        self._nome = nome
        self._foto = None
        self._data_nascimento = date.today()
        self._descricao = "Sem Descrição no momento."
        self._telefone = ""

    def set_nome(self, nome):
        self._nome = nome

    def set_foto(self, foto):
        self._foto = foto

    def set_data_nascimento(self, data_nascimento):
        self._data_nascimento = data_nascimento

    def set_telefone(self, telefone):
        self._telefone = telefone
        
    def set_descricao(self, descricao):
        self._descricao = descricao