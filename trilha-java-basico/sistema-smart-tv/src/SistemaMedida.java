public class SistemaMedida {
    public static void main(String[] args) {
        
        String sigla = "M";

        //  modo condicional if/else
        if(sigla == "P")
        System.out.println("PEQUENO");

        else if(sigla == "M")
        System.out.println("MÉDIO");

        else if(sigla == "G")
        System.out.println("GRANDE");

        else
        System.out.println("INDEFINIDO");

        // modo condicional Switch
        // OBS: menos performático com relacao complexidade e sitaxe que o if tradiocional. 
        switch(sigla){

            case "P":{
                System.out.println("PEQUENO");
                break; //evita que as comparações continuem a ser executadas, após um caso correspondente ter sido encontrado
            }
            case "M": {
                System.out.println("MÉDIO");
                break;
            }

            case "G":{
                System.out.println("GRANDE");
                break;
            }

            default:
            System.out.println("INDEFINIDO");
        }

    }
    
}
