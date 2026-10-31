package calculadora;

public class Calculadora {
	public int resultado = 0;
	
	public int calcular(int a, int b, String operador) {
		if (operador.equals("+")) {
			resultado = a + b;
		 }else if (operador.equals("-")) {
			resultado = a - b;
		} else if (operador.equals("*")) {
			resultado = a * b;
		} else if (operador.equals("/")) {
			if(b != 0) {
				resultado = a / b;
			}else {
				System.out.println("Divisão por 0, operação irregular.");
				resultado = 0;
			}
		} else {
			System.out.println("Operação inválida.");
		}
		
		System.out.println("Resultado: " + resultado);
		return resultado;
	}
}