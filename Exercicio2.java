import java.util.Scanner;

public class Exercicio2 {
    
    public static void main( String args[]) {
        System.out.println("Desenvolva um Algoritmo que receba um número do usuário e mostre na tela se ele é par ou ímpar");
        Scanner scanner = new Scanner(System.in);
        int y = 0;


        while (y == 0){
            System.out.println("Digite o número");
            int x = scanner.nextInt();
            if (x % 2 == 0){
            System.out.println("O numero é par");
            }else System.out.println("O numero é impar"); 

            System.out.println("Pressione 0 para outro numero");
            y = scanner.nextInt();
        }
        
          
       
       

        scanner.close();


    }
    
}
