package src;
public class principal {
    public static void main(String[] args) {
        int opc=0;
        Empleados p1= new Empleados();
        while(opc !=5){

opc=p1.menu();
switch(opc){
    case 1:
    p1.Agregar();
    break;
    case 2:
    p1.Mostrar();
    break;
    case 3:
    p1.Buscar();
    break;
    case 4:
    p1.liquidacion();
    break;
    case 5:
    System.out.println("finalizo proceso");
    break;
    default:
    System.out.println("Letra erronea");
}
        }
    }
}
