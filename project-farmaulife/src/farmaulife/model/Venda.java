package farmaulife.model;

import java.util.ArrayList;
import java.util.Date;

import farmaulife.dao.ExceptionDAO;
import farmaulife.dao.ProdutoDAO;
import farmaulife.dao.VendaDAO;

public class Venda {
	long idVenda;
	String nomeCliente;
	String sobrenomeCliente;
	String cpfCliente;
	double valorTotal;
	Date dataVenda;
	ArrayList<Produto> produtos = new ArrayList<Produto>();

	public Venda() {
	}

	public Venda(double valorTotal, Date dataVenda, String nomeCliente, String sobrenomeCliente, String cpfCliente) {
		this.valorTotal = valorTotal;
		this.dataVenda = dataVenda;
		this.nomeCliente = nomeCliente;
		this.sobrenomeCliente = sobrenomeCliente;
		this.cpfCliente = cpfCliente;

	}

	public long getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(long idVenda) {
		this.idVenda = idVenda;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getSobrenomeCliente() {
		return sobrenomeCliente;
	}

	public void setSobrenomeCliente(String sobrenomeCliente) {
		this.sobrenomeCliente = sobrenomeCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

	@Override
	public String toString() {
		return "Venda [idVenda=" + idVenda + ", nomeCliente=" + nomeCliente + ", sobrenomeCliente=" + sobrenomeCliente
				+ ", cpfCliente=" + cpfCliente + ", valorTotal=" + valorTotal + ", dataVenda=" + dataVenda
				+ ", produtos=" + produtos + "]";
	}

	public void cadastrarVenda(Venda venda) throws ExceptionDAO {
		new VendaDAO().cadastrarVenda(venda);
	}
}
