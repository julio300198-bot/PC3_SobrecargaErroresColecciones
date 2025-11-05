package pregunta_2;

public class Calculadora {

    // Método sumar que recibe dos enteros
    public int sumar(int a, int b) {
        // Retorna la suma de dos números enteros
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public double sumar(double a, double b) {
        // Retorna la suma de dos números de tipo double
        return a + b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int resultado1 = calc.sumar(5, 10);
        System.out.println("Suma de dos enteros (5 + 10): " + resultado1);

        int resultado2 = calc.sumar(3, 7, 2);
        System.out.println("Suma de tres enteros (3 + 7 + 2): " + resultado2);

        double resultado3 = calc.sumar(4.5, 3.2);
        System.out.println("Suma de dos doubles (4.5 + 3.2): " + resultado3);
    }
}
