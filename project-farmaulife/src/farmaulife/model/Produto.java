package farmaulife.model;

import farmaulife.dao.ExceptionDAO;
import farmaulife.dao.ProdutoDAO;

public class Produto {
	long idProduto;
	String nomeProduto;
	double valorProduto;
	String tipoProduto;

	public Produto(String nomeProduto, double valorPrdouto, String tipoProduto) {
		this.nomeProduto = nomeProduto;
		this.valorProduto = valorPrdouto;
		this.tipoProduto = tipoProduto;

	}

	public long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(long idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}

	public String getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", nomeProduto=" + nomeProduto + ", valorProduto=" + valorProduto
				+ ", tipoProduto=" + tipoProduto + "]";
	}

	public void cadastrarProduto(Produto produto) throws ExceptionDAO {
		new ProdutoDAO().cadastrarProduto(produto);

	}

}
