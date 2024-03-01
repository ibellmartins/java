package principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //para importar: ctrl + shift + O --> reprensentará a entrada de dados 
		
		System.out.println("informe sua idade: "); 
		int idade = sc.nextInt(); //entrada de variavel tipo inteira 
		
		
		System.out.println("Saldo em conta: ");
		float saldoEmConta = sc.nextFloat(); //devemos colocar o f na frente quando usarmos float 
		sc.nextLine(); //se nao colocar isso o input do nome vai ser pulado 
		
		System.out.println("digite seu nome: ");
		String nome = sc.nextLine(); //var tipo string 
		
		System.out.println("digite seu sobrenome: ");
		String sobrenome = sc.nextLine();

		System.out.println("digite seu sexo: ");
		//char sexo = sc.nextLine().();
		
		System.out.println("você fuma? [S] Sim | [N] Não: ");
		boolean fumante = false; //var tipo boolean (f/v)
		
		
		System.out.println("Olá " + nome + " " + sobrenome + "! você tem " + idade + " anos");
		
		System.out.println("Você tem" + idade + " anos. Legal!" );
		
		System.out.println("Hoje sua conta está com um saldo de: R$" + saldoEmConta + "(pobre)");
		
		if (fumante) {
			System.out.println("Voce fuma! Blé");
		} else {
			System.out.println("Você não fuma, uhu!");
		}
	}
	
	//sc.close();

}
