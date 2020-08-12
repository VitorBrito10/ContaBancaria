package aplication;

import java.util.Locale;
import java.util.Scanner;
import entidades.ContaBancaria;

public class MainContaBancaria {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o nome do titular: ");
		String nome = scan.nextLine();
		System.out.println("informe o n�mero da conta: ");
		int numConta = scan.nextInt();
		System.out.println("Deseja informar o saldo inicial? 1- Sim / 2- N�o");
		int opcao = scan.nextInt();
		double valor;
		if (opcao == 1) {
			System.out.println("Digite o saldo inicial: ");
			valor = scan.nextDouble();
		} else {
			valor = 0.00;

		}

		ContaBancaria conta = new ContaBancaria();
		conta.setNome(nome);
		conta.setConta(numConta);
		conta.setSaldo(valor);
		System.out.println(conta);
		System.out.println();
		System.out.println("OPERA��ES DISPON�VEIS");
		System.out.println("========================");
		System.out.println("1- Dep�sito");
		System.out.println("2- Saque");
		System.out.println("3- Alterar nome");
		System.out.println("4- Saldo");
		System.out.println("========================");
		System.out.println("Digite o que deseja fazer: ");
		int operacoes = scan.nextInt();
		switch (operacoes) {
		
		case 1:

			
			do  {
			
				System.out.println("digite o valor que deseja depositar: ");
				valor = scan.nextDouble();
				conta.deposito(valor);
				System.out.println("dep�sito feito com sucesso!");
				System.out.println(conta);
				System.out.println("deseja fazer um novo deposito ? 1- Sim/ 2-N�o");
				opcao = scan.nextInt();
			
			}  while (opcao == 1);
			
			if (opcao == 2) {
				System.out.println("Obrigado por utilizar nosso aplicativo!");
			} else {
				System.out.println("op��o inv�lida!");
			}
			
			break;
			
		case 2:
			
			do  {
				System.out.println("digite o valor que deseja sacar: ");
				valor = scan.nextDouble();
				conta.saque(valor);
				System.out.printf("saque efetuado com sucesso! saldo atual: R$%.2f", conta.getSaldo());
				System.out.println();
				System.out.println("deseja fazer um novo saque? 1- Sim/ 2-N�o");
				opcao = scan.nextInt();
			} while (opcao == 1);
			
				if (opcao == 2) {
					System.out.println("Obrigado por utilizar nosso aplicativo!");
				} else {
					System.out.println("op��o inv�lida!");
				}
			
			break;
		case 3:
			
			do {
				String bug = scan.nextLine();
				System.out.println("digite o nome do titular: ");
				nome = scan.nextLine();
				conta.setNome(nome);
				System.out.println("Nome alterado com sucesso! seu novo nome agora �: "+conta.getNome());
				System.out.println("deseja alterar o nome? 1- Sim/ 2-N�o");
				opcao = scan.nextInt();
			} while (opcao == 1);
			if(opcao == 2){
				System.out.println("Obrigado por utilizar nosso aplicativo!");
				System.out.println(conta);
			} else {
				System.out.println("op��o inv�lida!");
			}
			
case 4:
			
			System.out.println(conta);
		
			break;
		default:
			System.out.println("Valor inv�lido! ");
			
		}
		
		scan.close();

	}

}
