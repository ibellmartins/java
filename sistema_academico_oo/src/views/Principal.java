package views;
import java.util.Scanner;
import model.Aluno;
import model.Curso;

public class Principal {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner (System.in);
		Aluno aluno = new Aluno(); 
		Curso curso = new Curso();
		
		System.out.println("--DADOS DO ALUNO--");
		
		System.out.print(" RA: ");
		aluno.ra = scn.nextInt();
		scn.nextLine();
		
		System.out.print("nome:");
		aluno.nome = scn.nextLine();
		
		System.out.print("Idade: ");
		aluno.idade = scn.nextInt();
		
		System.out.print("CPF: ");
		aluno.cpf = scn.nextLong();
		scn.nextLine();
		
		System.out.print("Sexo: ");
		aluno.sexo = scn.nextLine().charAt(0);
		
		System.out.println("--- DADOS DO CURSO --- ");
		System.out.print("nome do curso: ");
		curso.nome = scn.nextLine();
		
		System.out.print("carga horaria: ");
		curso.ch = scn.nextInt();
		scn.nextLine();
		
		System.out.print("tipo do curso: ");
		curso.tipo = scn.nextLine();
		
		System.out.print("nome do curso: ");
		aluno.nome = scn.nextLine();
		
		System.out.print("Valor da mensalidade: ");
		curso.valorTotal = scn.nextFloat();
		
		aluno.curso = curso; 
		scn.close();
	}
}
