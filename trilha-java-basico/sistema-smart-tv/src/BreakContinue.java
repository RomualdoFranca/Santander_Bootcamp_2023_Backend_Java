public class BreakContinue {
    public static void main(String[] args) {
        
        for(int numero=1; numero<=5; numero++){

            if(numero==3) 
            break; // interrompe o laco

           // System.out.println(numero);
        }

        for(int numero=1; numero<=10; numero++){

            if(numero % 4 == 0){
                continue;// nao executa a instrucao e continua a iteracao
            }
            System.out.println(numero);
        }
    }
}
