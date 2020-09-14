

public class Exercicio40 {
    
    public static void main(String args[]) {
        System.out.println("Tabuada do 1 ao 20");
        float x = 1;
        float y = 1;
          
       while (y != 21){
           for(x = 1; x != 11; x++){

            System.out.println(x +"x"+ y+ "="+ x * y);
                      
           }
           y ++;
       }
       y = 1;
       while (y != 21){
        for(x = 1; x != 11; x++){

         System.out.println(x +"+"+ y+ "="+ (x + y));
                   
        }
        y ++;
    }
    y = 1;
    while (y != 21){
        for(x = 1; x != 11; x++){

         System.out.println(x +"-"+ y+ "="+ (x - y));
                   
        }
        y ++;
    }
    y = 1;
    while (y != 21){
        for(x = 1; x != 11; x++){

         System.out.println(x +"/"+ y+ "="+ (x / y));
                   
        }
        y ++;
    }
       
       

        


    }
    
}
