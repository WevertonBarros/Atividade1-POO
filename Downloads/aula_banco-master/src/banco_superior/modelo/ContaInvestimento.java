package banco_superior.modelo;

public class ContaInvestimento extends Conta{

	
	public ContaInvestimento(String numeroConta, String agencia, String nome, String cpf, String dataAbertura) {
		super(numeroConta, agencia, nome, cpf, dataAbertura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void transferencia(Conta contaDestino, float valorTransferido) {
		// TODO Auto-generated method stub
		
	}
	
	

}
