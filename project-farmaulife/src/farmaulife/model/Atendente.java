package farmaulife.model;

import farmaulife.dao.AtendenteDAO;
import farmaulife.dao.ExceptionDAO;

public class Atendente {

	long idAtendente;
	String nomeAtendente;
	String sobrenomeAtendente;
	String emailAtendente;
	String senhaAtendente;

	public Atendente(String nomeAtendente, String sobrenomeAtendente, String emailAtendente, String senhaAtendente) {
		this.nomeAtendente = nomeAtendente;
		this.sobrenomeAtendente = sobrenomeAtendente;
		this.emailAtendente = emailAtendente;
		this.senhaAtendente = senhaAtendente;

	}

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

	@Override
	public String toString() {
		return "Atendente [idAtendente=" + idAtendente + ", nomeAtendente=" + nomeAtendente + ", sobrenomeAtendente="
				+ sobrenomeAtendente + ", emailAtendente=" + emailAtendente + ", senhaAtendente=" + senhaAtendente
				+ "]";
	}

	public void cadastrarAtendente(Atendente atendente) throws ExceptionDAO {
		new AtendenteDAO().cadastrarAtendente(atendente);

	}
}
