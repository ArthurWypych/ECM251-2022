from turtle import position, title
import ttkbootstrap as ttk
from tkinter import PhotoImage
from ttkbootstrap.constants import *

class UI_is_cringe():
    def b1_acao(self):
        print("B1 PORAAAAA !!!!!")

    def b2_acao(self):
        print("AAAAAAAA B2!!!!!!!!!!!!!!! VAMO LA CARAI!!!!")

    def _construir_base(self):
        base = ttk.Window(
            title="teste carrin",
            size=(1440, 1024),
            position=(100, 100),
            minsize=(600, 300),
            maxsize=(1800, 900),
            alpha=1.0
        )
        # base.iconphoto(False, PhotoImage(file='thomas.png'))
        return base

    def __init__(self) -> None:
        self.base = self._construir_base()
        #bontao numero uno
        self.b1 = ttk.Button(
            self.base,
            text = "ME CLICAAAAAAAA",
            bootstyle = "default",
            command = self.b1_acao
        )
        self.b1.pack(side = LEFT, padx = 250, pady = 673)

        #buitao dius
        self.b2 = ttk.Button(
            self.base,
            text = "NAAAO MANO CLIMA EM MIN PFFFFFFFF",
            bootstyle = "default",
            command = self.b2_acao
        )
        self.b2.pack(side = LEFT, padx = 600, pady = 673)

    def run(self):
        self.base.mainloop()

def mostrar_nome(nome):
    print(nome)

if __name__ == "__main__":
    f = mostrar_nome
    f("eu")

    app = UI_is_cringe()
    app.run()