public class ContarCarneirinhos {
    public static void main(String[] args) {
        
        //Estruturas de repeticao

        //Vamos imaginar que joaozinho precise contar carneirinhos ate 10 para pegar no sono
        // enquanto a expressao booleana for verdadeira, a contagem continua ou seja, enquanto a variavel carneirinhos tiver o valor menor ou igual a 10, a contagem vai continuar
        for(int carneirinhos= 1; carneirinhos <= 10; carneirinhos++){
            // int carneirinhos = 1 'bloco de declaracao de variavel, bloco de inicializacao'
            // carneirinhos <= 10 'bloco de validacao, bloco de expresao booleana'
            // carneirinhos++ 'bloco de atualizacao, bloco de incrementacao'
            System.out.println(carneirinhos+ " carneirinhos...");
        }
    }
    
}
