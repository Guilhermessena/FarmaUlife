package farmaulife.model;

public class Admin {

	long idAdmin;
	String nomeAdmin;
	String sobrenomeAdmin;
	String emailAdmin;
	String senhaAdmin;
	String cpfAdmin;

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

	public String getSobrenomeAdmin() {
		return sobrenomeAdmin;
	}

	public void setSobrenomeAdmin(String sobrenomeAdmin) {
		this.sobrenomeAdmin = sobrenomeAdmin;
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

	public String getCpfAdmin() {
		return cpfAdmin;
	}

	public void setCpfAdmin(String cpfAdmin) {
		this.cpfAdmin = cpfAdmin;
	}

	@Override
	public String toString() {
		return "Admin [idAdmin=" + idAdmin + ", nomeAdmin=" + nomeAdmin + ", sobrenomeAdmin=" + sobrenomeAdmin + ", emailAdmin="
				+ emailAdmin + ", senhaAdmin=" + senhaAdmin + ", cpfAdmin=" + cpfAdmin + "]";
	}

	public void cadastrarAdmin(Admin admin) {

	}

}
