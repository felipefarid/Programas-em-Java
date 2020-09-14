import java.util.Scanner;

public class Exercicio17 {
    
    public static void main(String args[]) {
        System.out.println(" f(x) = 2/2*x-18  ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de x");
        float x = scanner.nextInt();

        x = 2 * x - 18 ;

      
        x = x / 2;

        System.out.println(x);
        
          
        
       

        scanner.close();


    }
    
}
