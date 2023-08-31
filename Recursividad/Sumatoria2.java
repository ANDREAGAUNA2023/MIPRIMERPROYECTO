import java.util.Scanner;

public class Sumatoria2 {
    
    public static int sumatoria(int n) {

        if (n <= 0)

            return 0;

         else {

            return n + sumatoria(n - 1);
        }
    }

    public static void main(String[] args) {

        int num = 5;

        int resultado = sumatoria(num);

        System.out.println ("La sumatoria de los enteros " + num + " es: " + resultado);
    }
}