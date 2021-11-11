package behavioral.visitor;

public abstract class ProdutoVisitavel {

	protected String name;
	protected Double price;
	
	public ProdutoVisitavel(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}



	public Double getPrice() {
		return price;
	}

	abstract Double pegarPrecoComImposto(ImpostoVisitor visitor);
}
