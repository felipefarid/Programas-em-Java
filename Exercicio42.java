import java.util.Scanner;



public class Exercicio42 {
    
    public static void main(String args[]) {
        System.out.println("Desenvolva um programa que receba x números, calcule e mostre: A soma dos números digitados // A quantidade de números pares digitados // A média dos números digitados // O maior numero impar digitado // O menor número digitado entre todos // A percentagem de números ímpares digitados.");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        float y[] = new float[x];
        int z = 0 ;
        float soma = 0;
        while (z != x){
            y[z] = scanner.nextFloat();
            soma = y[z] + soma;
            z++;
        }
        System.out.println("A soma dos numeros é: " + soma);

        z = 0;
        int par = 0;
        while (z != x){
            if(y[z] % 2 == 0){
                par = par + 1;
            }
            z++;
        }

        System.out.println("A quantidade de numeros par é : " + par);
          
       soma = soma / x;
    
       System.out.println("A media é : " + soma);

       z = 0;
       int impar = 0;
       while (z != x){
        if(y[z] / 2 != 0){
            impar = impar +1;
        }
        z++;
       }
       z = 0;
       float g, ga = 0;
       while(z != x){
        g = y[z];
        if(g > ga){
            ga = g;
        }
        z++;
       }
       System.out.println("O maior numero digitado foi: " + ga);
        

        z = 0;
       float t = 0, ta = 999999999;
       while(z != x){
        g = y[z];
        if(t < ta){
            ta = t;
        
        }
        z++;
        }

        System.out.println("O menor valor digitado foi: " + ta);

        int F = impar * 100 / x;

        System.out.println("% de numeros ímpares: " + F);

        scanner.close();

    }
    
}
