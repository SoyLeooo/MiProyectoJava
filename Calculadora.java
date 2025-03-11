public class Calculadora {

    // Método para sumar dos números
    public double sumar(double a, double b) {
        return a + b;
    }

    // Método para restar dos números
    public double restar(double a, double b) {
        return a - b;
    }

    // Método para multiplicar dos números
    public double multiplicar(double a, double b) {
        return a * b;
    }

    // Método para dividir dos números
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        double num1 = 10;
        double num2 = 5;

        System.out.println("Suma: " + calc.sumar(num1, num2));
        System.out.println("Resta: " + calc.restar(num1, num2));
        System.out.println("Multiplicación: " + calc.multiplicar(num1, num2));
        System.out.println("División: " + calc.dividir(num1, num2));
    }
}

