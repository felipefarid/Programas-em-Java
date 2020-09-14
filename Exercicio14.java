import java.util.Scanner;

public class Exercicio14 {
    
    public static void main(String args[]) {
        System.out.println("Digite o salário para saber a % de emprestimo");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x <= 500){
            System.out.println("5%");
        }
        if (x > 500 && x <= 1000 ){
            System.out.println("10%");
        }
        if (x > 1000 && x <= 2000 ){
            System.out.println("20%");
        }
        if (x > 2000 && x <= 3000){
            System.out.println("30%");
        }
        if (x > 3000 ){
            System.out.println("40%");
        }
       

        scanner.close();


    }
    
}
