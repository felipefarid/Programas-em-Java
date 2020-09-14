import java.util.Scanner;

public class Exercicio54 {
    
    public static void main(String args[]) {
        System.out.println("Veja se é vogal");
        Scanner scanner = new Scanner(System.in);
        String vogal = scanner.nextLine();
        vogal = vogal.toUpperCase();

        if(vogal.equals("A") || vogal.equals("E") || vogal.equals("I") || vogal.equals("O") || vogal.equals("U") ){
            System.out.println("É uma vogal");
        }
          
       
       

        scanner.close();


    }
    
}
