public class RefatoraBoletim {

    public static void main(String[] args) {
        
        // condicao ternaria

        int nota = 7;

        // essa condicao substitui o 'if' 'else': o controle de fluxo de condicional simple
        // se a condicao for verdadeira, a 1° string é atribuida a variavel 'resultado'
        //sendo falsa, a 2° string é atribuida a variavel 'resultado'
        String resultado = nota >= 7 ? "APROVADO" : "REPROVADO"; // expressao ternaria
        System.out.println(resultado);


        // essa condicao substitui o 'if' 'else if' 'else': o controle de fluxo de condicional ternaria
        int pontuacao = 8;

        String classificacao = pontuacao >=6 ? "Classificado" :
        pontuacao >= 4 && pontuacao < 6 ? "Repescagem" : "Desclassificado";
        System.out.println(classificacao);
    }
    
}
