import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercaoComParametro {

	public static void main(String[] args) throws SQLException {

		String nome = "Mouse'";
		String descricao = "Mouse sem fio); delete from produto";
		ConnectionFactory cf = new ConnectionFactory();
		Connection connection = cf.recuperarConexao();

		PreparedStatement pstm = connection.prepareStatement("INSERT INTO PRODUTO (nome, descricao) VALUES (?, ?)",
				Statement.RETURN_GENERATED_KEYS);

		pstm.setString(1, nome);
		pstm.setString(2, descricao);
		pstm.execute();

		ResultSet rst = pstm.getGeneratedKeys();

		while (rst.next()) {
			Integer id = rst.getInt(1);
			System.out.println("O id criado foi: " + id);
		}
		rst.close();

	}
}
