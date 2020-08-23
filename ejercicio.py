def Sierpinski(exp):
    if (exp==0):
        return 1
    if (exp <0):
        return (Sierpinski(exp+1)/3)
    else:
        return 3*(Sierpinski(exp-1))
def Hanoi(n,torre_inicial=1, torre_auxiciliar=2,torre_final=3):
    if (n==1):
        print(torre_inicial,"->",torre_final)
    else:
        Hanoi(n-1,torre_inicial,torre_final,torre_auxiciliar)
        print(torre_inicial,"->",torre_final)
        Hanoi(n-1,torre_auxiciliar,torre_inicial,torre_final)
    return

if __name__ == "__main__":
    #Triangulo de Sierpinski
    #pot= int(input("Introduce la elevacion: "))
    #print("Hay ",Sierpinski(pot)," triangulos en el Triangulo de sierpinski")
    #Torres de Hanoi
    Hanoi(3)
    #Integrantes: Julian Andres Correa, Oscar Antonio Ramos Yate, Michell Artunduaga Parra