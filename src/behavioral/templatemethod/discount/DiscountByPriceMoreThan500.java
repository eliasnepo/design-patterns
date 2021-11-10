package behavioral.templatemethod.discount;

import behavioral.templatemethod.Order;

public class DiscountByPriceMoreThan500 extends Discount {

	public DiscountByPriceMoreThan500(Discount next) {
		super(next);
	}

	@Override
	protected Double applyDiscount(Order order) {
		return order.getPrice() * 0.15;
	}

	@Override
	protected boolean shouldApply(Order order) {
		return order.getPrice() > 500;
	}
}
