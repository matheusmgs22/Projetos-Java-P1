
import java.util.Scanner;

public class atividaderepeticao5 {

    public static void main(String[] args){

        Scanner in = new Scanner (System.in);

        int idade;
        char genero;
        char feminino = 'F';
        char masculino = 'M' ;
        double peso, altura;
        int cont = 0;
        int cont2 = 0;

        char A;
        char P;
        char V;
        char C;

        char L;
        char R;


        System.out.println("Informe a sua idade: ");
        idade = in.nextInt();

        while ( idade <= 1 || idade >= 120){

            System.out.println("Informe a sua idade novamente, entre 1 a 120 anos: ");
            idade = in.nextInt();

        }

        System.out.println("Informe o seu Gênero, M para masculino  e F para feminino: ");
        genero = in.next().charAt(0);
        
        if ( genero == 'M' || genero == 'm'){
            cont = cont + 1;
            
        } else if (genero == 'F' || genero == 'f') {

            cont2 = cont2 + 1;

        }

        System.out.println("Informe o seu peso: ");
        peso = in.nextDouble();

        while ( peso < 3 ||  peso > 300){

            System.out.println("Informe seu peso novamente, entre 3 a 300 Kilos: ");
            peso = in.nextDouble();
    
        }

        System.out.println("Informe a sua altura: ");
        altura = in.nextDouble();        

        while ( altura < 0.5 || altura > 2.5){

            System.out.println("Informe a sua altura novamente, entre 0.5 e 2.5 metros: ");
            altura = in.nextDouble();
        }

        


        





    }
}