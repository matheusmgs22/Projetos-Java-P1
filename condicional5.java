import java.util.Scanner;

public class condicional5 {
  public static void main(String[] args){

    Scanner in = new Scanner (System.in);
 
    double total,premio;
    int horasExtra, horasFaltou;

    System.out.println("Digite as horas extras trabalhadas: ");
    horasExtra = in.nextInt();

    System.out.println("Digite as horas que o funcionario faltou: ");
    horasFaltou = in.nextInt();

    total = horasExtra - 2.0/3 * horasFaltou;

    if (total > 40){
        premio = 200.0;

    } else if (total > 30 ){
        premio = 175.0;        

    } else if (total > 20 ){
        premio = 150.0;        

    } else if (total > 10 ){
        premio = 125.0;        

    } else {
        premio = 100.0;        

    }

    System.out.println("O funcionario receberá " + premio + " de gratificacão de natal");


     }
}