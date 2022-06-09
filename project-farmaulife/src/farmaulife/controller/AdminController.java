package farmaulife.controller;

import farmaulife.model.Admin;

public class AdminController {

	public boolean cadastrarAdmin(String nomeAdmin, String sobrenomeAdmin, String emailAdmin, String senhaAdmin,
			String cpfAdmin) {

		if (nomeAdmin != null && nomeAdmin.length() > 0 && sobrenomeAdmin != null && sobrenomeAdmin.length() > 0
				&& emailAdmin != null && emailAdmin.length() > 0 && senhaAdmin != null && senhaAdmin.length() > 0
				&& cpfAdmin != null && cpfAdmin.length() > 0) {
			
			Admin admin = new Admin();
			admin.cadastrarAdmin(admin);
			return true;
		}
			return false;
	}
}
