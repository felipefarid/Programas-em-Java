

import java.util.Scanner;

public class Exercício26 {
    
    
    
    public static void main( String[] args)    { 
        
        int numero1,numero2,soma;
        
        Scanner input = new Scanner( System.in ); 
        
            System.out.print( " Digite  o primeiro numero: ");
            numero1 = input.nextInt();
            System.out.print( " Digite  o segundo numero: "); 
            numero2 = input.nextInt();          
            soma = numero1 + numero2 ;
            System.out.printf("O resultado da soma é %\n"+soma);
            input.close();
    }
    
}
