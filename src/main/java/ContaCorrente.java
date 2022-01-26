
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}

	public String toString() {
		return 	"=== Credito Realizado em Conta Corrente ===\n"+
				"Conta Corrente:\nNumero: " + Integer.toString(this.agencia) +
				"\nConta: " + Integer.toString(this.numero) +
				"\nSaldo: " + Double.toString(this.saldo) + "\n-------------\n";
	}
	
}
