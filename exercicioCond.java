import java.util.Scanner;

public class exercicioCond {
  public static void main(String[] args){

    Scanner in = new Scanner (System.in);


    double consumoCliente, tarifaMinima, taxaIluminacao;
    double wattsExcedido, valorWattsExcedido; 

    System.out.println("Informe o seu consumo de energia, em QuiloWatts: ");
    consumoCliente = in.nextDouble();
  
    tarifaMinima = 7.00;
    taxaIluminacao = 3.50;

    wattsExcedido = consumoCliente - 10; 
    valorWattsExcedido = 1.40 * wattsExcedido;

    if( consumoCliente < 10)  {

      consumoCliente = tarifaMinima + taxaIluminacao;
      System.out.println ("O valor da conta de energia é de R$ " + consumoCliente);



    } else {
      
      consumoCliente = tarifaMinima + taxaIluminacao + valorWattsExcedido;

      System.out.println ("O valor da conta de energia é de R$ " + consumoCliente );

    }

  }
}