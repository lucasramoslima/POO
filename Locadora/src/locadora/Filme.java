package locadora;

/*
 * Exemplo de Abstração de Dados
 */
public class Filme {
	//Exemplo de encapsulamento																																																																																							
	private String nome;
	private String diretor;
	private String genero;
	private int ano;
	
	public Filme(String nome, String diretor, String genero, int ano) {
		this.nome = nome;
		this.diretor = diretor;
		this.genero = genero;
		this.ano = ano;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
}
