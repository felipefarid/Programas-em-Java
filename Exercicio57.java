import java.util.Scanner;

public class Exercicio57 {
    
    public static void main(String args[]) {
        System.out.println("Veja se é divisivel por 5");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x % 5 == 0 ){
            System.out.println("É divisivel por 5");
        }
          
       
       

        scanner.close();


    }
    
}
