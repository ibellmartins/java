/*
 * Desenvolva um programa para a conversão entre escalas de temperatura. O usuário deverá informar uma medida de temperatura dada graus Celsius, 
 * calcular o equivalente em Fahrenheit e apresentar o resultado na tela.
 */

package exerciciosIntrodutorios;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double celsius, fahrenheit;
		
		System.out.print("Informe um valor em Celsius: ");
		celsius = sc.nextDouble();
		
		fahrenheit = (celsius * 9 / 5) + 32;
			
		System.out.printf("Essa tempetatura em Fahrenheit é: %.1f", fahrenheit);
				
		sc.close();
	}
}
