package lista3Exercicios;
import java.util.Scanner;
/*
 1) Crie um programa que receba 10 números inteiros, armazenando-os em um vetor. Em seguida
 * calcule a soma de todos os seus elementos.
 */
public class Exercicio1 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int vetor[] = new int[10];
		int soma = 0;
	
		for (int i = 0; i < vetor.length; i++){
			System.out.printf("informe um valor para a %d posição: ", i+1);
			vetor[i]= sc.nextInt();
			soma+=vetor[i];
		}
		
		System.out.print("\nentrada: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%n", vetor[i]);
		}
		System.out.println("soma dos valores: " + soma);
		sc.close();
	}
}
