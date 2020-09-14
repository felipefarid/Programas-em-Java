import java.util.Scanner;

public class Exercicio41 {
    
    public static void main(String args[]) {
        System.out.println("Media de moradores");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos moradores?");
        int x = scanner.nextInt();
        int y = 0;
        String Nome[] = new String[x +1];
        float Altura[] = new float[x];
        int Idade[] = new int[x];
        String Sexo[] = new String[x +1];
        
        

        while ( y != x){

            System.out.println("Digite seu nome");            
            String A = scanner.nextLine();
            Nome[y] = A;
            System.out.println("Sua Altura");
            float B = scanner.nextFloat();
            Altura[y] = B;
            System.out.println("Sua Idade");
            int C = scanner.nextInt();
            Idade[y] = C;
            System.out.println("Seu Sexo");
            String D = scanner.nextLine();
            Sexo[y] = D;
            
             y ++;
        }   
            float ga = 0;
            while (y != x){
                float g = Altura[y];
                if(g > ga){
                    ga = g;
                }
            }
            
            System.out.println("A Maior altura é : " + ga);



          
       
       

        scanner.close();


    }
    
}
