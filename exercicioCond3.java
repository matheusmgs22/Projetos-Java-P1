import java.util.Scanner;

public class exercicioCond3 {
  public static void main(String[] args){

    Scanner in = new Scanner (System.in);

    int codigoProduto;
    double quantidadeProduto; 
    double precoProduto, valorDesconto, valorFinalCompra,valorTotalCompra;
    double porcentagem, porcentagem1;

System.out.println("Infome o codigo do produto, de 1 a 40: ");
codigoProduto = in.nextInt();

System.out.println("Infome a quantidade comprada deste produto: ");
quantidadeProduto = in.nextDouble();


 if( codigoProduto <= 10) {

    precoProduto =  9.5;
    valorTotalCompra = quantidadeProduto * precoProduto;
    

    if ( valorTotalCompra <= 1500 ){

      porcentagem = 2.5 / 100;
      valorDesconto = valorTotalCompra * porcentagem;
      valorFinalCompra = valorTotalCompra - valorDesconto;

      System.out.println("O valor total da compra é de R$ " + valorTotalCompra + ", O valor do desconto ficou de R$ -" + 
       valorDesconto + " e o valor Final da compra: R$" +  valorFinalCompra );

    } else if (valorTotalCompra <= 3000){

      porcentagem1 = 5 / 100;
      valorDesconto = valorTotalCompra * porcentagem1;
      valorFinalCompra = valorTotalCompra - valorDesconto;

      System.out.println("O valor total da compra é de R$ " + valorTotalCompra + ", O valor do desconto ficou de R$ -" + 
       valorDesconto + " e o valor Final da compra: R$" +  valorFinalCompra );


    }else{

      porcentagem = 10 / 100;  
      valorDesconto = valorTotalCompra * porcentagem;
      valorFinalCompra = valorTotalCompra - valorDesconto;

      System.out.println("O valor total da compra é de R$ " + valorTotalCompra + ", O valor do desconto ficou de R$ -" + 
       valorDesconto + " e o valor Final da compra: R$" +  valorFinalCompra );

      

    }
 

 } else if ( codigoProduto <= 20){

    precoProduto =  13.25;
    valorTotalCompra = quantidadeProduto * precoProduto;
    

    if ( valorTotalCompra <= 1500 ){

      porcentagem = 2.5 / 100;
      valorDesconto = valorTotalCompra * porcentagem;
      valorFinalCompra = valorTotalCompra - valorDesconto;

      System.out.println("O valor total da compra é de R$ " + valorTotalCompra + ", O valor do desconto ficou de R$ -" + 
       valorDesconto + " e o valor Final da compra: R$" +  valorFinalCompra );

    } else if (valorTotalCompra <= 3000){

      porcentagem1 = 5 / 100;
      valorDesconto = valorTotalCompra * porcentagem1;
      valorFinalCompra = valorTotalCompra - valorDesconto;

      System.out.println("O valor total da compra é de R$ " + valorTotalCompra + ", O valor do desconto ficou de R$ -" + 
       valorDesconto + " e o valor Final da compra: R$" +  valorFinalCompra );


    }else{

      porcentagem = 10 / 100;  
      valorDesconto = valorTotalCompra * porcentagem;
      valorFinalCompra = valorTotalCompra - valorDesconto;

      System.out.println("O valor total da compra é de R$ " + valorTotalCompra + ", O valor do desconto ficou de R$ -" + 
       valorDesconto + " e o valor Final da compra: R$" +  valorFinalCompra );

      

    }



 } else if (codigoProduto <= 30) {

  precoProduto =  24.10;
  valorTotalCompra = quantidadeProduto * precoProduto;
  

  if ( valorTotalCompra <= 1500 ){

    porcentagem = 2.5 / 100;
    valorDesconto = valorTotalCompra * porcentagem;
    valorFinalCompra = valorTotalCompra - valorDesconto;

    System.out.println("O valor total da compra é de R$ " + valorTotalCompra + ", O valor do desconto ficou de R$ -" + 
     valorDesconto + " e o valor Final da compra: R$" +  valorFinalCompra );

  } else if (valorTotalCompra <= 3000){

    porcentagem1 = 5 / 100;
    valorDesconto = valorTotalCompra * porcentagem1;
    valorFinalCompra = valorTotalCompra - valorDesconto;

    System.out.println("O valor total da compra é de R$ " + valorTotalCompra + ", O valor do desconto ficou de R$ -" + 
     valorDesconto + " e o valor Final da compra: R$" +  valorFinalCompra );


  }else{

    porcentagem = 10 / 100;  
    valorDesconto = valorTotalCompra * porcentagem;
    valorFinalCompra = valorTotalCompra - valorDesconto;

    System.out.println("O valor total da compra é de R$ " + valorTotalCompra + ", O valor do desconto ficou de R$ -" + 
     valorDesconto + " e o valor Final da compra: R$" +  valorFinalCompra );

    

  }    

 } else if (codigoProduto <= 40){

  precoProduto =  37.75;
  valorTotalCompra = quantidadeProduto * precoProduto;
  

  if ( valorTotalCompra <= 1500 ){

    porcentagem = 2.5 / 100;
    valorDesconto = valorTotalCompra * porcentagem;
    valorFinalCompra = valorTotalCompra - valorDesconto;

    System.out.println("O valor total da compra é de R$ " + valorTotalCompra + ", O valor do desconto ficou de R$ -" + 
     valorDesconto + " e o valor Final da compra: R$" +  valorFinalCompra );

  } else if (valorTotalCompra <= 3000){

    porcentagem1 = 5 / 100;
    valorDesconto = valorTotalCompra * porcentagem1;
    valorFinalCompra = valorTotalCompra - valorDesconto;

    System.out.println("O valor total da compra é de R$ " + valorTotalCompra + ", O valor do desconto ficou de R$ -" + 
     valorDesconto + " e o valor Final da compra: R$" +  valorFinalCompra );


  }else{

    porcentagem = 10 / 100;  
    valorDesconto = valorTotalCompra * porcentagem;
    valorFinalCompra = valorTotalCompra - valorDesconto;

    System.out.println("O valor total da compra é de R$ " + valorTotalCompra + ", O valor do desconto ficou de R$ -" + 
     valorDesconto + " e o valor Final da compra: R$" +  valorFinalCompra );

    

  }

    }
 }  

}

