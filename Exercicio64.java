import java.util.Scanner;

public class Exercicio64 {
    
    public static void main(String args[]) {
        System.out.println("Digite a nota para conversão");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        
        if (x < 50){
            System.out.println("D");
        }
        if(x >= 50 && x < 70 ){
            System.out.println("C");
        }
        if( x >= 70 && x < 90){
            System.out.println("B");
        }
        if( x >= 90 && x <= 100){
            System.out.println("A");
        }
          
        if (x < 0 && x > 100){
            System.out.println("Erro");
        }
       
       




        scanner.close();


    }
    
}
