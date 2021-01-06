package banco_superior.modelo;

public class ContaPoupanca extends Conta{

	
	static final float RENDIMENTO = 0.03f;
	
	public ContaPoupanca(String numeroConta, String agencia, String nome, String cpf,
			String dataAbertura) {
		super(numeroConta, agencia, nome, cpf, dataAbertura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void transferencia(Conta contaDestino, float valorTransferido) {
		// TODO Auto-generated method stub
		
	}
	
	

}
