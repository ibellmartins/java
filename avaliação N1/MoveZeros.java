package avaliaçãoN1;
import java.util.Scanner;

public class MoveZeros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("digite a quantidade de numeros que deseja armazenar: ");
		int quantidade = sc.nextInt();
		int[] numeros = new int[quantidade];  
		 
		for (int i = 0; i < quantidade; i++) {
			System.out.print("digite um numero inteiro: ");
			int num = sc.nextInt();
			numeros[i] += num;
		}
		
		int posicao = 0;
		for (int i = 0; i < quantidade; i++) {
			if (numeros[i] != 0) {
				int total = numeros[i];
				numeros[i] = numeros[posicao];
				numeros[posicao] = total;
				posicao ++;
			}
		}
		
		for (int i = 0 ; i < quantidade ; i++) {
			System.out.print(numeros[i] + " ");
		}
		
		sc.close();
	}
}
