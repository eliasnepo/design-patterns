package behavioral.observerAndCommand;

import java.time.LocalDateTime;
import java.util.List;

import behavioral.chainofresponsibility2.Order;
import behavioral.observerAndCommand.acoes.AcaoAposGerarPedido;

// service
public class GeraPedidoHandler {

	// list of observers
	private List<AcaoAposGerarPedido> acoesAposGerarPedido;
	
	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoesAposGerarPedidos) {
		acoesAposGerarPedido = acoesAposGerarPedidos;
	}

	public void executar(GeraPedido geraPedido) {
		Order orcamento = new Order(geraPedido.getValorOrcamento(), geraPedido.getQuantidadeItens());
		Pedido pedido = new Pedido(geraPedido.getCliente(), LocalDateTime.now(), orcamento);

		// call action of observers
		this.acoesAposGerarPedido.forEach(a -> a.executarAcao(pedido));
	}
	
}
