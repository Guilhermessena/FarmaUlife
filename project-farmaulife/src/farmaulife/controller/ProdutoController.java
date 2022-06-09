package farmaulife.controller;

import farmaulife.model.Produto;

public class ProdutoController {

	public boolean cadastrarProduto(String nomeProduto, double valorProduto, String tipoProduto) {

		if (nomeProduto != null && nomeProduto.length() > 0 && valorProduto > 0 && tipoProduto != null
				&& tipoProduto.length() > 0) {

			Produto produto = new Produto();
			produto.cadastrarProduto(produto);
			return true;
		}
		return false;
	}
}
