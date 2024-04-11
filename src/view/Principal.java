package view;

import model.ContaBancaria;
import model.ContaEspecial;
import model.ContaPoupanca;

public class Principal {

	public static void main(String[] args) {
		
		// ContaBancaria
        ContaBancaria cb1 = new ContaBancaria();
        cb1.setCliente("João");
        cb1.setNumConta(123456);
        cb1.setSaldo(1000.0f);
        
        System.out.println("Dados da Conta Bancária:");
        System.out.println("Cliente: " + cb1.getCliente());
        System.out.println("Número da Conta: " + cb1.getNumConta());
        System.out.println("Saldo: R$" + cb1.getSaldo());

        cb1.depositar(500.0f);
        cb1.sacar(300.0f);

        System.out.println();
        
        // ContaPoupanca
        ContaPoupanca cp2 = new ContaPoupanca();
        cp2.setCliente("Maria");
        cp2.setNumConta(789012);
        cp2.setSaldo(2000.0f);
        cp2.setDiaRendimento(5);

        System.out.println("Dados da Conta Poupança:");
        System.out.println("Cliente: " + cp2.getCliente());
        System.out.println("Número da Conta: " + cp2.getNumConta());
        System.out.println("Saldo: R$" + cp2.getSaldo());
        System.out.println("Dia de Rendimento: " + cp2.getDiaRendimento());

        cp2.calcularNovoSaldo(0.05f);

        System.out.println();
        
        // ContaEspecial
        ContaEspecial ce1 = new ContaEspecial();
        ce1.setCliente("Ana");
        ce1.setNumConta(345678);
        ce1.setSaldo(3000.0f);
        ce1.setLimite(1000.0f);

        System.out.println("Dados da Conta Especial:");
        System.out.println("Cliente: " + ce1.getCliente());
        System.out.println("Número da Conta: " + ce1.getNumConta());
        System.out.println("Saldo: R$" + ce1.getSaldo());
        System.out.println("Limite: R$" + ce1.getLimite());

        ce1.sacar(4000.0f);
	}

}
