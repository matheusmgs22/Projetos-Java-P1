import java.util.Scanner;

public class condicionaisComposta4 {
    
    public static void main (String[] args){

        Scanner in = new Scanner (System.in);

        double a,b,c;

        System.out.println("Informe o Primeiro número real: ");
        a = in.nextDouble();

        System.out.println("Informe o Segundo número real: ");
        b = in.nextDouble();
        
        System.out.println("Informe o Terceiro número real: ");
        c = in.nextDouble();

        while ( a == b || b == c || c == a) {

            System.out.println("Números Inválidos, digite números reais diferentes entre si.");

           System.out.println("Informe o Primeiro número real: ");
            a = in.nextDouble();

            System.out.println("Informe o Segundo número real: ");
            b = in.nextDouble();
        
            System.out.println("Informe o Terceiro número real: ");
            c = in.nextDouble();

        }

        if (a>= b && a>=c) {

            System.out.println("O número " + a + " é o maior número real. ");


        } else if (b>= a && b>=c){

            System.out.println("O número " + b + " é o maior número real. ");

        } else {

            System.out.println("O número " + c + " é o maior número real. ");


        }
    }

}