package TestesAppCalculadora;

import static org.junit.Assert.*;

import org.junit.Test;

import FontesAppCalculadora.CalculadoraAritmetica;

public class CalculadoraAritmeticaTeste {

	// Atributos de comparação de resultado
	private int resultadoReal;
	private int resultadoEsperado;
	
	// Testes de soma
	@Test
	public void testeSomar2com3() {
		resultadoEsperado = 5;
		CalculadoraAritmetica calc = new CalculadoraAritmetica();
		resultadoReal = calc.somar(2, 3);
		// O assertEquals faz uma comparação entre os resultados possíveis
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	// IMPORTANTE: Não esquecer de colocar o @ em cada teste -> Sem o @ o teste específico não roda!!
	@Test
	public void testeSomar5com3() {
		resultadoEsperado = 8;
		CalculadoraAritmetica calc = new CalculadoraAritmetica();
		resultadoReal = calc.somar(2, 3);
		// O assertEquals faz uma comparação entre os resultados possíveis
		assertEquals(resultadoEsperado, resultadoReal);
	}


}
