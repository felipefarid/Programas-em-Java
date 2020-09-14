

import java.text.DecimalFormat;


public class Exercicio49 {
    
     public static void main(String[] args) {
    
	DecimalFormat df = new DecimalFormat("#.####");
	if (args[1].equals("cm")){
	System.out.println(df.format(Double.parseDouble(args[0])/2.54) + (" polegadas"));
	}
	if (args[1].equals("polegadas")){
		System.out.println(df.format(Double.parseDouble(args[0])*2.54) + (" centimetros"));
		
        
        
	}
    
     }
    
   }
 
