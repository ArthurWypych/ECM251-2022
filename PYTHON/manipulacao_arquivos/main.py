# programa que escreve em arquivo

# wwooowowowowowoowowowoowoooowowwwwwww ele criou eita porra
arquivo = open("dados.txt", "w")
continuar = True

while continuar:
    # time é string
    time = input("Time (vazio para sair): ")
    # toda string vazia é falsa
    # entra no if quando string for vazia
    if not time:
        continuar = False
        continue

    arquivo.write(time+'\n')
    
arquivo.close()
