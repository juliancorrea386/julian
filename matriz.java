
import java.util.Scanner;

public class matriz {
    public static void main(String[] args){
        Scanner x=new Scanner (System.in);
        int n=0,m=0;
        Double sujeto,a=0.0,prom=0.0;
        System.out.println("Digite los meses a registrar");
        n=x.nextInt();
        Double notas[][][]=new Double[30][5][n];
        for (int p = 0; p < n; p++) {
            System.out.println("Notas del mes "+(p+1));
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 2; c++) {        
                if(c==0){
                    System.out.println("Dgite la nota de Estructura de datos del estudiante N° "+(f+1));
                }else{
                    if(c==1){
                        System.out.println("Dgite la nota de Matematica discreta del estudiante N° "+(f+1));                       
                    }else{
                        if(c==2){
                            System.out.println("Dgite la nota de Algebra lineal del estudiante N° "+(f+1));
                        }else{
                            if (c==3) {
                                System.out.println("Dgite la nota de Fisica III del estudiante N° "+(f+1));   
                            }else{
                                System.out.println("Dgite la nota de Ingles I del estudiante N° "+(f+1));

                            }                             
                        }
                    }
                }
                while(m !=1){
                    sujeto= x.nextDouble();
                       if(sujeto >=0 && sujeto <=5.0){
                           notas[f][c][p]=sujeto;
                           m=1;
                           a=notas[f][c][p]+a;
                       }else{
                           System.out.println("ingreso mal la nota, repetir");
                       }
                   }
                   m=0;
                }
             prom=a/2;
             System.out.println("--------------------------------------------------------------------------");
             System.out.println("el promedio del estudiante No "+(f+1)+" en el mes "+(p+1)+" fue de "+prom);
             System.out.println("--------------------------------------------------------------------------");
             prom=0.0;
             a=0.0;     
            }    
        }
        for (int p = 0; p < n; p++) {
        for (int f = 0; f < 30; f++) {
            for (int c = 0; c < 5; c++) {
                    System.out.print(notas[f][c][p]+" ");
                }
                System.out.print(" "); 
            }
            System.out.println(" ");
        }
    }
}