import java.util.Scanner;

public class Exercicio5 {
    
    public static void main(String args[]) {
        System.out.println("Desenvolva um algoritmo que receba um número do usuário e verifique se esse número está entre 25 e 70 ( 25 e 70 incluídos) se sim mostrar na tela que o número está entre eles, se não mostrar para o usuário que eles não estão entre eles.");
        Scanner scanner = new Scanner(System.in);


        

        while (true){
            System.out.println("Digite um numero entre 25 e 70");
        int x = scanner.nextInt();
        
            if (x > 24 && x < 71)break;
            else System.out.println("Digite novamente");

        }
          
       
       

        scanner.close();


    }
    
}