package behavioral.visitor;

public interface ImpostoVisitor {

	Double calcularTaxaParaComida(Comida comida);
	Double calcularTaxaParaCigarro(Cigarro cigarro);
	Double calcularTaxaParaBebida(Bebida bebida);
}
