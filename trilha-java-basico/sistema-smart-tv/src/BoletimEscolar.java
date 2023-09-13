public class BoletimEscolar {

    public static void main(String[] args) {
        
        // fluxo de condicional encadeada
        int nota = 7;

        // 'if' será sempre a 1° instrucao 
        if(nota >=7) // essa condicao tem de da retornar 'true'
            System.out.println("Aluno APROVADO");

        else if(nota >= 5 && nota < 7) // essa condicao tem de da retornar 'true' ou 'false'
           System.out.println("Aluno em RECUPERACAO"); 

        // 'else' será sempre a ultima instrucao
        else // essa condicao tem de da retornar 'false'
            System.out.println("Aluno REPROVADO");
    }
    
}
