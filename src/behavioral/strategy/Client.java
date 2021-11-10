package behavioral.strategy;

import behavioral.strategy.Calculator.TaxesType;

public class Client {
	public static void main(String[] args) {
		Order order = new Order(100.0);
		System.out.println(Calculator.calculate(order, TaxesType.ICMS));
		System.out.println(Calculator.calculate(order, TaxesType.ISS));
	}
}
