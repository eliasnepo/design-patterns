package behavioral.visitor;

public class Cigarro extends ProdutoVisitavel {

	public Cigarro(Double price) {
		super("Cigarro", price);
	}

	@Override
	Double pegarPrecoComImposto(ImpostoVisitor visitor) {
		return visitor.calcularTaxaParaCigarro(this);
	}

}
