package candidatura;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class ProcessoSeletivo {
	
	public static void main(String[] args) {
		
//		System.out.println("Processo Seletivo");
//		
//		analisarCandidato(1500.0);
//		analisarCandidato(2500.0);
//		analisarCandidato(2000.0);
		selecaoCandidatos();
		
	}
	
	static void selecaoCandidatos() {
		// Array com a lista de candidatos
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
		
		int candidatosSelecionados = 0;
		int candidatosAtual = 0;
		double salarioBase = 2000.0;
		
		while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("Salario pretendido do candidato " + candidato + ": " + salarioPretendido);
			if(salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado.");
				candidatosSelecionados++;
			}
			candidatosAtual++;
		}
	}
	
	// Método que simula o valor pretendido
	static double valorPretendido() {
	     return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	
	static void analisarCandidato(double salarioPretendido) {
		
//		Scanner scanner = new Scanner(System.in);
		double salarioBase = 2000.0;
				
		if(salarioBase > salarioPretendido) 
			System.out.println("LIGAR PARA O CANDIDATO");
		
		else if(salarioBase == salarioPretendido)
			System.out.println("LIGAR PARA O CANDIDATO COM UMA CONTRA PROPOSTA");
		
		else
			System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
	}

}
