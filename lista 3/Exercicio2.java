package lista3Exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		String vetor[] = new String[10];
		
		System.out.println("informe os dados do conjutos (10 valores inteiros):");
		
		vetor= sc.nextLine().split(" ");
		
		sc.close();
	}
}
