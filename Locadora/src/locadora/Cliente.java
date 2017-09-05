package locadora;

/*
 * Exemplo de uma classe e herança
 */
public class Cliente extends Pessoa {
	private String id;

	public Cliente(String id, String nome, String cpf, String telefone, String endereco) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	
	public Cliente(){
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
