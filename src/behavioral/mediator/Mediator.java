package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
	
	private List<Vendedor> vendedores = new ArrayList<>();
	
	public List<Vendedor> getVendedores() {
		return vendedores;
	}

	public void verProdutos() {
		this.vendedores.forEach(vendedor -> vendedor.mostrarProdutos());
	}

	public void comprar(String id) {
		this.vendedores.forEach(vendedor -> vendedor.vender(id));
	}

}
