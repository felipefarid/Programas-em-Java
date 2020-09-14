import java.util.Scanner;

public class Exercicio3 {
    
    public static void main(String args[]) {
        System.out.println("Desenvolva um algoritmo que verifica se a senha digitada pelo usuário é a senha correta .(Utilize a senha 4433).");
        Scanner scanner = new Scanner(System.in);
        
        int y = 0;

        while ( y != 4433){
            System.out.println("Digite a senha!");
            y = scanner.nextInt();
            if (y != 4433) System.out.println("Senha errada.");
            else System.out.println("Liberado");

        }
        
          
       
       

        scanner.close();


    }
    
}
