package candidatura;

import java.util.Scanner;

public class ProcessoSeletivo {
	
	public static void main(String[] args) {
		
		System.out.println("Processo Seletivo");
		
		analisarCandidato(1500.0);
		analisarCandidato(2500.0);
		analisarCandidato(2000.0);
		
	}
	static void analisarCandidato(double salarioPretendido) {
		
//		Scanner scanner = new Scanner(System.in);
		double salarioBase = 2000.0;
		
//		System.out.println("Informe sua pretenção salarial");
////		salarioPretendido = scanner.nextDouble();
		
		if(salarioBase > salarioPretendido) 
			System.out.println("LIGAR PARA O CANDIDATO");
		
		else if(salarioBase == salarioPretendido)
			System.out.println("LIGAR PARA O CANDIDATO COM UMA CONTRA PROPOSTA");
		
		else
			System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
	}

}
