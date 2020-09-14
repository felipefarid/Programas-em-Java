

public class Exercicio43 {
    
    public static void main(String args[]) {
        System.out.println("0 - 100 pares primos e ímpares");
        

          System.out.println("Pares");

          for(int x = 0; x != 100; x ++){
            if (x % 2 == 0){
                System.out.println(x);
            }
          }

          System.out.println("Ímpares");
          for(int x = 0; x != 100; x ++){
              if(x % 2 != 0){
                System.out.println(x);
              }
          }
          int i;
          System.out.println("Primos");
          for(int x = 2; x != 100; x++){
            for(i = 2; i <= x/2; i++){
            if(x % i ==0)
            {
            break;
            }
            }
            if(i > x/2){System.out.println(x);}
             
            }
       
       

       


    }
    
}
