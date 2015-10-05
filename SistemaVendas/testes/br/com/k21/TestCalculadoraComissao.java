package br.com.k21;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCalculadoraComissao {
	
	@Test
	public void calcularVendaDe1000Retornando50() {
		Double venda = 1000.0;
		Double esperado = 50.0;
		
		CalculadoraComissao cc = new CalculadoraComissao();
		Double comissao = cc.calcular(venda);
		
		assertEquals(esperado, comissao);
	}
	
	@Test
	public void calcularVendaDe1Retornando5cents() {
		Double venda = 1.0;
		Double esperado = 0.05;
		
		CalculadoraComissao cc = new CalculadoraComissao();
		Double comissao = cc.calcular(venda);
		
		assertEquals(esperado, comissao);
	}
	
	@Test
	public void calcularVendaDe10000Retornando500() {
		Double venda = 10000.0;
		Double esperado = 500.0;
		
		CalculadoraComissao cc = new CalculadoraComissao();
		Double comissao = cc.calcular(venda);
		
		assertEquals(esperado, comissao);
	}
}

