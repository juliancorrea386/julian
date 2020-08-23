using System;
namespace listaenlazada
{
class Program
{
static void Main(string[] args)
{
Ejercicio p1=new Ejercicio();
//Ejercicio del triangulo de Sierpinski
Console.WriteLine("Hay "+p1.Sierpinski(3)+" triangulos en el Triangulo de sierpinski");
//Ejercicio de la torre de Hanoi
p1.Hanoi(3,1,2,3);
 //Integrantes: Julian Andres Correa, Oscar Antonio Ramos Yate, Michell Artunduaga Parra
}
}
public class Ejercicio{
    public Ejercicio(){
    }
    public int Sierpinski(int n){
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return (Sierpinski(n + 1) / 3);
        } else {
            return 3 * (Sierpinski(n - 1));
        }
    }
    public void Hanoi(int n, int torre_inicial, int torre_auxiliar, int torre_final){
    if (n == 1) {
            Console.WriteLine(torre_inicial + "->" + torre_final);
        } else {
            Hanoi(n - 1, torre_inicial, torre_final, torre_auxiliar);
            Console.WriteLine(torre_inicial + "->" + torre_final);
            Hanoi(n - 1, torre_auxiliar, torre_inicial, torre_final);
        }
    }
    }
    }


