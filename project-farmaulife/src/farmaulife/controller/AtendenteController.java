package farmaulife.controller;

import farmaulife.model.Atendente;

public class AtendenteController {

	public boolean cadastrarAtendente(String nomeAtendente, String sobrenomeAtendente, String emailAtendente,
			String senhaAtendente, String cpfAtendente) {

		if (nomeAtendente != null && nomeAtendente.length() > 0 && sobrenomeAtendente != null
				&& sobrenomeAtendente.length() > 0 && emailAtendente != null && emailAtendente.length() > 0
				&& senhaAtendente != null && senhaAtendente.length() > 0 && cpfAtendente != null
				&& cpfAtendente.length() > 0) {

			Atendente atendente = new Atendente();
			atendente.cadastrarAtendente(atendente);
			return true;
		}
		return false;
	}

}
