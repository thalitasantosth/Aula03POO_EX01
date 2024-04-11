package model;

public class ContaPoupanca extends ContaBancaria{
	
	private int diaRendimento;

	public ContaPoupanca () {
		diaRendimento = 0;		
	}
	
	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	public void calcularNovoSaldo(float taxaRendimento) {
        float rendimento = super.getSaldo() * taxaRendimento;
        super.setSaldo(super.getSaldo() + rendimento);
        System.out.println("Novo saldo após rendimento: R$" + super.getSaldo());
    }

}
