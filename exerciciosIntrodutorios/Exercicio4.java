// Faça um programa Java que solicite ao usuário que informe o ano de seu nascimento. Então, calcule e apresente a sua idade na tela.

package exerciciosIntrodutorios;
import java.util.Scanner; //usado para algoritmos que recebem entrada de usuario

public class Exercicio4 {
	public static void main (String[] args) {
		int idade, anoNascimento; 
		Scanner sc = new Scanner (System.in);
		
		System.out.print("digite seu ano de nascimento: ");
		anoNascimento = sc.nextInt();
		
		idade = 2024 - anoNascimento;
		
		System.out.printf("Você tem %d anos de idade",idade);
		sc.close();
	}
}
