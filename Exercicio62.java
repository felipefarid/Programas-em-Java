import java.util.Scanner;

public class Exercicio62 {
    
    public static void main(String args[]) {
        System.out.println("Graus em Celcius para Fahrenheit ou Kelvin, Digite em Celcius");
        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextFloat();
        float y = (x * 9/5) + 32 ;
        float z = (float) (x + 273.15);

        System.out.println("Fahrenheit : " + y + " Kelvin :" + z);
          
       
       

        scanner.close();


    }
    
}
