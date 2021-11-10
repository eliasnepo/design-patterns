package behavioral.command2.pedido;

import java.time.LocalDateTime;

import behavioral.chainofresponsibility2.Order;


public class GeraPedidoHandler {
	
	// injecao de dependencias para servicos de infra
	public GeraPedidoHandler() {
	}

	public void executar(GeraPedido geraPedido) {
		Order orcamento = new Order(geraPedido.getValorOrcamento(), geraPedido.getQuantidadeItens());
		Pedido pedido = new Pedido(geraPedido.getCliente(), LocalDateTime.now(), orcamento);

		// utilizacao dos servicos de infra
		System.out.println("Salvando pedido no banco de dados...");
		System.out.println("Enviando email para cliente sobre pedido...");
	}
	
}
