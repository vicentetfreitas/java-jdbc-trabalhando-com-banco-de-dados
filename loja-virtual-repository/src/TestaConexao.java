import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {

		/*Criando inst�ncia de conex�o com banco de dados*/
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC", "root", "@dmin");

		System.out.println("Fechando conex�o!!!");

		/*Fechando inst�ncia de conex�o com banco de dados;*/
		connection.close();

	}

}
