package behavioral.chainofresponsibility2.discount;

import behavioral.chainofresponsibility2.Order;

public abstract class Discount {

	protected Discount next;
	
	public Discount(Discount next) {
		this.next = next;
	}
	
	public abstract Double calculate(Order order);
}
