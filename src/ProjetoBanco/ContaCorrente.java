package ProjetoBanco;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}
		
	public void ImprimirStatus() {
		System.out.println("Conta Corrente");
		super.informacoesComuns();
	}
	
}
