import java.util.Scanner;

public class atividaderepeticao3 {

    public static void main(String[] args){

        Scanner in = new Scanner (System.in);


        double nota1, nota2 , media;
        double percentualAprovados, percentualReprovados, percentualRecuperacao;
        double contagemlAprovados = 0 , contagemlReprovados = 0 , contagemlRecuperacao = 0;
        double soma = 0;
        int total = 2 ,  cont;

        cont = 0;


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
            contagemlReprovados = contagemlReprovados + 1;

        } else if ( media < 7){
        
            System.out.println( " o  aluno obvete média " + media + " e está de recuperacão! ");
            contagemlRecuperacao = contagemlRecuperacao + 1;

        } else {

            System.out.println( " o aluno obvete média " + media + " e está de Aprovado! ");
            contagemlAprovados = contagemlAprovados + 1;

        }
            cont = cont + 1 ;

        }
        
        System.out.println("Total de Reprovados: " + contagemlReprovados);
        System.out.println("Total de Recuperacão: " + contagemlRecuperacao);
        System.out.println("Total de Aprovados: " + contagemlAprovados);

    }
        } 
