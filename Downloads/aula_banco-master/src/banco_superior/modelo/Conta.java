package banco_superior.modelo;

public abstract class Conta {

	String numeroConta;
	String agencia;
	String nome;
	String cpf;
	private float saldo;
	boolean status;
	String dataAbertura;
	
	static final float TAXA_ADMINISTRACAO = 0.02f;

	public Conta(String numeroConta, String agencia, String nome, String cpf, String dataAbertura) {
		super();
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.nome = nome;
		this.cpf = cpf;
		this.saldo = 0f;
		this.status = true;
		this.dataAbertura = dataAbertura;
	}

	@Override
	public String toString() {
		return "Conta [numeroConta=" + numeroConta + ", agencia=" + agencia + ", nome=" + nome + ", cpf=" + cpf
				+ ", "+" saldo=" + saldo + ", status=" + status + ", dataAbertura="
				+ dataAbertura + "]";
	}

	public void depositar(float valorDepositado) {
		if (this.status == true && valorDepositado > 0) {
			setSaldo(this.saldo + valorDepositado);
		}
	}

	public void desativarConta() {
		this.status = false;
	}

	public void sacar(float valorSacado) {
		if (this.saldo >= valorSacado && valorSacado > 0 && this.status == true) {
			this.saldo = this.saldo - valorSacado;
		}
	}

	public float getSaldo() {
		return this.saldo;
	}

	private void setSaldo(float novoSaldo) {
		this.saldo = novoSaldo;
	}

	public abstract void transferencia(Conta contaDestino, float valorTransferido);

}
