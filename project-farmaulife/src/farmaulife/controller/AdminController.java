package farmaulife.controller;

import farmaulife.dao.ExceptionDAO;
import farmaulife.model.Admin;

public class AdminController {

	public boolean cadastrarAdmin(String nomeAdmin, String emailAdmin, String senhaAdmin)
			throws ExceptionDAO {

		if (nomeAdmin != null && nomeAdmin.length() > 0 && emailAdmin != null && emailAdmin.length() > 0
				&& senhaAdmin != null && senhaAdmin.length() > 0) {

			Admin admin = new Admin(nomeAdmin, emailAdmin, senhaAdmin);
			admin.cadastrarAdmin(admin);
			return true;
		}
		return false;
	}
}
