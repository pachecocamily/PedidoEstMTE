package camada_dominio;

import java.util.Iterator;
import java.util.List;

import entidades.Linha;
import entidades.result_set.Resultset;
import entidades.result_set.Tabela;

public class DiscenteMTE {
	
	public static Resultset getRegrasDoDis(Resultset rs, double disciplinasC, double IRA) {
			
			if(disciplinasC >= 80 && IRA >= 6) {
				rs.set("regras", true);
			}
				
			return rs;
		}

	
}
