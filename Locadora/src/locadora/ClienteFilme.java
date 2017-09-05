package locadora;

import java.util.ArrayList;

public class ClienteFilme {
	private Cliente cliente;
	private ArrayList<Filme> filme;
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public ArrayList<Filme> getFilme() {
		return filme;
	}
	public void setFilme(ArrayList<Filme> filme) {
		this.filme = filme;
	}
}
