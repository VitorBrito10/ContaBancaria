package entidades;

public class ContaBancaria {

	private String nome;
	private int conta;
	private double saldo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getConta() {
		return conta;
	}
	
	public void setConta(int conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double saque(double valor) {
		
		saldo = (saldo - valor) - 5;
		return saldo;

	}

	public double deposito(double valor) {
		saldo += valor;
		return saldo;

	}
	
	public String toString() {
		return "Nome: " + nome + " Conta: " + conta + " Saldo: R$" + String.format("%.2f", saldo);
	}

}
