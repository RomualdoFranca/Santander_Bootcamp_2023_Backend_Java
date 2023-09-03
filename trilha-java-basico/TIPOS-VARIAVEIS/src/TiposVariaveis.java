import java.sql.Date;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        // Tipos primitivos
        // byte, short, int, long, double, float, boolean, char
        // classe Operadores.java
        int idade = 41;
        double peso = 89.53;
        String nome = "Mamão";
        String nomeSobrenome = "Esse é um apelido:" + " Mamão"; // sinal de soma serve para concatenar
        char sexo = 'M';
        boolean doadorOrgao = true;
        // classe que representa tipos,logo, esses tipos de variaveis devem ser antecedidos com a palavra 'new' e nome da classe correspondente indicando parametros de inicialização.
        // cria um novo objeto
        Date dataNascimento = new Date(sexo); 

        //operadores aritimenticos
        double soma = 10.5 + 15.7;
        int subtracao = 9 - 3;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 5; // representa o resto da divisao

        // operadores unarios

        // de valor positivo
        int numero = 5;

        // de valor negativo
        numero = - numero; //convertendo em negativo
        System.out.println(numero);
        numero = + numero;
        System.out.println(numero);

        // de incremento de valor
        numero += 1;
        System.out.println(numero);

        numero += numero;
        System.out.println(numero);

        // de decremento de valor
        numero -= 1;
        System.out.println(numero);

        // de negaçao, usadas nas verificaçoes logicas das aplicaçoes
        boolean variavelSim = true;
        System.out.println(variavelSim);

        variavelSim = !variavelSim; //negacao de variavel booleana
        System.out.println(variavelSim);

        boolean variavelNao = false;
        System.out.println(variavelNao);

        variavelNao = !variavelNao;
        System.out.println(variavelNao);
        


    }
}
