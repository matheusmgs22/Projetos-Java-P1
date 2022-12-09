import java.util.Scanner;

public class condicionais {
  public static void main(String[] args){

    Scanner in = new Scanner (System.in);

    int podeVotar, naoPode;
    int idade;

    System.out.println("Diga sua idade: ");
    idade = in.nextInt();
    

    if( idade >= 16 ) {

        System.out.println("Está pessoa tem " + idade + " anos e pode votar");

    } else {
        System.out.println("Está pessoa tem " + idade + " anos e NÃO Pode votar");

    }



  }
    
}
