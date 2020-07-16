using System;

namespace arreglos
{
    class matrices
    {
        static void Main(string[] args)
        {
        int m=0;
        Double sujeto=0.0,a=0.0;
        Double[,] notas=new Double[30,4];
        for(int f=0;f<30;f++){
            for(int c=0;c<4;c++){
                if(c==0){
                    Console.WriteLine("Dgite la nota de Estructura de datos del estudiante N° "+(f+1));
                }else{
                    if(c==1){
                        Console.WriteLine("Dgite la nota de Matematica discreta del estudiante N° "+(f+1));                       
                    }else{
                        if(c==2){
                            Console.WriteLine("Dgite la nota de Algebra lineal del estudiante N° "+(f+1));
                        }else{
                            Console.WriteLine("Dgite la nota de Fisica III del estudiante N° "+(f+1));                            
                        }
                    }
                }
                while(m !=1){
                    sujeto= Convert.ToDouble(Console.ReadLine());
                       if(sujeto >=0 && sujeto <=5.0){
                           notas[f,c]=sujeto;
                           m=1;
                           a= a + notas[f,c];
                       }else{
                           Console.WriteLine("ingreso mal la nota, repetir");
                       }
                   }
                   m=0;
            }
        } 
        Console.WriteLine("                Estructura de datos           Matematica discreta           Algebra lineal                Fisica III");
        for(int f=0;f<30;f++){
            Console.Write("Estudiante N°"+(f+1)+": ");
            for(int c=0;c<4;c++){
                Console.Write(" "+notas[f,c]+"                           ");
            }

            Console.WriteLine(" ");
        } 
        }
    }
}
