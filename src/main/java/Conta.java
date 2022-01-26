public abstract class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 810;
	private static int SEQUENCIAL = 14351-0;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected double cpmf;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
		cpmf = valor * 0.38 / 100;

		saldo = this.saldo - valor - cpmf;

	}


	@Override
	public void credito(double valor) {
		this.saldo = this.saldo + valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}


	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("CPF: %s", this.cliente.getCpf()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("CPMF: %.2f", this.cpmf));
		System.out.println(String.format("Saldo: %.2f", this.saldo)+ "\n-------------\n");
	}
}
