
package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Empleados {
    ArrayList<Nodo> trabajador;
    Scanner x = new Scanner(System.in);

    public Empleados() {
        this.trabajador = new ArrayList();
    }

    public void Agregar() {

        System.out.println("---------------------------------------");
        System.out.println("registro del empleado");
        System.out.println("digite su nombre : ");
        String Nombre = x.next();
        System.out.println("digite su cedula ");
        int cedula = x.nextInt();
        System.out.println("digite su salario :");
        int salario = x.nextInt();
        System.out.println("digite sus horas a trabajar por dia: ");
        int horas = x.nextInt();
        trabajador.add(new Nodo(Nombre, cedula, salario, horas));
    }

    public void Mostrar() {
        for (int i = 0; i < trabajador.size(); i++) {
            System.out.println("El nombre del trabajador" + (i + 1) + " es =" + trabajador.get(i).Nombre
                    + "\nLa cedula del trabajador es = " + trabajador.get(i).cedula + "\nEl salario del empleado es = "
                    + trabajador.get(i).salario + "\nLas horas con las que se contrato fueron = "
                    + trabajador.get(i).horas);
            System.out.println("----------------------------------------------");
        }
    }

    public void Buscar() {
        System.out.println("Digite la cedula del empleado a buscar");
        int cedula = x.nextInt();
        int t = 0, p = 0;
        for (int i = 0; i < trabajador.size(); i++) {
            if (cedula == trabajador.get(i).cedula) {
                t = i;
                p = 1;
            }
        }
        if (p == 1) {
            System.out.println("El nombre del trabajador " + (t + 1) + " es =" + trabajador.get(t).Nombre
                    + "\nLa cedula del trabajador es = " + trabajador.get(t).cedula + "\nEl salario del empleado es = "
                    + trabajador.get(t).salario + "\nLas horas con las que se contrato fueron = "
                    + trabajador.get(t).horas);
        } else {
            System.out.println("El trabajador no esta registrado");
        }

    }

    public void liquidacion() {
        System.out.println("Digite la cedula del empleado a buscar");
        int cedula = x.nextInt();
        System.out.println("Digite dias a que ha trabajado en la empresa");
        int dia = x.nextInt();
        int t = 0;
        Double vaciones, cesantias, interes_sobre_cesantias, total = 0.0;
        int valor_bruto = 0;
        for (int i = 0; i < trabajador.size(); i++) {
            if (cedula == trabajador.get(i).salario) {
                t = i;
            }
        }
        if (trabajador.get(t).salario < 1641714) {
            valor_bruto = trabajador.get(t).salario + 97032;

        } else {
            valor_bruto = trabajador.get(t).salario;
        }
        cesantias = (double) ((valor_bruto * dia) / 360);
        interes_sobre_cesantias = (cesantias * ((12 * dia) / 360)) / 100;
        vaciones = (double) ((trabajador.get(t).salario * dia) / 720);
        total = valor_bruto + cesantias + interes_sobre_cesantias + vaciones;
        System.out.println("El total de su liquidacion es =" + total);
        System.out.println("El empreado fue pagado y retirado de la base de datos");
        trabajador.remove(t);
    }

    public int menu() {
        System.out.println("bienvenido a empresa caqueta");
        System.out.println("1. registrar empleado");
        System.out.println("2. ver listado de empleado");
        System.out.println("3. Buscar empleado");
        System.out.println("4. Liquidacion de empleado");
        int opc=x.nextInt();
        return opc;
    }

}
