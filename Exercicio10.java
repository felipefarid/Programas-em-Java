import java.util.Scanner;

public class Exercicio10{
    
    public static void main(String args[]) {
        System.out.println("Digite a nova para ver se passou ou não");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x >= 60){
            System.out.println("passou");
        }else{
            System.out.println("não passou");
        }
          
       
       

        scanner.close();


    }
    
}
