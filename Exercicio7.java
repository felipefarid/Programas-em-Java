import java.util.Scanner;

public class Exercicio7 {
    
    public static void main( String args[]) {
        System.out.println("Desenvolva um algoritmo que receba três números e os ordene em forma ascendente( do menor para o maior).");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        if ( x > y && y > z) System.out.println("X > y > z");
        if ( y > x && x > z) System.out.println("y > x > z");
        if ( z > x && x > y) System.out.println("z > x > y");
        if ( x > y && y < z) System.out.println("X > z > y");
        if ( y < z && y > x) System.out.println("z > y > x");
        if ( y > z && z > x) System.out.println("y > z > x");
         
        
          
       
       

        scanner.close();


    }
    
}
