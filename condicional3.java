import java.util.Scanner;

public class condicional3 {
  public static void main(String[] args){

    Scanner in = new Scanner (System.in);
  
    double a,b,c;
    double x1,x2,delta, conta1;

    System.out.println("Informe o valor de A: ");
    a = in.nextDouble();

    System.out.println("Informe o valor de B: ");
    b = in.nextDouble();

    System.out.println("Informe o valor de C: ");
    c = in.nextDouble();

        delta = Math.pow(b,2) - 4 * a * c;
    

    if (delta < 0) {

        System.out.println(" Não existe raiz real. ");

    } else if (delta == 0 ) {
        conta1 = -(b)/ 2*a;

        System.out.println(" Então x1 = x2 =  " + conta1);

    } else if (delta > 0){

    
    x1 = -b + Math.sqrt(delta) / 2 * a;

    x2 = -b - Math.sqrt(delta) / 2 * a;

    System.out.println(" Então x1 =" + x1 + " e  x2 = " + x2);

    }

    }
}