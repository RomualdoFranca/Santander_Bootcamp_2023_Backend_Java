public class SmartTV {

    //Criaçao de atributos com pré definições da TV já configurados. O estado inicial da TV configurado
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // criação dos metodos que manipulam os estados da TV

    public void aumentarVolume(){
        // aumenta o volume em +1
        volume++;
    }

        public void diminuirVolume(){
         // aumenta o volume em -1
        volume--;
    }

    // Os atributos manipulam os atributos da classe e dentro dos métodos devem está o atributo que será manipulado
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public void mudarCanalCrescente(){
        canal++;

    }
     public void mudarCanalDecrescente(){
        canal--;
     }

    public void escolherCanal(int insereCanal){
        canal = insereCanal;
    }
}
