package behavioral.templatemethod.discount;

import behavioral.templatemethod.Order;

public abstract class Discount {

	protected Discount next;
	
	public Discount(Discount next) {
		this.next = next;
	}
	
	public Double calculate(Order order) {
		if (shouldApply(order)) {
			return applyDiscount(order);
		}
		return next.calculate(order);
	}
	
	protected abstract Double applyDiscount(Order order);
	protected abstract boolean shouldApply(Order order);
}
