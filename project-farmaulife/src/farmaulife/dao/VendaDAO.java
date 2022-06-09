package farmaulife.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import farmaulife.model.Venda;

public class VendaDAO {

	public void cadastrarVenda(Venda venda) throws ExceptionDAO {

		String sql = "insert into Venda (valorTotalVenda, dataVenda, nomeCliente, sobrenomeCliente, cpfCliente) value (?,?,?,?,?)";
		PreparedStatement pStatement = null;
		Connection connection = null;

		try {
			connection = new ConnectionMVC().getConnetion();
			pStatement = connection.prepareStatement(sql);
			pStatement.setDouble(1, venda.getValorTotal());
			pStatement.setDate(2, new Date(venda.getDataVenda().getTime()));
			pStatement.setString(3, venda.getNomeCliente());
			pStatement.setString(4, venda.getSobrenomeCliente());
			pStatement.setString(5, venda.getCpfCliente());
			pStatement.execute();
		} catch (SQLException e) {
			throw new ExceptionDAO("Erro ao cadastrar o admin: " + e);
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
