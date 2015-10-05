package br.com.k21;

public class CalculadoraComissao {

	public Double calcular(Double venda) {
		if(venda<=10000.0) {
			return venda*0.05;
		}
		return venda*0.06;
	}

}
