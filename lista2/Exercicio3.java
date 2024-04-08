/*
Faça um programa que imprima os números ímpares de 1 até 99 na tela, um em cada linha
*/
package lista2;

public class Exercicio3 {
	public static void main (String[] args) {
		for (int i = 1; i < 100; i ++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
	}
}
