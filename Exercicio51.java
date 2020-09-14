import java.util.Scanner;

public class Exercicio51 {
    
    public static void main(String args[]) {
        System.out.println("Digite um numero para saber o mês");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if(x == 1){
            System.out.println("Janeiro");
        }
        if (x == 2) {
            System.out.println("Fevereiro");
        }
        if( x == 3){
            System.out.println("Março");
        }
        if (x == 4){
            System.out.println("Abril");
        }
        if (x == 5){
            System.out.println("Maio");
        }
        if (x == 6){
            System.out.println("Junho");
        }
        if( x == 7){
            System.out.println("Julho");
        }
        if(x == 8){
            System.out.println("Agosto");
        }
        if(x == 9){
            System.out.println("Setembro");
        }
        if(x ==10){
            System.out.println("Outubro");
        }
        if(x == 11){
            System.out.println("Novembro");
        }
        if(x == 12){
            System.out.println("Desembro");
        }
        if(x == 0 || x > 12){
            System.out.println("Numero errado");
        }
        scanner.close();


    }
    
}
