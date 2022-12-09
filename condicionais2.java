import java.util.Scanner;

public class condicionais2 {
  public static void main(String[] args){

    Scanner in = new Scanner (System.in);
    
    double nota1,nota2, media;

    System.out.println("Digite sua Primeira Nota: ");
    nota1 = in.nextDouble();

    System.out.println("Digite sua Segunda Nota: ");
    nota2 = in.nextDouble();

    media = (nota1 + nota2) / 2;

    if ( media >= 7 ) {

        System.out.println("O aluno obteve média " + media + " e está Aprovado");

    } else if (media >=3  ) { 

        System.out.println("O aluno obteve média " + media + " e está de recuperacão ");
           
    } else if ( media < 3){

        System.out.println("O aluno obteve média " + media + " e está REPROVADO"); 
    }


    }
}