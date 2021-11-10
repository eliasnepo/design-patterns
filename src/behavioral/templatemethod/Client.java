package behavioral.templatemethod;

import behavioral.templatemethod.discount.Discount;
import behavioral.templatemethod.discount.DiscountByMoreThan5Itens;
import behavioral.templatemethod.discount.DiscountByPriceMoreThan500;
import behavioral.templatemethod.discount.WithoutDiscount;

public class Client {
	public static void main(String[] args) {
		Discount discount1 = new WithoutDiscount();
		Discount discount2 = new DiscountByMoreThan5Itens(discount1);
		Discount discount3 = new DiscountByPriceMoreThan500(discount2);
		
		System.out.println(discount3.calculate(new Order(600.0, 3)));
	}
}
