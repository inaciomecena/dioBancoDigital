
public class Main {


	public static void main(String[] args) {

		Cliente cliente = new Cliente("Alexandre", "93580843087", "1111111", "Rua Tteste");


		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

		cc.credito(500);
		System.out.println(cc);

		cc.credito(200);
		System.out.println(cc);


		cc.depositar(250);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();


	}

}
