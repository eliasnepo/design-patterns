package behavioral.chainofresponsibility2.discount;

import behavioral.chainofresponsibility2.Order;

public class DiscountByMoreThan5Itens extends Discount {

	public DiscountByMoreThan5Itens(Discount next) {
		super(next);
	}

	@Override
	public Double calculate(Order order) {
		if (order.getQtdItem() > 5) {
			return order.getPrice() * 0.1;
		}
		return next.calculate(order);
	}
}
