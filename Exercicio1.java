import java.util.Scanner;

public class Exercicio1 {
    
    public static void main(String args[]) {
        System.out.println("Desenvolva um Algoritmo que receba dois números do usuário e mostre na tela qual dos dois números escolhidos é maior");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
          
       
        if (x > y){
            System.out.println(" O Primeiro numero é maior");
        }else System.out.println("O Segundo numero é maior");

        scanner.close();


    }
    
}
