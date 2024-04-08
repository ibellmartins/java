/*
A tributação de impostos aplica alíquotas diferentes para os produtos, de acordo com a
sua natureza fabril. Implemente um programa que leia o código de
um determinado produto e mostre a sua classificação categórica do fisco, segundo a tabela:
CÓDIGO     CLASSIFICAÇÃO
1          Alimento não-perecível
2, 3 ou 4  Alimento perecível
5 ou 6     Vestuário
7          Higiene pessoal
8, 9, 10   Utensílios domésticos
Outro      Categoria inválida
*/

package lista2;
import java.util.Scanner;

public class Exercicio2 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int codigo;
		System.out.print("Digite o código do produto: ");
		codigo = scan.nextInt();
		
		switch (codigo) {
		case 1:
			System.out.print("Alimento não-perecível");
			break;
		case 2:
		case 3:
		case 4:
			System.out.print("Alimento perecível");
			break;
		case 5:
		case 6:
			System.out.print("Vestuário");
			break;
		case 7:
			System.out.print("Higiene pessoal");
			break;
		case 8:
		case 9: 
		case 10:
			System.out.print("Utensílios domésticos");
			break;
		default: 
			System.out.print("Categoria inválida");
			break; 
		}
		scan.close();
	}
}
