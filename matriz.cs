using System;

namespace arreglos
{
    class matriz
    {
        static void Main(string[] args)
        {
        int n=0,m=0;
        Double sujeto,a=0.0,prom=0.0;
        Console.WriteLine("Digite los meses a registrar");
        n=Convert.ToInt32(Console.ReadLine());
        Double [,,]notas=new Double[30,5,n];
        for (int p = 0; p < n; p++) {
            Console.WriteLine("Notas del mes "+(p+1));
        for (int f = 0; f < 30; f++) {
            for (int c = 0; c < 5; c++) {        
                if(c==0){
                   Console.WriteLine("Dgite la nota de Estructura de datos del estudiante N° "+(f+1));
                }else{
                    if(c==1){
                        Console.WriteLine("Dgite la nota de Matematica discreta del estudiante N° "+(f+1));                       
                    }else{
                        if(c==2){
                            Console.WriteLine("Dgite la nota de Algebra lineal del estudiante N° "+(f+1));
                        }else{
                            if (c==3) {
                                Console.WriteLine("Dgite la nota de Fisica III del estudiante N° "+(f+1));   
                            }else{
                                Console.WriteLine("Dgite la nota de Ingles I del estudiante N° "+(f+1));

                            }                             
                        }
                    }
                }
                while(m !=1){
                    sujeto= Convert.ToDouble(Console.ReadLine());
                       if(sujeto >=0 && sujeto <=5.0){
                           notas[f,c,p]=sujeto;
                           m=1;
                           a=notas[f,c,p]+a;
                       }else{
                           Console.WriteLine("ingreso mal la nota, repetir");
                       }
                   }
                   m=0;
                }
             prom=a/2;
             Console.WriteLine("--------------------------------------------------------------------------");
             Console.WriteLine("el promedio del estudiante No "+(f+1)+" en el mes "+(p+1)+" fue de "+prom);
             Console.WriteLine("--------------------------------------------------------------------------");
             prom=0.0;
             a=0.0;     
            }    
        }
        for (int p = 0; p < n; p++) {
        for (int f = 0; f < 30; f++) {
            for (int c = 0; c < 5; c++) {
                    Console.Write(notas[f,c,p]+" ");
                }
                Console.Write(" "); 
            }
            Console.WriteLine(" ");
        }
    }
    }
}
