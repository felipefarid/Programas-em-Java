
import java.util.Scanner;


public class Exercicio15 {
    
    public static void main( String[] args)    { 
        

                        Scanner entrada;
                        int idade;
                        entrada = new Scanner(System.in);
                       
                       
                        System.out.println("Informe a idade do nadador:");
                        idade = entrada.nextInt();
                       
                       
                        if(idade < 7){
                        System.out.println("O atleta nao pode participar, idade abaixo da minima permitida.");
                        }
                        if(idade >= 7 && idade <= 12){
                        System.out.println("O atleta tem " + idade + " anos,\n ele está na categoria INFANTIL ");
                        }
                        if(idade > 12 && idade <= 16){
                        System.out.println("O atleta tem " + idade + " anos,\n ele está na categoria JUVENIL I");
                        }
                        if(idade > 17 && idade <= 18){
                        System.out.println("O atleta tem " + idade + " anos,\n ele está na categoria JUVENIL II");
                        }
                        if(idade > 19 && idade <= 31){
                        System.out.println("O atleta tem " + idade + " anos,\n ele está na categoria PROFISSIONAL");
                        }
                        if(idade > 32 && idade <= 41){
                        System.out.println("O atleta tem " + idade + " anos,\n ele está na categoria SÊNIOR");
                        }
                        if(idade > 42){
                        System.out.println("O atleta tem " + idade + " anos,\n ele está na categoria MASTERS");
                        
                        entrada.close();
                   }
         
         }
    
}
          
                         
        
    

