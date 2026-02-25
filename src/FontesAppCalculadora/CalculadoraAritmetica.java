package FontesAppCalculadora;

public class CalculadoraAritmetica {
	private int resultadoConta = 0;
	
	public int somar (int parametro1, int parametro2) {
		return resultadoConta = parametro1 + parametro2;
	}
	
	public int subtrair (int parametro1, int parametro2) {
		return resultadoConta = parametro1 - parametro2;
	}

	public int multiplicar (int parametro1, int parametro2) {
		return resultadoConta = parametro1 * parametro2;
	}

	public int dividir (int parametro1, int parametro2) {
		return resultadoConta = parametro1 / parametro2;
	}

}
