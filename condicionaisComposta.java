import java.util.Scanner;

public class condicionaisComposta {
  public static void main(String[] args){

    Scanner in = new Scanner (System.in);


    double numeroReal;

    System.out.println("Digite um número Real, entre 1 e 100: ");
    numeroReal = in.nextDouble();

    while (numeroReal < 1 || numeroReal > 100) {
        
        System.out.println("O valor não está dentro da faixa permitida, digite um valor entre 1 a 100: ");
        numeroReal = in.nextDouble();

        }

        System.out.println("O valor está dentro da faixa permitida. ");


    }

  }

  