public class DepuracaoDebug {

    public static void main(String[] args) {
        // processo de depuraçao ( debug)
        String concatenacao = "?";

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1); // os termos dentro do parateses podem ser chamados de evidencia

        System.out.println(concatenacao);
        
    }
}
