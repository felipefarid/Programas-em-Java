import java.util.Scanner;

public class Exercicio50 {
    
    public static void main(String args[]) {
        System.out.println("Digite um numero para saber os multiplos de 2, 3, 4, 5");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = 0;
        
        while (y != x){
            if(y % 2 == 0){
                System.out.println("Multiplo de 2 = "+ y);
            }            
            if(y % 3 == 0){
                System.out.println("multiplo de 3 = "+ y);
            }
            if(y % 5 == 0){
                System.out.println("Multiplo de 5 = " + y);
            }
            y++;
        }
          
       
       

        scanner.close();


    }
    
}
