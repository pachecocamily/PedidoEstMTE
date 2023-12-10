package entidades;

import entidades.result_set.Tabela;

public class TabelaDiscente extends Tabela{

	public TabelaDiscente() {
		super("Discente");
		
		this.addColuna("IRA");
		this.addColuna("disciplinas");
		
		this.addColuna("getInfoIRAeDisciplinasC");
	}
	
	public void addNovoDiscente(String nomeDis, double IRA, double cargaH, double disciplinasC, String endereco) {
		Linha novaLinha = new LinhaTabelaDiscente(nomeDis, IRA, cargaH, disciplinasC, endereco);
		this.addLinha(novaLinha);
	}

}
