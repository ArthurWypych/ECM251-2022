from models.user import User
import sqlite3

class UserController():
    def __init__(self) -> None:
        #Carrega os dados dos usuários
        self.users = [
            User(name="joao", password="arroz", email="joao@mail.com"),
            User(name="joao2", password="arroz2", email="joao@amaarroz.com"),
            User(name="tais", password="petacular", email="tais_@condida.com"),
        ]
    def checkUser(self, nome, senha):
        con = self.dbcon()
        cur = con.cursor()
        res = cur.execute("select * from usuarios where nome = \"" + nome + "\"and senha = \"" + senha +"\"")
        if res.fetchone() is not None:
            con.close()
            return True
        else:
            con.close()
            return False 

    def checkLogin(self, name, password):
        user_teste = User(name=name, password=password, email=None)
        for user in self.users:
            if user.name == user_teste.name and user.password == user_teste.password:
                return True
        return False

    def addUser(self, nome, senha, email):
        con = self.dbcon()
        cur = con.cursor()
        cur.execute("insert into usuarios (nome, senha, email) values (\""+nome+"\", \""+senha+"\", \""+email+"\");")
        con.commit()
        con.close()

    def dbcon(self):
        return sqlite3.connect("data/sqlite.db")
