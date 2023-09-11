public class Usuario {
    public static void main(String[] args) throws Exception {
        
        // renomeação do arquivo main
        SmartTV smartTV = new SmartTV(); // cria objeto SmartTV

        // chama o método da classe SmartTV que manipula o atributo volume
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        System.out.println("Volume aumentado: " + smartTV.volume);

        // chama o método da classe SmartTV que manipula o atributo canal
        smartTV.escolherCanal(12);
        System.out.println("Canal escolhido: " + smartTV.canal);

        System.out.println("Estado da TV " + smartTV.ligada);
        
        System.out.println("Canal atual: " +smartTV.canal);
        System.out.println("Volume atual: " + smartTV.volume);

        // chamar o metodo ligar seria o mesmo que apertar o botão de ligar/deligar da TV
        // futura implementaçao: dependendo do estado da TV, ao acioinar o botão ligar/delsigar
        // um método de função oposto ao estado atual da TV é chamado
        smartTV.ligar();
        System.out.println("Novo status " + smartTV.ligada);
    }
}
