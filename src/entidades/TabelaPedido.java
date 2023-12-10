package entidades;

import entidades.result_set.Tabela;

public class TabelaPedido extends Tabela{
	
	public TabelaPedido() {
		super("pedido");
		
		this.addColuna("primeiroEstagio");
		this.addColuna("empresa");
		this.addColuna("endEmpresa");
		this.addColuna("modEstagio");
		this.addColuna("cargaHS");
		this.addColuna("valorB");
		this.addColuna("atividades");
		this.addColuna("disciplinasRel");
		this.addColuna("motivoEst");
	}
	
	public void addNovoPedido(boolean primeiroEstagio, String empresa, String endEmpresa, String modEstagio,
			double cargaHS, double valorB, String atividades, String disciplinasRel, String motivoEst) {
		Linha novaLinha = new LinhaTabelaPedido(primeiroEstagio, empresa, endEmpresa, modEstagio,
				cargaHS, valorB, atividades, disciplinasRel, motivoEst);
		this.addLinha(novaLinha);
	}
}
