import java.util.Scanner;


public class Exercicio9 {
    public static void main(String args[]) {
        System.out.println("Desenvolva um algoritmo que receba dois números do usuário e crie a opção de escolha somar ou subtrair esses dois números um do outro e mostrar o resultado.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite quantas notas serão aplicadas");
        int x = scanner.nextInt();
        int y = 0;
        int z,w;
        z = 0;
        w = 0;
        
        int lista[] = new int[x];
        while( y !=  x  ){
        System.out.println("Digite a nota de numero:" + (x - x + y + 1));
        z = scanner.nextInt();
        lista[y] = z;
        y = y +1;}

        z = 0;    

        while (w != x){
            z = lista[w] + z;
            w ++;

        }
        
        z = z / x;
        
        System.out.println(z);



        
       
       
       

        scanner.close();


    }
    
}
