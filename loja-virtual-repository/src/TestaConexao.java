import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {

		/*Criando instância de conexão com banco de dados*/

		ConnectionFactory cf = new ConnectionFactory();
		Connection con = cf.recuperarConexao();

		System.out.println("Fechando conexão!!!");

		/*Fechando instância de conexão com banco de dados;*/
		con.close();

	}

}
