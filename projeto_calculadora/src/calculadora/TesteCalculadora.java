package calculadora;

public class TesteCalculadora {
	
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		calc.calcular(2, 3, "+"); /* Testando soma, resultado esperado: 5 */
		calc.calcular(10, 4, "-"); /* Testando subtração, resultado esperado: 6 */
		calc.calcular(3, 5, "*"); /* Testando multiplicação, resultado esperado: 15 */
		calc.calcular(8, 2, "/"); /* Testando divisão, resultado esperado: 4 */
		
		try {
			System.out.println(calc.calcular(8, 0, "/")); /* Testando divisão por zero, resultado esperado: 0 + mensagem de operação irregular */
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(calc.calcular(5, 5, "x")); /* Testando caractere de operação inválida, resultado esperado: mensagem de operção inválida */
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}