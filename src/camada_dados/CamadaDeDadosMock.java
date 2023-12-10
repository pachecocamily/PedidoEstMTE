package camada_dados;

import entidades.TabelaDiscente;
import entidades.TabelaPedido;
import entidades.result_set.Resultset;
import entidades.result_set.Tabela;

public class CamadaDeDadosMock implements CamadaDeDadosInterface{
	
	@Override
	public Resultset buscaDadosDis(String nomeDis, double IRA, double cargaH, double disciplinasC, String endereco) {
		
		// 1.1
		Resultset rs = new Resultset();
		
		TabelaDiscente tabelaDiscente = new TabelaDiscente();
		rs.addTabela("discente", tabelaDiscente);
		tabelaDiscente.addNovoDiscente(nomeDis, IRA, cargaH, disciplinasC, endereco);
		
		TabelaPedido tabelaPedido = new TabelaPedido();
		rs.addTabela("pedido", tabelaPedido);
		
		return rs;
	}
	
	@Override
	public Resultset informarDadosEst(boolean primeiroEstagio, String empresa, String endEmpresa, String modEstagio,
			double cargaHS, double valorB, String atividades, String disciplinasRel, String motivoEst) {
		TabelaPedido tabelaPedido = new TabelaPedido ();
		
		Resultset rs = new Resultset();
		
		rs.addTabela("primeiro estágio", tabelaPedido);
		rs.addTabela("empresa", tabelaPedido);
		rs.addTabela("endereço da empresa", tabelaPedido);
		rs.addTabela("primeiro estágio", tabelaPedido);
		rs.addTabela("modalidade do estágio", tabelaPedido);
		rs.addTabela("carga horária semanal", tabelaPedido);
		rs.addTabela("valor da bolsa", tabelaPedido);
		rs.addTabela("resumo das atividades", tabelaPedido);
		rs.addTabela("relação das disciplinas", tabelaPedido);
		rs.addTabela("motivo da intenção de estágio", tabelaPedido);
		
		return rs;
	}
	
	@Override
	public void armazenarPedidos(Resultset rs) {}
}
