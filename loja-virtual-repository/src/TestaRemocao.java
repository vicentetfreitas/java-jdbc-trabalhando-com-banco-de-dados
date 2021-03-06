import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestaRemocao {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory cf = new ConnectionFactory();
		Connection con = cf.recuperarConexao();

		PreparedStatement pstm = con.prepareStatement("DELETE FROM produto WHERE id > 6");
		pstm.execute();

		Integer linhasModificadas = pstm.getUpdateCount();
		System.out.println("Quantidade de linhas que foram modificadas " + linhasModificadas);
	}

}
