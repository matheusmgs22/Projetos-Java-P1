import java.util.Scanner;

public class atividaderepeticao2 {

    public static void main(String[] args){

        Scanner in = new Scanner (System.in);


        double nota1, nota2 , media;
        int total = 1 ,  cont;

        cont = 1;


        while ( cont <= total){

            System.out.println("   Aluno Número =  " + cont);
            
        System.out.println("Informe a Primeira nota do aluno: ");
        nota1 = in.nextDouble();

        while (nota1 < 0 || nota1 > 10){

            System.out.println("Nota 1 Errada, digite números entre 0 e 10, digite novamente: ");
        nota1 = in.nextDouble();

        }
        System.out.println("Informe a Segunda nota do aluno: ");
        nota2 = in.nextDouble();

        while (nota2 < 0 || nota2 > 10){
            System.out.println("Nota 2 Errada, digite números entre 0 e 10, digite novamente: ");
        nota2 = in.nextDouble();

        }

        media = (nota1 + nota2) / 2;
        
         if ( media < 3 ){
            System.out.println( " o  aluno obvete média " + media + " e está Reprovado!");
            
        } else if ( media < 7){
        
            System.out.println( " o  aluno obvete média " + media + " e está de recuperacão! ");
        
        } else {

            System.out.println( " o aluno obvete média " + media + " e está de Aprovado! ");

        }
            cont = cont + 1 ;
        
        }
    }
        } 

    


    
