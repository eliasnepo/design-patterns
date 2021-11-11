package behavioral.visitor;

import java.util.Arrays;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		Comida comida = new Comida(10.0);
		Cigarro cigarro = new Cigarro(10.0);
		Bebida bebida = new Bebida(10.0);
		ImpostoVisitor imposto = new ImpostoBrasil();

		System.out.println("Valores sem impostos:");
		List<ProdutoVisitavel> asList = Arrays.asList(comida, cigarro, bebida);
		asList.forEach(item -> System.out.println(item.getPrice()));
		
		System.out.println("***************************");
		
		System.out.println("Valores sem impostos:");
		asList.forEach(item -> System.out.println(item.pegarPrecoComImposto(imposto)));
	}
}
