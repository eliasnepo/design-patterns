package behavioral.templatemethod.discount;

import behavioral.templatemethod.Order;

public class WithoutDiscount extends Discount {

	public WithoutDiscount() {
		super(null);
	}

	@Override
	protected Double applyDiscount(Order order) {
		return 0.0;
	}

	@Override
	protected boolean shouldApply(Order order) {
		return super.next == null;
	}

}
