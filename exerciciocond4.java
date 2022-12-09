import java.util.Scanner;

public class exerciciocond4 {
  public static void main(String[] args){

    Scanner in = new Scanner (System.in);

    double idade, peso, dosagem, gotas;

    System.out.println ("Informe a idade do paciente: ");
    idade = in.nextDouble();

    System.out.println ("Informe o peso do paciente: ");
    peso = in.nextDouble();



    if( idade >= 12){

        if(  peso >= 60){

            dosagem = 1000;
         gotas = (20 * dosagem) / 500;    
         
         System.out.println(" O paciente deve tomar " + gotas + " gotas do rémedio");

        } else{

            dosagem = 875;
         gotas = (20 * dosagem) / 500;    
         
         System.out.println(" O paciente deve tomar " + gotas + " gotas do rémedio");

        }


    } else {

        if( peso < 5){

            System.out.println(" O paciente não pode tomar esse medicamento ");
        } else if (peso <= 9){

            dosagem = 125;
         gotas = (20 * dosagem) / 500;    
         
         System.out.println(" O paciente deve tomar " + gotas + " gotas do rémedio");

        } else if (peso <= 16){

            dosagem = 250;
         gotas = (20 * dosagem) / 500;    
         
         System.out.println(" O paciente deve tomar " + gotas + " gotas do rémedio");




    } else if (peso <= 24){

        dosagem = 375;
     gotas = (20 * dosagem) / 500;    
     
     System.out.println(" O paciente deve tomar " + gotas + " gotas do rémedio");


  } else if (peso <= 30){

    dosagem = 500;
 gotas = (20 * dosagem) / 500;    
 
 System.out.println(" O paciente deve tomar " + gotas + " gotas do rémedio");


}else if( peso > 30){

    dosagem = 750;
 gotas = (20 * dosagem) / 500;    
 
 System.out.println(" O paciente deve tomar " + gotas + " gotas do rémedio");



        }   

    }

}
}