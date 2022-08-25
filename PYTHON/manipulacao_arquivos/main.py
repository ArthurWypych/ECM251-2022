# programa que escreve em arquivo

try:
    # wwooowowowowowoowowowoowoooowowwwwwww ele criou eita porra
    arquivo = open("data/dados.txt", "w")
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

    #x = 9/0

except FileNotFoundError:
    print("n achou o arquivo ou o diretório")

except ZeroDivisionError:
    print("divisao por zero é cringe")

except:
    print("merda acontece, vira gente")

finally:
    print("vai pra casa caraio")