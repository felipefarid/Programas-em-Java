import java.util.Scanner;

public class Exercicio55 {
    
    public static void main(String args[]) {
        System.out.println("Classifique o filme com nota de 0 - 5");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if(x == 1){
            System.out.println("Pessimo");
        }
        if(x == 2){
            System.out.println("Ruim");
        }
        if(x == 3){
            System.out.println("Regular");
        }
        if(x == 4){
            System.out.println("Bom");
        }
        if(x == 5){
            System.out.println("Exelente");
        }
        if(x == 0 || x > 5){
            System.out.println("error");
        }
       
       

        scanner.close();


    }
    
}
