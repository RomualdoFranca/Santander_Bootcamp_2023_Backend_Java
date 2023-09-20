import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Saldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

           
        ArrayList < String > ativos = new ArrayList < > ();

         //Entrada dos tipos de ativos
         int quantidadeAtivos = scanner.nextInt();
         System.out.println("Entrada dos códigos dos ativos");
         
        // Entrada dos códigos dos ativos
        
        for (int i = 0; i < quantidadeAtivos; i++) {
            String codigoAtivo = scanner.nextLine();
            ativos.add(codigoAtivo);   
            System.out.println("Lista de ativos sem ordem: " + codigoAtivo);      
        }
        System.out.println("Lista de ativos sem ordem: " + ativos);

        Collections.sort(ativos);
        for(String listaOrdenada : ativos) {
            System.out.println("Lista de ativos ordenada: " + ativos);
        }
        
        

    }
 
}