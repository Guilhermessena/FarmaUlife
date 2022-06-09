package farmaulife.model;

public class Atendente {
	
	long idAtendente;
	String nomeAtendente;
	String sobrenomeAtendente;
	String emailAtendente;
	String senhaAtendente;
	String cpfAtendente;
	
	
	public long getIdAtendente() {
		return idAtendente;
	}
	public void setIdAtendente(long idAtendente) {
		this.idAtendente = idAtendente;
	}
	public String getNomeAtendente() {
		return nomeAtendente;
	}
	public void setNomeAtendente(String nomeAtendente) {
		this.nomeAtendente = nomeAtendente;
	}
	public String getSobrenomeAtendente() {
		return sobrenomeAtendente;
	}
	public void setSobrenomeAtendente(String sobrenomeAtendente) {
		this.sobrenomeAtendente = sobrenomeAtendente;
	}
	public String getEmailAtendente() {
		return emailAtendente;
	}
	public void setEmailAtendente(String emailAtendente) {
		this.emailAtendente = emailAtendente;
	}
	public String getSenhaAtendente() {
		return senhaAtendente;
	}
	public void setSenhaAtendente(String senhaAtendente) {
		this.senhaAtendente = senhaAtendente;
	}
	public String getCpfAtendente() {
		return cpfAtendente;
	}
	public void setCpfAtendente(String cpfAtendente) {
		this.cpfAtendente = cpfAtendente;
	}
	@Override
	public String toString() {
		return "Atendente [idAtendente=" + idAtendente + ", nomeAtendente=" + nomeAtendente + ", sobrenomeAtendente="
				+ sobrenomeAtendente + ", emailAtendente=" + emailAtendente + ", senhaAtendente=" + senhaAtendente
				+ ", cpfAtendente=" + cpfAtendente + "]";
	}
	
	public void cadastrarAtendente(Atendente atendente) {
		
	}
}
