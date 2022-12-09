import java.util.Scanner;

public class condicionaisComposta3 {
    
    public static void main (String[] args){

        Scanner in = new Scanner (System.in);

        double a,b,c;
        double segmento1, segmento2, segmento3;

        System.out.println("Informe o valor do Primeiro segmento de reta:" );
        a = in.nextDouble();
        System.out.println("Informe o valor do Segundo segmento de reta:" );
        b = in.nextDouble();
        System.out.println("Informe o valor do Terceiro segmento de reta:" );
        c = in.nextDouble();

        segmento1 = a + b;
        segmento2 = a + c;
        segmento3 = c + b;
        
        while ( (segmento1 < c) ||  (segmento2 < b) || (segmento3 < a) ){

            System.out.println(" Valores incorretos, informe outros valores para os segmentos:" );
            a = in.nextDouble();
            b = in.nextDouble();
            c = in.nextDouble();
        }

        System.out.println(" Valores corretos, é possivel formar um Triângulo: " );
        if ( a == b && b == c && a == c ) {

            System.out.println(" É um Triangulo Equilatero. " );

        } else if ( a == b || b == c || a == c){

            System.out.println(" É um Triangulo Isósceles. " );

        } else {

            System.out.println(" É um Triangulo Escaleno " );

        }

       
    }

}
