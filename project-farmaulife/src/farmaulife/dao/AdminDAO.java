package farmaulife.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import farmaulife.model.Admin;

public class AdminDAO {

	public void cadastrarAdmin(Admin admin) throws ExceptionDAO {

		String sql = "insert into Administrador (nomeAdmin, emailAdmin, senhaAdmin) value (?,?,?)";
		PreparedStatement pStatement = null;
		Connection connection = null;

		try {
			connection = new ConnectionMVC().getConnetion();
			pStatement = connection.prepareStatement(sql);
			pStatement.setString(1, admin.getNomeAdmin());
			pStatement.setString(2, admin.getEmailAdmin());
			pStatement.setString(3, admin.getSenhaAdmin());
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
