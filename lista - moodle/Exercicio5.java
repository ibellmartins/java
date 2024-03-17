//Modifique o código anterior de modo a pedir também que seja informado o nome do usuário, personalizando a mensagem que apresenta a idade.
package exerciciosIntrodutorios;
import java.util.Scanner;

public class Exercicio5{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int idade, anoNascimento;
		String nome;
		
		System.out.print("Qual é o seu nome? ");
		nome = sc.next();
		
		System.out.print("Qual é o ano do seu nascimento? ");
		anoNascimento = sc.nextInt();
		
		idade = 2024 - anoNascimento;
		
        System.out.printf("%s, você tem %d anos de idade.",nome,idade);
		
		sc.close();
	}
}