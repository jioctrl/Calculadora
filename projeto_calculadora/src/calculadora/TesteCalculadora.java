package calculadora;

public class TesteCalculadora {
	
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		calc.calc(2, 3, "+"); /* Testando soma, resultado esperado: 5 */
		calc.calc(10, 4, "-"); /* Testando subtração, resultado esperado: 6 */
		calc.calc(3, 5, "*"); /* Testando multiplicação, resultado esperado: 15 */
		calc.calc(8, 2, "/"); /* Testando divisão, resultado esperado: 4 */
		calc.calc(8, 0, "/"); /* Testando divisão por zero, resultado esperado: 0 + mensagem de operação irregular */
		calc.calc(5, 5, "x"); /* Testando caractere de operação inválida, resultado esperado: mensagem de operção inválida */
	}
}