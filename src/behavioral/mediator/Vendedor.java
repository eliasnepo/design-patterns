package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Vendedor {

	public List<Produto> produtos = new ArrayList<>();
	private Mediator mediator;
	
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public void mostrarProdutos() {
		this.produtos.forEach(produto -> System.out.println(produto));
	}
	
	public void adicionarProduto(Produto produto) {
		this.produtos.add(produto);
	}
	
	public void vender(String id) {
		List<Produto> novaLista = produtos.stream()
		.filter(produto -> produto.getId().equals(id))
		.collect(Collectors.toList());
		
		if (novaLista.isEmpty()) {
			return;
		}
		
		Produto produto = novaLista.get(0);
		this.produtos.remove(produto);
	}
	
}
