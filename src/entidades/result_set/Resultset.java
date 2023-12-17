package entidades.result_set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import entidades.Linha;
import entidades.TabelaPedido;
import entidades.TabelaDiscente;

public class Resultset {

	private Map<String, Tabela> tabelas;

	public Resultset() {
		tabelas = new HashMap<String, Tabela>();
	}

	public void addTabela(String nomeTabela, Tabela novaTabela) {
		tabelas.put(nomeTabela, novaTabela);
	}

	public Tabela getTabela(String nomeTabela) {
		return tabelas.get(nomeTabela);
	}

	public Iterator<Linha> getLinhas(String nomeTabela){
		Tabela tabela = getTabela(nomeTabela);
		return tabela.iterador();
	}
	
	// métodos
	
	private void setRegrasDoDis(boolean regrasDoDis) {
		TabelaDiscente discente = (TabelaDiscente)tabelas.get("discente");
		Linha linhaUnica = discente.getLinha(0);
		linhaUnica.setValor("regrasDoDis", regrasDoDis);
		
	};
	
	public void set(String regras, boolean atendeRequisito) {
		if (atendeRequisito) {
            setRegrasDoDis(true);
		}
	}
}
