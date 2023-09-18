import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {
        
        try{
        //criando o objeto Scanner
        Scanner scanner = new Scanner(System.in);

        //excessoes que podem acontecer
        // nao informar nome e sobrenome
        //o valor da idade ter um caractere NAO numerico
        // o valor da altura terr uma virgula ao inves do ponto(conforme padrao americano)

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobreNome = scanner.next();

        System.out.println("Digite seu idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();
     
        }
        catch (InputMismatchException e){
        System.out.println("Campos idade e altura devem ser numericos");
        }
       
    }
}
