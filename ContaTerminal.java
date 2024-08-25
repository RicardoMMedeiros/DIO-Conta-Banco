package contaBanco;

import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, digite o número da Agência !");
		int agencia = sc.nextInt();
		
		System.out.println("Digite o número da Conta !");
		String numero = sc.next();
		
		System.out.println("Digite o seu Nome !");
		String cliente = sc.next();
		
		System.out.println("Digite o saldo !");
		float saldo = sc.nextFloat();
		
		System.out.println("Olá " + cliente
				+ ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
				+ ", conta " + numero
				+ " e seu saldo " + saldo
				+ " já está disponível para saque.");
		
		
	}
}
