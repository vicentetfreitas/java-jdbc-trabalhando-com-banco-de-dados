import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaRemocao {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory cf = new ConnectionFactory();
		Connection con = cf.recuperarConexao();

		Statement stm = con.createStatement();
		stm.execute("DELETE FROM produto WHERE id > 6");

		Integer linhasModificadas = stm.getUpdateCount();
		System.out.println("Quantidade de linhas que foram modificadas " + linhasModificadas);
	}

}
