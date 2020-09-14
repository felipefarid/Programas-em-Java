import java.util.Scanner;

public class Exercicio60 {
    
    public static void main(String args[]) {
        System.out.println("MEdia aritimetica ou ponderada de 4 numeros");
        Scanner scanner = new Scanner(System.in);
        int x [] = new int[5];
        int y = 0;

        while (y < 4){
            x[y] = scanner.nextInt();
            y++;

        }
        y = 0;
        int g = 0;
        while (y != x.length){
            g = x[y] + g;
            y++;
        }
          
       g = g / 5;
       System.out.println("Media aritimetica : " + g);



        scanner.close();


    }
    
}
