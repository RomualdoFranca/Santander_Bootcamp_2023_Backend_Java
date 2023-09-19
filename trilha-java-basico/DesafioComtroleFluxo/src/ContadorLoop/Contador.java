package ContadorLoop;

import java.util.Scanner;

public class Contador {
	
	public static void main(String[] args) {
		
		Scanner terminal = new Scanner(System.in);
		
		System.out.println("Digite o 1° parâmentro");
		int primeiroParametro = terminal.nextInt();
		
		System.out.println("Digite o 2° parâmentro");
		int segundoParametro = terminal.nextInt();
		
		
		
		try {
			contar(primeiroParametro, segundoParametro);
			
		}
		catch(ParametrosInvalidosException e){
			System.out.println("O 2° parâmetro deve ser maior que o 1°");
		}
	}
	static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
		
		if(segundoParametro < primeiroParametro)
			throw new ParametrosInvalidosException();
		
		int contagem = segundoParametro - primeiroParametro;
		
		for(int x=1; x<=contagem; x++) {
			
			System.out.println(x);
		}
	}
}
