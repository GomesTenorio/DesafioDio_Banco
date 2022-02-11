package ProjetoBanco;

public class ContaPoupanca extends Conta {
	
		public ContaPoupanca(Cliente cliente) {
			super(cliente);
		}
		
	
	public void ImprimirStatus() {
		System.out.println("Conta Poupança");
		super.informacoesComuns();
	}
	
}

	

