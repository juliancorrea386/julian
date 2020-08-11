import java.util.Scanner;

public class Lista {
    protected Nodo inicio,fin;

    public Lista(){
        inicio=null;
        fin=null;
    }
    public boolean Estavacia(){
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
            System.out.print("("+recorrer.dato+") ");
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

public static void main(String[] args){
    Scanner x= new Scanner (System.in);
    Lista listica =new Lista();
    int opcion=0;
    int num=0;
    do {
        System.out.println("\n1. Agregar elemento \n2.Agregar al final \n3.Mostrar datos \n4.Borrar inicio \n5.Borrar final \n6.salir");
        opcion=x.nextInt();
            switch(opcion){
                case 1:
                System.out.println("Digite el elemento");
                num=x.nextInt();
                listica.agregarInicio(num);
                break;
                case 2:
                System.out.println("Digite el elemento");
                num=x.nextInt();
                listica.agregarFinal(num);
                break;
                case 3:
                listica.mostrarLista();
                break;
                case 4:
                num=listica.borrarDelInicio();
                System.out.println("El elemento eliminado del inicio "+num);
                break;
                case 5:
                num=listica.borrarDelFinal();
                System.out.println("El elemento eliminado del final "+num);
                break;
                case 6:
                System.out.println("fin proceso");
                break;
                default:
                System.out.println("Digito mal");
            }
    } while (opcion!=6);
}
}
