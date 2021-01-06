package banco_superior.modelo;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Taxa de adm: "+Conta.TAXA_ADMINISTRACAO);
		
		Conta c1 = new ContaCorrente("123", "AA", "Gustavo", "000",  "24-12-2020");

		Conta c2 = new ContaPoupanca("222", "AA", "Maria", "030", "24-12-2020");

		System.out.println("CONTAS CRIADAS SEM SALDO: ");
		System.out.println(c1);
		System.out.println(c2);

		c1.depositar(1000f);
		c2.depositar(100f);
		
		System.out.println("CONTAS COM SALDO: ");
		System.out.println(c1);
		System.out.println(c2);
		
		
		c1.transferencia(c2, 100f);
		
		System.out.println("CONTAS APÓS TRANSFERÊNCIA: ");
		System.out.println(c1);

		System.out.println(c2);
		
		

	}

}
