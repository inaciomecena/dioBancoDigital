import lombok.Getter;
import lombok.Setter;

@Getter @Setter

public class Cliente {

	private String nome;
	private String cpf;
	private String Celular;
	private String Endereco;

	public Cliente(String nome, String cpf, String Celular, String Endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.Celular = Celular;
		this.Endereco = Endereco;
	}


}