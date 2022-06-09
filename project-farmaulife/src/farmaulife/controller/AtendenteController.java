package farmaulife.controller;

import farmaulife.dao.ExceptionDAO;
import farmaulife.model.Atendente;

public class AtendenteController {

	public boolean cadastrarAtendente(String nomeAtendente, String sobrenomeAtendente, String emailAtendente,
			String senhaAtendente) throws ExceptionDAO {

		if (nomeAtendente != null && nomeAtendente.length() > 0 && sobrenomeAtendente != null
				&& sobrenomeAtendente.length() > 0 && emailAtendente != null && emailAtendente.length() > 0
				&& senhaAtendente != null && senhaAtendente.length() > 0) {

			Atendente atendente = new Atendente(nomeAtendente, sobrenomeAtendente, emailAtendente, senhaAtendente);
			atendente.cadastrarAtendente(atendente);
			return true;
		}
		return false;
	}

}
