package behavioral.command2;

import behavioral.command2.pedido.GeraPedido;
import behavioral.command2.pedido.GeraPedidoHandler;

public class TestesPedidos {

	public static void main(String[] args) {
		String cliente = "Ana da Silva";
		Double valorOrcamento = 745.99;
		int quantidadeItens = 3;
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler();
		handler.executar(gerador);
	}

}
