package behavioral.visitor;

public class Bebida extends ProdutoVisitavel {

	public Bebida(Double price) {
		super("Bebida", price);
	}

	@Override
	Double pegarPrecoComImposto(ImpostoVisitor visitor) {
		return visitor.calcularTaxaParaBebida(this);
	}

}
