package br.ce.wcaquino.servicos;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.ce.wcaquino.exceptions.NaoPodeDividirPorZeroException;

public class CalculadoraTest {
	
	private Calculadora calculadora;
	
	@Before
	public void setup() {
		calculadora = new Calculadora();
	}
	
	@Test
	public void deveSomarDoisValores() {
		//Cen�rio
		int a = 5;
		int b = 3;
			
		//A��o
		int resultado = calculadora.somar(a,b);
		
		//Verifica��o
		Assert.assertEquals(8, resultado);
	}
	
	@Test
	public void deveSubtrairDoisValores() {
		//Cen�rio
		int a = 5;
		int b = 3;
				
		//A��o
		int resultado = calculadora.subtrair(a,b);
		
		//Verifica��o
		Assert.assertEquals(2, resultado);
	}
	
	@Test
	public void deveDividirDoisValores() throws NaoPodeDividirPorZeroException {
		//Cen�rio
		int a = 6;
		int b = 3;
			
		//A��o
		int resultado = calculadora.dividir(a,b);
		
		//Verifica��o
		Assert.assertEquals(2, resultado);
	}
	
	@Test(expected = NaoPodeDividirPorZeroException.class)
	public void deveLancarExcecaoAoDividirPorZero() throws NaoPodeDividirPorZeroException {
		int a = 10;
		int b = 0;
			
		calculadora.dividir(a,b);
		
	}
	

}
