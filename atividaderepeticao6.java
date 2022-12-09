import java.util.Scanner;

public class atividaderepeticao6 {

    public static void main(String[] args){

        Scanner in = new Scanner (System.in);

        int idade;
        int pessoas = 300;
        int cont = 0;
        int podevotar = 0, percentual1,total1;
        int npodevotar = 0, percentual2,total2;

        while (cont < pessoas) {

        System.out.println("Informe a sua idade: ");
            idade = in.nextInt();
            cont = cont + 1;
    
        while( idade <= 1 || idade >= 120){

            System.out.println("Informe a sua idade novamente, entre 1 a 120 anos: ");
            idade = in.nextInt();

        }
        if ( idade >= 18 || idade >= 90) {
            System.out.println("Esta pessoa tem " + idade + " e pode votar");

            podevotar = podevotar + 1;

        } else {

            System.out.println("Esta pessoa tem " + idade + " Não pode votar");
            npodevotar =  npodevotar + 1 ;

        }
    }
        total1 = podevotar;
        total2 = npodevotar;

        percentual1 = (total1 * 100 / pessoas);
        percentual2 = (total2 * 100 / pessoas);

        System.out.println("Total de pessoas que podem votar:   " + total1);
        System.out.println("Total de pessoas que Não podem votar:  " + total2);

        System.out.println("Percentual de pessoas que podem votar:  " + percentual1 + " % ");
        System.out.println("Percentual de pessoas que Não podem votar:  " + percentual2 + " % ");

        }
}