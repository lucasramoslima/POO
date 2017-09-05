package locadora;

public class Teste {
	public static void main(String[] args) {
		
		
		Cliente c = new Cliente("1", "Lucas", "123", "3845", "Rua Lalá");
		ClienteDAO cdao= new ClienteDAO();
		cdao.cadastrar(c);
		
		
	}
}
