package camada_apresentacao;

import camada_dados.CamadaDeDadosInterface;
import camada_dados.CamadaDeDadosMock;
import camada_dominio.DiscenteMTE;
import camada_dominio.InfoPedidoMTE;
import camada_dominio.PedidoEstMTE;

import entidades.result_set.Resultset;

public class CamadaApresentacao {
	public static void main(String[] args) {
		
		String nomeDis;
		double IRA;
		double cargaH;
		double disciplinasC;
		String endereco;
		
		// fiz parecido com o dele enquanto não temos o portão de acesso
		CamadaDeDadosInterface dados = new CamadaDeDadosMock();
		
		// passo 2.1
		Resultset rs = dados.buscaDadosDis(nomeDis, IRA, cargaH, disciplinasC, endereco);
		
		// passo 2.1
		rs = DiscenteMTE.getRegrasDoDis(disciplinasC, IRA);
		
		// 2.1
		
	}
}
