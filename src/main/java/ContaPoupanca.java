
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}

	public String toString() {
		return 	"=== Credito Realizado em Conta Poupanca ===\n"+
				"Conta Poupanca:\nNumero: " + Integer.toString(this.agencia) +
				"\nConta: " + Integer.toString(this.numero) +
				"\nSaldo: " + Double.toString(this.saldo) + "\n-------------\n";
	}
}
