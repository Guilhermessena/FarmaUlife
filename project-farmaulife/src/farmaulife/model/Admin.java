package farmaulife.model;

import farmaulife.dao.AdminDAO;
import farmaulife.dao.ExceptionDAO;

public class Admin {

	long idAdmin;
	String nomeAdmin;
	String emailAdmin;
	String senhaAdmin;

	public Admin(String nomeAdmin, String emailAdmin, String senhaAdmin) {
		this.nomeAdmin = nomeAdmin;
		this.emailAdmin = emailAdmin;
		this.senhaAdmin = senhaAdmin;

	}

	public long getIdAdmin() {
		return idAdmin;
	}

	public void setIdAdmin(long idAdmin) {
		this.idAdmin = idAdmin;
	}

	public String getNomeAdmin() {
		return nomeAdmin;
	}

	public void setNomeAdmin(String nomeAdmin) {
		this.nomeAdmin = nomeAdmin;
	}

	public String getEmailAdmin() {
		return emailAdmin;
	}

	public void setEmailAdmin(String emailAdmin) {
		this.emailAdmin = emailAdmin;
	}

	public String getSenhaAdmin() {
		return senhaAdmin;
	}

	public void setSenhaAdmin(String senhaAdmin) {
		this.senhaAdmin = senhaAdmin;
	}

	@Override
	public String toString() {
		return "Admin [idAdmin=" + idAdmin + ", nomeAdmin=" + nomeAdmin + ", emailAdmin=" + emailAdmin + ", senhaAdmin="
				+ senhaAdmin + "]";
	}

	public void cadastrarAdmin(Admin admin) throws ExceptionDAO {
		new AdminDAO().cadastrarAdmin(admin);
	}

}
