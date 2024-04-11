package model;

public class ContaEspecial extends ContaBancaria {
	
	private float limite;
	
	public ContaEspecial () {
		limite = 0.0f;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	public void sacar(float valor) {
        if (valor > super.getSaldo() + limite) {
            System.out.println("Valor excede o saldo disponível e o limite da conta especial");
        } else {
            super.setSaldo(getSaldo() - valor);
            System.out.println("Saque de R$" + valor + " realizado com sucesso");
        }
    }
	

}
