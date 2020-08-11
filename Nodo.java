
public class Nodo {
    int dato;
    Nodo siguiente;
    public Nodo(int d){
        this.dato=d;
    }
    //Constructor inicio
    public Nodo(int d, Nodo n){
        dato=d;
        siguiente=n; 
    }
}

    