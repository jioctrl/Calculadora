package calculadora;

public class Calculadora {
	public int resultado = 0;
	
	public int calculadora(int a, int b, int c, String op) {
		if (op.equals("+")) {
			resultado = a + b;
		 }else if (op.equals("-")) {
			resultado = a - b;
		} else if (op.equals("*")) {
			resultado = a * b;
		} else if (op.equals("/")) {
			if(b == 0) {
				System.out.println("Divisão por 0, operação irregular.");
				resultado = 0;
			}else {
			resultado = a / b;
			}
		} else {
			System.out.println("Operação inválida.");
		}
		
		return resultado;
	}
}
