import java.util.Scanner;

public class Exercicio44 {
    
    public static void main(String args[]) {
        System.out.println("idade e altura de X pessoas");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas pessoas?");
        int x = scanner.nextInt();
        float Altura[] = new float[x];
        int Idade[] = new int[x];
        int y = 0;

        while (y != x){
            System.out.println("Digite a idade");            
            Idade[y] =  scanner.nextInt();
            System.out.println("Digite a Altura");
            Altura[y] = scanner.nextFloat();
            y++;
        };
          
        
        int Altura185 = 0;
        
        while (y != x){
        if(Altura[x] >= 1.85){
            Altura185 = Altura185 + 1  ; 
        }
         
        }
       

        int g = Altura185 * 100 / x;
        System.out.println("% de pessoas com mais de 1,85 de altura = " + g);

        y = 0 ;

        float media = 0;
        while (y != x) {
            if( Idade[y]>=40 ){
                media = Altura[y] + media;

            }
        }

        float d = media / x;

        System.out.println("A média de altura de altura de pessoas com mais de 40 anos de idade = " + d);

        y = 0;
        float altura150 = 0;
        while ( y != x){
            if (Altura[y] <= 1.50){
                altura150 = altura150 +1;

            }
        }

        float r = altura150 * 100 / x;

        System.out.println("% de pessoas com menos de 1.50 = " + r);

        scanner.close();


    }
    
}
