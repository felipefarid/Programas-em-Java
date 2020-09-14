import java.util.Scanner;

public class Exercicio12 {
    
    public static void main(String args[]) {
        System.out.println("Digite 2 notas do primeiro bimestre com a priemira peso 3 e a sgunda peso 7");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int z = scanner.nextInt();
        int w = (z + x / 3);
        System.out.println("Digite 2 notas do segundo bimestre com a priemira peso 3 e a sgunda peso 7");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int y = (a + b / 3);

        int t = (w + y) / 2;

        System.out.println(t);

          
       
       

        scanner.close();


    }
    
}
