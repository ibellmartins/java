package aulaJava;

import java.util.Scanner;
public class Ex3 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe seu nome: ");
		String name = sc.nextLine();
		
		System.out.println("Olá, Sr(a) "+ name + "! é um prazer te conhecer!");
		
		sc.close();
	}
}


