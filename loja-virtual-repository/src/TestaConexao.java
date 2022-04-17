import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {

		/*Criando inst�ncia de conex�o com banco de dados*/

		ConnectionFactory cf = new ConnectionFactory();
		Connection con = cf.recuperarConexao();

		System.out.println("Fechando conex�o!!!");

		/*Fechando inst�ncia de conex�o com banco de dados;*/
		con.close();

	}

}
