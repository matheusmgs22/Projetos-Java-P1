import java.util.Scanner;

public class atividade8 {
  public static void main(String[] args){

    Scanner in = new Scanner (System.in);
   
    double peso,altura,genero;
    double pesoIdeal, pesoIdealHomem, pesoIdealMulher;

    System.out.println("Informe o seu peso: ");
    peso = in.nextDouble();
    System.out.println("Informe o seu altura: ");
    altura = in.nextDouble();
    System.out.println("Informe o seu gênero, com M ou F: ");
    genero = in.nextDouble();
    
    if (genero == 'M' || genero == 'F'){
    
    }

    pesoIdealHomem = 72.2 * altura - 58;
    pesoIdealMulher = 62.1 * altura - 44.7;



if (peso == pesoIdealHomem ) {

    System.out.println("O seu peso real coincide com o peso Ideal: " + pesoIdealHomem);

} else {

    System.out.println("O seu peso real NÃO coincide com o peso Ideal: " + pesoIdealHomem);




}


    }
    
}
