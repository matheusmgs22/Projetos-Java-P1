import java.util.Scanner;

public class atividade7 {
  public static void main(String[] args){

    Scanner in = new Scanner (System.in);
    
    double valorCarro, porcentagemTaxaAntes,porcentagemTaxaDepois;
    double anoCarro, pagamentoImposto;

    System.out.println("Informe o ano de fabricacao do carro: ");
    anoCarro = in.nextDouble();

    System.out.println("Informe o valor do carro na tabela: ");
    valorCarro = in.nextDouble();

    porcentagemTaxaDepois = 1.5 / 100;
    porcentagemTaxaAntes = 1.0 / 100;

    if (anoCarro >= 2000) {

        pagamentoImposto = porcentagemTaxaDepois * valorCarro;

        System.out.println("Valor do imposto a ser pago é: " + pagamentoImposto + "reais");



    } else{

        pagamentoImposto = porcentagemTaxaAntes * valorCarro;

        System.out.println("Valor do imposto a ser pago é: " + pagamentoImposto + "reais");

    }




    }
    
}
