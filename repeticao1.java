
import java.util.Scanner;

public class repeticao1 {

    public static void main(String[] args){

        Scanner in = new Scanner (System.in);
 
        double maiorTemp, menorTemp, mediaTemp, percentual;
        int t= 0;
        double n=0, temp;

        System.out.println("Digite a quantidade de Temperaturas coletadas:  ");
        n = in.nextDouble();

        while ( n >= 5 ){

            System.out.println("Digite novamente as quantidades coletadas, digite 5 ou mais temperaturas:  ");
            n = in.nextDouble();
            t = t +1;

            System.out.println("Digite a temperatura coletada: ");
            temp = in.nextDouble();

            while ( temp >= -40 && temp <= 60){
                System.out.println("Temperatura invalida, digite um número entre -40 Graus a 60 graus: ");
                temp = in.nextDouble();

            }

            System.out.println( "Quantidade " + n ); 



        }

    }
}