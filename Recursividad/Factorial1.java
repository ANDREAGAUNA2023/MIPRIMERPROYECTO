import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese el numero a factorizar");
        numero=scanner.nextInt();
        int n=FactorialRecur(numero);
        System.out.println("Resultado: "+a);
    }
}
//---------------------
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero,i,a;

        System.out.println("Ingrese el numero a factorizar ");
        numero=scanner.nextInt();
        a=1;
        for (i=numero;i>0;i--){
                a = a* i;
        }
        System.out.println("Resultado: "+a);
    }
}