import java.util.Scanner;


public class Exercicio53{
    
    public static void main(String args[]) {
        System.out.println("Transforma numeros para inglês .-.");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if(x == 1){
            System.out.println("One");
        }
        if(x == 2){
            System.out.println("Two");
        }
        if(x == 3){
            System.out.println("Tree");
        }
        if(x == 4){
            System.out.println("Four");
        }
        if(x == 5){
            System.out.println("Five");
        }
        if(x == 6){
            System.out.println("Six");
        }
        if(x == 7){
            System.out.println("Seven  ");
        }
        if(x ==8){
            System.out.println("Eight");
        }
        if(x == 9){
            System.out.println("Nine");
        }
        if(x == 10){
            System.out.println("Ten");
        }
        if(x == 0 || x > 10){
            System.err.println("Não deu");
        }
          
       
       

        scanner.close();


    }
    
}
