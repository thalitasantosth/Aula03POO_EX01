package model;

public class ContaBancaria {
	
	private String cliente;
	private int numConta;
	private float saldo;
	
	public ContaBancaria () {
		cliente = null;
		numConta = 0;
		saldo = 0.0f;
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public int getNumConta() {
		return numConta;
	}
	
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public void sacar (float valor) {
		if (valor > saldo ) {
			System.out.println("Saldo insuficiente");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso");
            System.out.println("Saldo após saque: R$" + saldo);
		}
	}
	
	public void depositar(float valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso");
        System.out.println("Saldo após deposito: R$" + saldo);
    }

}
