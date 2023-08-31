import java.util.Scanner;

public class Division3{

    public static int division(int dividendo,int divide){
        int resultado;
        
        if(dividendo<divide)
            resultado=0;
        else{
            
            dividendo= dividendo - divide;
            
            resultado= 1+division(dividendo,divide);
        }
        return resultado;
    }

    public static int division(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Insert the dividendo: ");
        int dividendo= scanner.nextInt();
        System.out.println("Insert the divide: ");
        int divide= scanner.nextInt();
        int result=0;
        while(dividendo>=divide){
            dividendo= dividendo-divide;
            resultado++;
        }
        return resultado;
    }

    public static void main(String[] args) {

        System.out.println(division(20, 3));

        System.out.println(division());
    }
}