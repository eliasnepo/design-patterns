package behavioral.strategy;

public class Calculator {

	static Double calculate(Order order, TaxesType type) {
		return type.calculateTaxe(order.getPrice());
	}
	
	
	// With strategy
	public enum TaxesType {
		ICMS {
			@Override
			public Double calculateTaxe(Double amount) {
				return amount * 0.1;
			}
		},
		ISS {
			@Override
			public Double calculateTaxe(Double amount) {
				return amount * 0.06;
			}
		};
		
		public abstract Double calculateTaxe(Double amount);
	}
	
	/* Without strategy
	static Double calculate(Order order, TaxesType type) {
		switch (type) {
		case ICMS:
			return order.getPrice() * 0.1;
		case ISS:
			return order.getPrice() * 0.06;
		default:
			return order.getPrice();
		}
	}
	
	public enum TaxesType {
		ICMS,
		ISS;
	}
	*/
}
