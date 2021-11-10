package behavioral.chainofresponsibility2.discount;

import behavioral.chainofresponsibility2.Order;

public class DiscountByPriceMoreThan500 extends Discount {

	public DiscountByPriceMoreThan500(Discount next) {
		super(next);
	}

	@Override
	public Double calculate(Order order) {
		if (order.getPrice() > 500) {
			return order.getPrice() * 0.15;
		}
		return next.calculate(order);
	}
}
