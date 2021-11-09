package behavioral.mediator;

public class Comprador {

	private Mediator mediator;

	public Comprador(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public void verProdutos() {
		mediator.verProdutos();
	}
	
	public void comprar(String id) {
		mediator.comprar(id);
	}
}
