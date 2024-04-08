/*
Faça um programa que calcule e apresente quanto deve ser pago por um produto considerando a
leitura do preço de etiqueta (PE) e o código da condição de pagamento (CP). Utilize para os cálculos
a tabela de condições de pagamento a seguir:
CÓDIGO CONDIÇÃO DE PAGAMENTO
1      À vista em dinheiro ou cheque, com 10% de desconto
2      À vista com cartão de crédito, com 5% de desconto
3      Em 2 vezes, preço normal de etiqueta sem juros
4      Em 3 vezes, preço de etiqueta com acréscimo de 10
*/
package lista2;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o valor da compra: ");
		double preco = scan.nextDouble();
		
		System.out.print("Digite o codigo do produto: ");
		int codigo = scan.nextInt();
		
		double pagamento;
		switch (codigo) {
		case 1:
			pagamento = preco - ((preco * 10)/100);
			System.out.printf("Valor do produto: R$%.2f", pagamento);
			break;
		case 2:
			pagamento = preco - ((preco * 5)/100);
			System.out.printf("Valor do produto: R$%.2f", pagamento);
			break;
		case 3: 
			pagamento = preco/2;
			System.out.printf("Valor do produto: R$%.2f", pagamento);
			break;
		case 4:
			double total = preco + ((preco * 10)/100);
			pagamento = total/3;
			System.out.printf("Valor do produto: R$%.2f", pagamento);
			break;
		}
		scan.close();
	}
}
