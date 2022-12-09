import java.util.Scanner;

public class atividade6 {
  public static void main(String[] args){

    Scanner in = new Scanner (System.in);
    
    double valorSalarioMinimo,horasTrabalhadas, salarioFuncionario, impostoRenda;
    double totalMinimo,porcetagemMinimo, porcetagemRenda, salarioTotal;

    System.out.println("Informe o valor do salário mínimo: ");
    valorSalarioMinimo = in.nextDouble();

    System.out.println("Informe a suas horas trabalhadas: ");
    horasTrabalhadas = in.nextDouble();

    porcetagemMinimo = 1.5 / 100;

    porcetagemRenda = 7.5 / 100;

    totalMinimo = valorSalarioMinimo * porcetagemMinimo;

    salarioFuncionario = horasTrabalhadas * totalMinimo;
    

    if (salarioFuncionario <= 2.500){

    
        System.out.println ("O seu salário total é de " + salarioFuncionario + " Reais");


    } else {
        
        impostoRenda = salarioFuncionario * porcetagemRenda;
        salarioTotal = salarioFuncionario - impostoRenda;

        System.out.println ("O seu salário total é " + salarioFuncionario + " Reais");
        System.out.println ("O desconto do imposto de renda é " + impostoRenda + " Reais");
        System.out.println ("O seu salário após o desconto é " + salarioTotal + " Reais");

    }


  } 

}
