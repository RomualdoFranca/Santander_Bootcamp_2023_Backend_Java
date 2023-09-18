public class PlanoOperadora {

    public static void main(String[] args) {

        /*
            O sistema terá 03 planos: BASIC, MIDIA , TURBO;
            BASIC: 100 minutos de ligação;
            MÍDIA: 100 minutos de ligação + WhatsApp e Instagram grátis;
            TURBO: 100 minutos de ligação + WhatsApp e Instagram grátis + 5 GB Youtube.
         */
        
        String pacoteDados = "T";// M,T

        switch (pacoteDados) {

            // o não uso do brake, nesse caso, performa a sintaxe pois a depender da opcao escolhida, as mensagens vao ser imprimidas na sequencia
            
            case "T": { // sendo verdadeiro, esse case e todos apos dele será imprimido
                System.out.println("5GB de YouTube");
            }
            case "M":{// sendo verdadeiro, esse case e todos apos dele será imprimido
                System.out.println("WhatsApp e Instagram grátis ");

            }
            case "B":{ // sendo verdadeiro, apenas esse case é imprimido
                System.out.println("100 minutos de ligação");
            }

        }
        
    }
    
}
