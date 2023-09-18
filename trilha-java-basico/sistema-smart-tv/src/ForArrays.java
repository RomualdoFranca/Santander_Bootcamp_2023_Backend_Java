public class ForArrays {
    public static void main(String[] args) {


        // percorrendo os elementos de uma array com a estrutura de repeticao For
        String alunos[] = {"Darwin", "Annais", "Lua"};

        for(int x=0; x<alunos.length; x++){

            System.out.println("O aluno do indice " + x + " é " + alunos[x]);
        }


        String dadosAlunos[] = {"Puga fedido", "9999-9999", "1°A"};

        // forma abreviada
        for(String aluno : dadosAlunos) {

            //String aluno = tipo do elemento armazenado num variavel de escopo
            //a cada iteracao do laco For nos dados da Array dadosAlunos, a variavel de escopo vai ser atualizada com o elemento do indice correspondente

            System.out.println(aluno);
        }
        
    }
    
}
