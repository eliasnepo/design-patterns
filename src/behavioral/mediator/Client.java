package behavioral.mediator;

public class Client {

	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		
		Vendedor vendedor1 = new Vendedor();
		vendedor1.produtos.add(new Produto("1", "Camiseta", 200.0));
		vendedor1.produtos.add(new Produto("2", "Caneta", 10.0));
		
		Vendedor vendedor2 = new Vendedor();
		vendedor2.produtos.add(new Produto("3", "Short", 20.0));
		vendedor2.produtos.add(new Produto("4", "Notebook", 1000.0));
		
		mediator.getVendedores().add(vendedor1);
		mediator.getVendedores().add(vendedor2);
		
		// ----------
		
		Comprador comprador = new Comprador(mediator);
		comprador.verProdutos();
		comprador.comprar("2");
		comprador.comprar("3");
		System.out.println("-----------");
		comprador.verProdutos();
	}
}
