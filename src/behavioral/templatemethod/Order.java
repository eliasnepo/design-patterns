package behavioral.templatemethod;

public class Order {

	private Double price;
	private Integer qtdItem;

	public Order(Double price, Integer qtdItem) {
		this.price = price;
		this.qtdItem = qtdItem;
	}

	public Double getPrice() {
		return price;
	}

	public Integer getQtdItem() {
		return qtdItem;
	}
}
