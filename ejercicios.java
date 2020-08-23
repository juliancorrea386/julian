class Ejercicio {
    public Ejercicio() {
    }
//Triangulo de Sierpinski
    public int Sierpinski(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return (Sierpinski(n + 1) / 3);
        } else {
            return 3 * (Sierpinski(n - 1));
        }
    }
//Ejercicio de Torre de Hanoi
    public void Hanoi(int n, int torre_inicial, int torre_auxiliar, int torre_final) {
        if (n == 1) {
            System.out.println(torre_inicial + "->" + torre_final);
        } else {
            Hanoi(n - 1, torre_inicial, torre_final, torre_auxiliar);
            System.out.println(torre_inicial + "->" + torre_final);
            Hanoi(n - 1, torre_auxiliar, torre_inicial, torre_final);
        }
    }

    public static void main(final String[] args) {
        Ejercicio p1 = new Ejercicio();
        //Ejecutador de sierpinski
        System.out.println("Hay "+p1.Sierpinski(3)+" triangulos en el Triangulo de sierpinski");
        //Ejecutador de Hanoi
        //p1.Hanoi(3, 1, 2, 3);
        //Integrantes: Julian Andres Correa, Oscar Antonio Ramos Yate, Michell Artunduaga Parra
    }
}
