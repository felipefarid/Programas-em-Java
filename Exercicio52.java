import java.util.Scanner;

public class Exercicio52 {
    
    public static void main(String args[]) {
        System.out.println("Digite M ou H para receber masculino ou feminino");
        Scanner scanner = new Scanner(System.in);
        String y = scanner.nextLine();
        String x = y.toUpperCase();
         
        if(x.equals("M")){
            System.out.println("Mulher");
        }
        else if(x.equals("H")){
            System.out.println("Homem");
        }
        else {
            System.out.println("Erro");
        }
       
       

        scanner.close();


    }
    
}
