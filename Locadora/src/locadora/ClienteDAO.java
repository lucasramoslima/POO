package locadora;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Classe responsável pela comunicação com o banco.
 * 
 * @author lucas
 *
 */
public class ClienteDAO {

	/**
	 * Método para inserir clientes no banco de dados
	 * 
	 * @param cliente
	 */
	public void cadastrar(Cliente cliente) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stm = null;

		try {
			stm = con.prepareStatement("INSERT INTO cliente VALUES (?,?,?,?,?)");
			stm.setInt(1, Integer.parseInt(cliente.getId()));
			stm.setString(2, cliente.getNome());
			stm.setString(3, cliente.getCpf());
			stm.setString(4, cliente.getTelefone());
			stm.setString(5, cliente.getEndereco());
			stm.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ConnectionFactory.closeConnection(con, stm);

	}

	/**
	 * Método para listar Cliente
	 * 
	 * @return
	 */
	public ArrayList<Cliente> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Método para buscar cliente através do CPF
	 * 
	 * @param cpf
	 * @return
	 */
	public Cliente buscar(String cpf) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stm = null;
		ResultSet rs = null; 
		Cliente c= new Cliente();

		try {
			stm = con.prepareStatement("SELECT * FROM cliente WHERE cpf = ?");
			stm.setString(1, cpf);
			rs = stm.executeQuery();
			c = rsCliente(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ConnectionFactory.closeConnection(con, stm);
		return c;
	}
	
	/**
	 * Método para buscar cliente através do Id
	 * @param id
	 * @return
	 */
	public Cliente buscar(int id){
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stm = null;
		ResultSet rs = null; 
		Cliente c= new Cliente();

		try {
			stm = con.prepareStatement("SELECT * FROM cliente WHERE id = ?");
			stm.setInt(1, id);
			rs = stm.executeQuery();
			c = rsCliente(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ConnectionFactory.closeConnection(con, stm);
		return c;
	}

	/**
	 * Método para tranformar resultSet em um cliente
	 * @param rs
	 * @return
	 */
	private Cliente rsCliente(ResultSet rs){
		Cliente c= new Cliente();
		try {
			while(rs.next()){
				c.setId(String.valueOf(rs.getInt("id")));
				c.setCpf(rs.getString("cpf"));
				c.setNome(rs.getString("nome"));
				c.setTelefone(rs.getString("telefone"));
				c.setEndereco(rs.getString("endereco"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}
	
	/**
	 * Método para remover cliente através do CPF
	 * 
	 * @param cpf
	 */
	public void remover(String cpf) {
		// TODO Auto-generated method stub

	}
}
