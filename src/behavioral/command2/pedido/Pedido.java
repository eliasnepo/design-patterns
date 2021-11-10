package behavioral.command2.pedido;

import java.time.LocalDateTime;

import behavioral.chainofresponsibility2.Order;

public class Pedido {

	private String cliente;
	private LocalDateTime data;
	private Order order;

	public Pedido(String cliente, LocalDateTime data, Order order) {
		this.cliente = cliente;
		this.data = data;
		this.order = order;
	}

	public String getCliente() {
		return cliente;
	}

	public LocalDateTime getData() {
		return data;
	}

	public Order getOrcamento() {
		return order;
	}

}
