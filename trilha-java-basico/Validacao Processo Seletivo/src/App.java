import java.util.Scanner;

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
        double salarioPretendido;

        System.out.println("Qual o seu salário pretendido? ");
        salarioPretendido = scanner.nextDouble();
        System.out.println("Salario informado" + salarioPretendido);
    }
}
