package ProjetoBanco;

import java.io.InputStream;
import java.util.Scanner;

public class main  {
	
		private static String escolha;

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente(); 				
		System.out.println("----Cadastro de Cliente----");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Nome: ");
		cliente.setNome(scan.nextLine());
		
		System.out.println("CPF: ");
		cliente.setCpf(scan.nextLine());
		
		//Inserir c�digo para CPF com 11 digitos numericos, mostrar erro caso cpf invalido 
			
		System.out.println("Endere�o: ");
		cliente.setEndereco(scan.nextLine());
		
		System.out.println("Cliente cadastrado com sucesso! \n");
		
		//limpar a tela do terminal aqui antes de seguir
		
		ContaCorrente cc = new ContaCorrente(cliente);
		ContaPoupanca poupanca = new ContaPoupanca(cliente);		

		System.out.println("Conta poupan�a e Conta corrente criadas.");
		System.out.println("Necess�rio realizar deposito em dinheiro acima de R$ 50. \n");
		
		System.out.println("Digite o valor de deposito para Conta corrente: \n");
		cc.depositar(scan.nextDouble());
		
		//se valor < 50 = mensagem de erro "necess�rio inserir valor maior". Em seguida digitar novamente;
		
		System.out.println("Digite o valor de deposito para Conta poupan�a: \n");
		poupanca.depositar(scan.nextDouble());
		
		//se valor < 50 = mensagem de erro "necess�rio inserir valor maior". Em seguida digitar novamente;
	
		System.out.println("Concluido! \n");
		
		//limpar a tela do terminal novamente aqui antes de seguir
		
		System.out.println("---Dados do cliente---");
		
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("CPF: " + cliente.getCpf());
	//	System.out.println("C�digo do Cliente: " + cliente.getCodigo()); // modificar codigo em Cliente
		System.out.println("Endere�o: " + cliente.getEndereco() + "\n");
		
		System.out.println("Informa��es de conta");
		
		cc.ImprimirStatus();
		poupanca.ImprimirStatus();

	}

	}

