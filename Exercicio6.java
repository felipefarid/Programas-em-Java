import java.util.Scanner;

public class Exercicio6 {
    
    public static void main(String args[]) {
        System.out.println("Desenvolva um algoritmo para receber um número do usuário e verifique e mostre na tela se ele é ou não divisível por 2.");
        Scanner scanner = new Scanner(System.in);


        int x = scanner.nextInt();
       
        if (x % 2 == 0) System.out.println("É Divisivel por 2");
        else System.out.println("Não é divisivel por 2");
          
       
       

        scanner.close();


    }
    
}
