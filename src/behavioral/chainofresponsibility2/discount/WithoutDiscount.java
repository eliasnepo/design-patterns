package behavioral.chainofresponsibility2.discount;

import behavioral.chainofresponsibility2.Order;

public class WithoutDiscount extends Discount {

	public WithoutDiscount() {
		super(null);
	}

	@Override
	public Double calculate(Order order) {
		return 0.0;
	}

}
