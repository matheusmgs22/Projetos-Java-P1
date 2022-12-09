import java.util.Scanner;

public class atividaderepeticao {

    public static void main(String[] args){

        Scanner in = new Scanner (System.in);


        double nota1, nota2 , media;

        System.out.println("Informe a Primeira nota do aluno: ");
        nota1 = in.nextDouble();

        System.out.println("Informe a Segunda nota do aluno: ");
        nota2 = in.nextDouble();

        media = (nota1 + nota2) / 2;

        while (media < 0 || media > 10){

            System.out.println( "Digite novamente, um valor entre 0 e 10, a Primeira nota: ");
            nota1 = in.nextDouble();
            System.out.println( "Digite novamente, a Segunda nota: ");
            nota2 = in.nextDouble();
            
            media = (nota1 + nota2) / 2;
        }

         if ( media < 3 ){
            System.out.println( " o aluno obvete média " + media + " e está Reprovado!");
            
        } else if ( media < 7){
        
            System.out.println( " o aluno obvete média " + media + " e está de recuperacão! ");
        
        } else {

            System.out.println( " o aluno obvete média " + media + " e está de Aprovado! ");

        } 

        }
    } 

    


    
