import java.util.Scanner;

public class Números {

    public static void main(String args[]){
        Scanner on= new Scanner(System.in);
        int a;
        int b;
        int c;

        System.out.println("Ingrese el primer número");
        int a= on.nextInt();
        System.out.println("Ingrese el segundo número");
        int b= on.nextInt();
        System.out.println("Ingrese el tercer número");
        int c= on.nextInt();

        if (a>b && a>c)
            System.out.println("a es mayor");
        else{
            if(b>c)
                System.out.println("c es menor");
            else{
                if (b>a && b>c)
                    System.out.println("b es mayor");
                else{
                    if(c>a)
                        System.out.println("a es menor");
                    else{
                        if(c>a && c>b)
                            System.out.println ("c es mayor");
                        else{
                            if (a>b)
                                System.out.println("b es menor");
                        }
                    }
                }
            }
        }
    }
}
