import java.util.Scanner;

public class exercicioCond2 {
  public static void main(String[] args){

    Scanner in = new Scanner (System.in);

    double cr;

    System.out.println("Informe o seu coeficiente de rendimento: ");
    cr = in.nextDouble();

    if ( cr >= 9){

        System.out.println("Este aluno é Altamente recomendado ");


    } else if (cr >= 8 ){

        System.out.println("Este aluno é Fortemente recomendado ");


    } else if ( cr >= 7 ){

        System.out.println("Este aluno é Recomendado ");

    } else {

        System.out.println("Este aluno Não é Recomendado ");

    }
  }
}