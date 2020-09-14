import java.util.Scanner;

public class Exercicio11 {
    
    public static void main(String args[]) {
        System.out.println("Digite a nota do primeiro semestre e do segundo");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = (x + y) / 2;
        if (z <= 30){
            System.out.println("Reprovado");
        }if(z > 30 && z < 60){
            System.out.println("Exame");

        }
        else System.out.println("Aprovado");
       
       

        scanner.close();


    }
    
}
