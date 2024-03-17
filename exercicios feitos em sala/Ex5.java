package aulaJava;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("digite os minutos: ");
		double minutos = sc.nextInt();
		
		System.out.print("Digite a porcentagem de aprendizado: ");
		float porcent = sc.nextFloat();
		
		System.out.print("digite o dia da semana: ");
		String diaSemana = sc.nextLine();
		
		sc.close();
	}
	
}
