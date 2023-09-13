public class CaixaEletronico {

    public static void main(String[] args) {

        // controle de fluxo de condicional simple
        double saldo = 100.0;
        double saque = 47.5;

        // quando dentro do if tiver mais de uma instrucao, deve-se abrir e fechar o if, o bloco de codigo com chaves
        if(saque < saldo){
            
            // sendo essa condicao verdadeira,  o novo valor da variavel 'saque' ficara contida  APENAS no escopo do if. Nao podendo ser acessada fora desse bloco de codigo
            saldo = saldo - saque;
            System.out.println("Saque realizado. Seu novo saldo é R$ " + saldo);

        }else
            
            System.out.println("Valor de saldo  INSUFICIENTE PARA SAQUE");
    }
    
}
