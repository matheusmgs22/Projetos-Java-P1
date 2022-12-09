public class testeReferencia{

    public static void main (String[] args){

        Conta primeiraConta = new Conta();

        primeiraConta.saldo = 300;

        System.out.println("o saldo da primeira conta" + primeiraConta.saldo);

        Conta segundaConta = primeiraConta;

        



    }

}