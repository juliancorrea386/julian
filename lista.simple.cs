using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
 
namespace listaenlazada
{
class Program
{
static void Main(string[] args)
{
int operador=0;
int num=0;
Lista listita = new Lista(); //Se crea el objeto lista enlazada
do
{
    Console.WriteLine("Menu principal");
    Console.WriteLine("1. Agregar al inicio ");
    Console.WriteLine("2. Agregar al final ");
    Console.WriteLine("3. Mostrar lista");
    Console.WriteLine("4.Borrar nodo del inicio");
    Console.WriteLine("5.Borrar nodo del final");
    Console.WriteLine("6.Salir.....");
   operador= Convert.ToInt32(Console.ReadLine()); 
    switch(operador){
        case 1:
        Console.WriteLine("Digito un numero");
           num= Convert.ToInt32(Console.ReadLine());
           listita.agregarInicio(num);
        break;
        case 2:
        Console.WriteLine("Digito un numero");
            num= Convert.ToInt32(Console.ReadLine());
            listita.agregarFinal(num);
        break;
        case 3:
        listita.mostrarLista();
        break;
        case 4:
        num=listita.borrarDelInicio();
        Console.WriteLine("El numero eliminado al principio "+num);
        break;
        case 5:
         num=listita.borrarDelFinal();
        Console.WriteLine("El numero eliminado al final "+num);
        break;
        case 6:
        Console.WriteLine("fin proceso");
        break;
        default:
        Console.WriteLine("Digito mal el numero");
        break;
    }
} while (operador !=6);
}
}
public class Nodo {
    public int dato;
    public Nodo siguiente;
    public Nodo(int d){
        this.dato=d;
    }
    //Constructor inicio
    public Nodo(int d, Nodo n){
        dato=d;
        siguiente=n; 
    }
}
    public class Lista {
    protected Nodo inicio,fin;
    public Lista(){
        inicio=null;
        fin=null;
    }
    public bool Estavacia(){
        if(inicio==null){
            return true;
        }else{
            return false;
        }
    }
    public void agregarFinal(int elemento) {
        if(!Estavacia()){
            fin.siguiente=new Nodo(elemento);
            fin=fin.siguiente;
        }else{
            inicio=fin=new Nodo(elemento);
        }
        
    }
    //Metodo para Agregar 
    public void agregarInicio(int elemento){
        inicio=new Nodo(elemento, inicio);
        if(fin==null){
            fin=inicio;
        }

    }
    public void mostrarLista(){
        Nodo recorrer=inicio;
        while(recorrer!=null){
            Console.WriteLine("("+recorrer.dato+") ");
            recorrer=recorrer.siguiente;
        }
    }
    public int borrarDelInicio(){
        int elemento=inicio.dato;
        if(inicio==fin){
            inicio=null;
            fin=null;
        }else{
            inicio=inicio.siguiente;
        }
        return elemento;
    }
    public int borrarDelFinal(){
        int elemento=fin.dato;
        if(inicio==fin){
            inicio=null;
            fin=null;
        }else{
            Nodo temporal=inicio;
            while(temporal.siguiente!=fin){
                temporal=temporal.siguiente;
            }
            fin=temporal;
            fin.siguiente=null;
        }
        return elemento;
    }

}

}
