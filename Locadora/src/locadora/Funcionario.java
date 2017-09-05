package locadora;

public class Funcionario extends Cliente{
	private String funcao;
	
	public Funcionario(String id, String nome, String cpf, String telefone, String endereco) {
		super(id, nome, cpf, telefone, endereco);
		
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
}
