package ProjetoBanco;

public abstract class Conta implements EConta {

	
	private static int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 0;
		
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL ++;
		this.cliente = cliente;
		
		
	}


	public void sacar(double valor) {
		saldo = saldo - valor;
	}

	public void depositar(double valor) {
		saldo = saldo + valor;
	}

	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
				
	}
		
	protected void informacoesComuns() {
		System.out.println(String.format("Ag�ncia: %d", agencia));
		System.out.println(String.format("N�mero: %d", numero));
		System.out.println(String.format("Saldo: %.2f", saldo));
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	
	
}
