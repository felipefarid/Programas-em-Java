import java.util.Scanner;

public class Exercicio56 {
    
    public static void main(String args[]) {
        System.out.println("Veja se o numero é impar ou par");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if(x % 2 == 0){
            System.out.println("Par");
        }
        if(x %2 != 0){
            System.out.println("Ímpar");
        }
        
          
       
       

        scanner.close();


    }
    
}
