package behavioral.state.situacao;

import java.math.BigDecimal;

import behavioral.state.Orcamento;

public abstract class SituacaoOrcamento {

	public abstract BigDecimal calcularDescontoExtra(Orcamento orcamento);
	
	public void aprovar(Orcamento orcamento) {
		throw new RuntimeException("Orcamento nao pode ser aprovado!");
	}
	
	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("Orcamento nao pode ser reprovado!");
	}
	
	public void finalizar(Orcamento orcamento) {
		throw new RuntimeException("Orcamento nao pode ser finalizado!");
	}

}
