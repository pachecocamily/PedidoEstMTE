package camada_dados;

import java.util.List;

import entidades.result_set.Resultset;

public interface CamadaDeDadosInterface {
	
	Resultset buscaDadosDis(String nomeDis, double IRA, double cargaH, double disciplinasC, String endereco);
	Resultset informarDadosEst(boolean primeiroEstagio, String empresa, String endEmpresa, String modEstagio,
			double cargaHS, double valorB, String atividades, String disciplinasRel, String motivoEst);
	void armazenarPedidos(Resultset rs);
}
