package behavioral.templatemethod.discount;

import behavioral.templatemethod.Order;

public class DiscountByMoreThan5Itens extends Discount {

	public DiscountByMoreThan5Itens(Discount next) {
		super(next);
	}

	@Override
	protected Double applyDiscount(Order order) {
		return order.getPrice() * 0.1;
	}

	@Override
	protected boolean shouldApply(Order order) {
		return order.getQtdItem() > 5;
	}
}
