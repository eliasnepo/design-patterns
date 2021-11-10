package behavioral.chainofresponsibility2.discount;

public class CalculatorDiscount {

	/* Without chain of responsibility
	static Double calculate(Order order) {
		if (order.getPrice() > 500) {
			return order.getPrice() * 0.15;
		}
		if (order.getQtdItem() > 5) {
			return order.getPrice() * 0.1;
		}
		return 0.0;
	}
	*/
}
