import java.util.Scanner;

public class Exercicio4 {
    
    public static void main(String args[]) {
        System.out.println("Desenvolva um algoritmo que receba do usuário a letra correspondente ao sexo M - Masculino / F - Feminino, se o usuário digitar algo que não seja F ou M mostrar que o conteúdo digitado é inválido.");
        Scanner scanner = new Scanner(System.in);
        

        while (true){
        System.out.println("Digite o sexo, M ou F");
        String x = scanner.nextLine();

        
        if ((x.equals("M")) ||  (x.equals("F"))){break;}
        else{System.out.println("Favor digitar apenas M ou F");}
        }
        
       
        

          
       
       

        scanner.close();


    }
    
}
