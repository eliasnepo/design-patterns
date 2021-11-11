package behavioral.visitor;

public class Comida extends ProdutoVisitavel {

	public Comida(Double price) {
		super("Comida", price);
	}

	@Override
	Double pegarPrecoComImposto(ImpostoVisitor visitor) {
		return visitor.calcularTaxaParaComida(this);
	}

}
