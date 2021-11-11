package behavioral.visitor;

public class ImpostoBrasil implements ImpostoVisitor {

	@Override
	public Double calcularTaxaParaComida(Comida comida) {
		return comida.getPrice() + comida.getPrice() * 0.05;
	}

	@Override
	public Double calcularTaxaParaCigarro(Cigarro cigarro) {
		return cigarro.getPrice() + cigarro.getPrice() * 0.8;
	}

	@Override
	public Double calcularTaxaParaBebida(Bebida bebida) {
		return bebida.getPrice() + bebida.getPrice() * 0.3;
	}

}
