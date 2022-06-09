package farmaulife.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import farmaulife.model.Atendente;

public class AtendenteDAO {

	public void cadastrarAtendente(Atendente atendente) throws ExceptionDAO {

		String sql = "insert into Atendente (nomeAtendente, sobrenomeAtendente, emailAtendente, senhaAtendente) value (?,?,?,?)";
		PreparedStatement pStatement = null;
		Connection connection = null;

		try {
			connection = new ConnectionMVC().getConnetion();
			pStatement = connection.prepareStatement(sql);
			pStatement.setString(1, atendente.getNomeAtendente());
			pStatement.setString(2, atendente.getSobrenomeAtendente());
			pStatement.setString(3, atendente.getEmailAtendente());
			pStatement.setString(4, atendente.getSenhaAtendente());
			pStatement.execute();
		} catch (SQLException e) {
			throw new ExceptionDAO("Erro ao cadastrar o atendente: " + e);
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
