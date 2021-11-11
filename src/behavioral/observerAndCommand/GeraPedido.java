package behavioral.observerAndCommand;

// controller
public class GeraPedido {

	private String cliente;
	private Double valorOrcamento;
	private int quantidadeItens;

	public GeraPedido(String cliente, Double valorOrcamento, int quantidadeItens) {
		this.cliente = cliente;
		this.valorOrcamento = valorOrcamento;
		this.quantidadeItens = quantidadeItens;
	}

	public String getCliente() {
		return cliente;
	}

	public Double getValorOrcamento() {
		return valorOrcamento;
	}

	public int getQuantidadeItens() {
		return quantidadeItens;
	}

}
