package banco_superior.modelo;

public class ContaCorrente extends Conta{

	static final float TAXA_MANUTENCAO = 0.01f;
	
	public ContaCorrente(String numeroConta, String agencia, String nome, String cpf, 
			String dataAbertura) {
		super(numeroConta, agencia, nome, cpf,  dataAbertura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void transferencia(Conta contaDestino, float valorTransferido) {
		// TODO Auto-generated method stub
		
		if(contaDestino instanceof ContaPoupanca)
		{
			this.sacar(valorTransferido+(valorTransferido*Conta.TAXA_ADMINISTRACAO));
			contaDestino.depositar(valorTransferido);
		}
		
	}
	
	

}
