import java.util.Scanner;

public class Exercicio65 {
    
    public static void main(String args[]) {
        System.out.println("Digite a idade para saber a referencia");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
           
        if (x <= 3){
            System.out.println("BEBE");
        }
        if(x >= 4 && x <= 10 ){
            System.out.println("CRIANÇA");
        }
        if( x >10  && x <= 18){
            System.out.println("ABORRECENTE");
        }
        if( x > 18 && x <= 55){
            System.out.println("ADULTO");
        }
          
        if (x > 56){
            System.out.println("Veio");        }
        if (x < 0) {
            System.out.println("Que isso");
            
        }
          
       
       

        scanner.close();


    }
    
}
