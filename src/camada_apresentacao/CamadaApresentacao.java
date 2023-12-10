package camada_apresentacao;

import camada_dominio.DiscenteMTE;
import result_set.Resultset;

public class CamadaApresentacao {
	public static void main(String[] args) {
		
		String nomeDis;
		double IRA;
		double cargaH;
		double disciplinasC;
		String endereco;
		
		// passo 1.1
		Resultset rs = dados.buscaDadosDis(nomeDis, IRA, cargaH, disciplinasC, endereco);
		
		// passo 1.2
		rs = DiscenteMTE.getRegrasDoDis(disciplinasC, IRA);
		
		
	}
}
