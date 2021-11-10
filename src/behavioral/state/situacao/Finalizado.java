package behavioral.state.situacao;

import java.math.BigDecimal;

import behavioral.state.Orcamento;

public class Finalizado extends SituacaoOrcamento {

	@Override
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orcamento finalizado nao pode ter desconto extra!");
	}

}
