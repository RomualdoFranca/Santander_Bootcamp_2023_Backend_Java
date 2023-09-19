import java.util.Scanner;
import java.util.Locale;
import java.util.InputMismatchException;

public class App {
    public static void main(String[] args) throws Exception {
        

        /*
         CASE 1:
          Vamos imaginar que em um processo seletivo, existe o valor base salarial de R$ 2.000,00 e o salário pretentido pelo candidato. Vamos elaborar um controle de fluxo onde:

          Se o valor salário base, for maior que valor salário pretentido, imprima : LIGAR PARA O CANDIDATO;

          Senão, Se o valor salário base for igual ao valor salário          pretentido,
          imprima : LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA;

          Senão imprima: AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.
         */
        
        Scanner scanner =  new Scanner(System.in);

        double salarioBase = 2000.00;
        try{
        System.out.println("Qual o seu salário pretendido? ");
        double salarioPretendido = scanner.nextDouble();

        if(salarioPretendido < salarioBase) 
            System.out.println("LIGAR PARA CANDIDATO");
        
        else if(salarioPretendido == salarioBase)
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");

        else
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
        catch(InputMismatchException e){
            System.out.println("INSIRA UM VALOR VÁLIDO");
        };
        
       
    }
    
}
