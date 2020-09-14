import java.util.Scanner;

public class Exercicio59 {
    
    public static void main(String args[]) {
        System.out.println("Digite X numeros para saber o maior");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = 0;
        int z[]= new int[x +1];
       while (y < x){
        z[y] = scanner.nextInt();
        y++;
       }
       y = 0;
       int g = 0;
       while ( y < x){   
       int a = Math.max(z[y], z[x]);
       if(a > g){
           g = a;
       }
       y++;
       }
       
       System.out.println("o maior num digitado foi: " + g);
        scanner.close();


    }
    
}
