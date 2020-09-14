import java.util.Scanner;



public class Exercicio58 {
    
    public static void main(String args[]) {
        System.out.println("Somar = 1, multiplicar = 2, dividir = 3 e subtrair = 4. Digite a opção, depois os numeros");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        float y = scanner.nextInt();
        float z = scanner.nextInt();
        if (x == 1){
            System.out.println(y + z);
        }
        if (x == 2){
            System.out.println(y * z);
        }
        if (x == 3){
            while (true){
            if (z == 0){
                System.out.println("não divide por 0");
                break;
            }}
            System.out.println(y / z);
        }
        if (x == 4){
            System.out.println(y - z);
        }
        
        
          
       
       

        scanner.close();


    }
    
}
