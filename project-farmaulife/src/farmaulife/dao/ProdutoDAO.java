package farmaulife.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import farmaulife.model.Admin;
import farmaulife.model.Produto;

public class ProdutoDAO {

	public void cadastrarProduto(Produto produto) throws ExceptionDAO {

		String sql = "insert into Produto (nomeProduto, valorProduto, tipoProduto) value (?,?,?)";
		PreparedStatement pStatement = null;
		Connection connection = null;

		try {
			connection = new ConnectionMVC().getConnetion();
			pStatement = connection.prepareStatement(sql);
			pStatement.setString(1, produto.getNomeProduto());
			pStatement.setDouble(2, produto.getValorProduto());
			pStatement.setString(3, produto.getTipoProduto());
			pStatement.execute();
		} catch (SQLException e) {
			throw new ExceptionDAO("Erro ao cadastrar o produto: " + e);
		} finally {
			try {
				if (pStatement != null) {
					pStatement.close();
				}
			} catch (SQLException e) {
				throw new ExceptionDAO("Erro ao fechar o Statemente: " + e);
			}
			try {
				if (connection != null) {
					connection.close();

				}
			} catch (SQLException e) {
				throw new ExceptionDAO("Erro ao fechar a conexão " + e);
			}
		}
	}
}
