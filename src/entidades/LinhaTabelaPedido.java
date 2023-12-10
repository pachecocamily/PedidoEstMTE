package entidades;

public class LinhaTabelaPedido extends Linha{
	

	public LinhaTabelaPedido(boolean primeiroEstagio, String empresa, String endEmpresa, String modEstagio,
			double cargaHS, double valorB, String atividades, String disciplinasRel, String motivoEst) {
		valores.put("primeiroEstagio", primeiroEstagio);
		valores.put("empresa", empresa);
		valores.put("endEmpresa", endEmpresa);
		valores.put("modEstagio", modEstagio);
		valores.put("cargaHS", cargaHS);
		valores.put("valorB", valorB);
		valores.put("atividades", atividades);
		valores.put("disciplinasRel", disciplinasRel);
		valores.put("motivoEst", motivoEst);
	}
}