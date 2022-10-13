from models.user import User
import csv

class UserController():
    def __init__(self) -> None:
        #Carrega os dados dos usuários
        self.users = [
            User(name="joao", password="arroz", email="joao@mail.com"),
            User(name="joao2", password="arroz2", email="joao@amaarroz.com"),
            User(name="tais", password="petacular", email="tais_@condida.com"),
        ]
    def checkUser(self,user):
        return user in self.users

    def checkLogin(self, name, password):
        user_teste = User(name=name, password=password, email=None)
        for user in self.users:
            if user.name == user_teste.name and user.password == user_teste.password:
                return True
        return False

    def addUser(self, User):
        self.users.append(User)

    def addUserCsv(self, name, password):
        file = open('data/users.csv', 'a')
        file.write(name + ',' + password + '\n')

    def checkLoginCsv(self, name, password):
        l = [name, password]
        with open('data/users.csv') as f:
            u = csv.reader(f)
            test = list(u)
        if l in test:
            return True
        else:
            return False

