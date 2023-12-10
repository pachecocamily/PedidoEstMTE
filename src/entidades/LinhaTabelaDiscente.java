package entidades;

public class LinhaTabelaDiscente extends Linha{

	protected LinhaTabelaDiscente(String nomeDis, double IRA, double cargaH, double disciplinasC, String endereco) {
		valores.put("nome do discente", nomeDis);
		valores.put("IRA", IRA);
		valores.put("carga horária", cargaH);
		valores.put("disciplinas", disciplinasC);
		valores.put("endereço", endereco);
	}
}
