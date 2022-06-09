package farmaulife.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import farmaulife.dao.ExceptionDAO;
import farmaulife.model.Venda;

public class VendaController {
	public boolean cadastrarVenda(double valorTotal, String dataVenda, String nomeCliente, String sobrenomeCliente,
			String cpfCliente) throws ParseException, ExceptionDAO {

		if (valorTotal > 0 && validarData(dataVenda) && nomeCliente != null && nomeCliente.length() > 0
				&& sobrenomeCliente != null && sobrenomeCliente.length() > 0 && cpfCliente != null
				&& cpfCliente.length() > 0) {

			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
			Date data = formato.parse(dataVenda);

			Venda venda = new Venda();
			venda.cadastrarVenda(venda);
			return true;
		}
		return false;
	}

	public boolean validarData(String dataVenda) {
		for (int i = 0; i < dataVenda.length(); i++) {
			if (!Character.isDigit(dataVenda.charAt(i))) {
				if (!(i == 3 || i == 7 || i == 11)) {
					return false;

				}
			}

		}
		return true;

	}
}
