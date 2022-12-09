import java.util.Scanner;

public class condicional4 {
  public static void main(String[] args){

    Scanner in = new Scanner (System.in);
  
    double salarioAtual,novoSalario, soma1, soma2, soma3, soma4;
    double porcentagem20,porcentagem15,porcentagem10,porcentagem5;

    System.out.println("Informe o seu salário Atual: ");
    salarioAtual = in.nextDouble();

    porcentagem20 = 20 /100;
    porcentagem15 = 15 /100;
    porcentagem10 = 10 /100;
    porcentagem5 = 5 /100;


    if ( salarioAtual <= 1.900 ) {

            soma1 = salarioAtual * porcentagem20;
            novoSalario = salarioAtual + soma1;

        System.out.println("O jogador terá aumento de R$ " + soma1 +
        " e passará a receber R$ " + novoSalario);

    } else if ( salarioAtual <= 3.300 ){

        soma2 = salarioAtual * porcentagem15;
            novoSalario = salarioAtual + soma2;

            System.out.println("O jogador terá aumento de R$ " + soma2 +
            "e passará a receber R$ " + novoSalario);
    
    } else if (salarioAtual <= 5.800){

        soma3 = salarioAtual * porcentagem10;
        novoSalario = salarioAtual + soma3;

        System.out.println("O jogador terá aumento de R$ " + soma3 +
        "e passará a receber R$ " + novoSalario);

    } else if (salarioAtual >= 5.8000 ){

        soma4 = salarioAtual * porcentagem5;
        novoSalario = salarioAtual + soma4;

        System.out.println("O jogador terá aumento de R$ " + soma4 +
        "e passará a receber R$ " + novoSalario);


    }
}

}