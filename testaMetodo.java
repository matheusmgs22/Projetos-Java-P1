public class testaMetodo {

    public static void main (String[] args){

        Conta contaDoMatheus = new Conta();
        contaDoMatheus.saldo = 100;

        contaDoMatheus.deposita(50);

        System.out.println(contaDoMatheus.saldo);

        contaDoMatheus.saca(20);
        System.out.println(contaDoMatheus.saldo);

        Conta contaDaBruna = new Conta();
        contaDaBruna.deposita(1000);

        if(contaDaBruna.transfere( 300, contaDoMatheus)){

            System.out.println("TRANSFERENCIA FEITO COM SUCESSO");
        }   else {

            System.out.println("Transferencia negada, sem saldo suficiente.");
        }

        System.out.println("saldo da conta bruna: " + contaDaBruna.saldo);
        System.out.println("saldo da conta Matheus: " + contaDoMatheus.saldo);
    


    }
    
}
