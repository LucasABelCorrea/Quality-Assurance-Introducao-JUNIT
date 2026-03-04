
package TestesAppCalculadora;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import FontesAppCalculadora.CalculadoraAritmetica;

public class CalculadoraAritmeticaTeste {
	// Atributos de controle do teste
	private static int numeroTeste = 0;
	private String nomeTeste = "";

	// Atributos de comparação de resultado
	private double resultadoReal;
	private double resultadoEsperado;
	
	// IMPORTANTE: Não esquecer de colocar o @ em cada teste -> Sem o @ o teste específico não roda!!
	
	//PREPARAÇÃO DO TESTE (@Before)
	
	@Before
	public void preparaTeste() {
		numeroTeste += 1;
		System.out.println("Iniciando o teste número " + (numeroTeste) + "\n");
	}
	
	
	//ENCERRANDO O TESTE
	
	@After
	public void encerraTeste() {
		System.out.println(nomeTeste + resultadoReal);
		System.out.println();
	}
	
	
	// Testes de soma
	@Test
	public void testeSomar2com3() {
		
		nomeTeste = "Teste de soma de 2 com 3: ";
		
		resultadoEsperado = 5;
		CalculadoraAritmetica calc = new CalculadoraAritmetica();
		resultadoReal = calc.somar(2, 3);
	
		// O assertEquals faz uma comparação entre os resultados possíveis
		assertEquals(resultadoEsperado, resultadoReal, 0);
		
		
	}
	
	
	@Test
	public void testeSubtrair3de5() {
		
		nomeTeste = "Teste de subtração de 3 de 5: ";
		
		resultadoEsperado = 2;
		CalculadoraAritmetica calc = new CalculadoraAritmetica();
		resultadoReal = calc.subtrair(5, 3);
		
		// O assertEquals faz uma comparação entre os resultados possíveis
		assertEquals(resultadoEsperado, resultadoReal,0.1);
	}
	
	@Test
	public void testeMultiplicar2com3() {
		
		nomeTeste = "Teste de multiplicar 2 com 3: ";
		
		resultadoEsperado = 6;
		CalculadoraAritmetica calc = new CalculadoraAritmetica();
		resultadoReal = calc.multiplicar(2, 3);
		
		assertEquals(resultadoEsperado, resultadoReal, 0);
	}

	@Test
	public void testeDividir3por7() {
		
		nomeTeste = "Teste de dividir 3 por 7: ";
		
		resultadoEsperado = 0.4285;
		CalculadoraAritmetica calc = new CalculadoraAritmetica();
		resultadoReal = calc.dividir(3, 7);
		
		assertEquals(resultadoEsperado, resultadoReal, 0.0001); 
		//Coloquei esse parâmetro no final pois o retorno dessa operação é
		//uma dizima periódica, portanto eu defini quantas casas decimais eu quero, no caso, 4 casas decimais
	}

}
