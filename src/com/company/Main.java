
package com.company;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {


	private static Object Professor;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Pessoa obj1 = new Pessoa();
		Funcionario obj2 = new Funcionario();
		Professor obj3 = new Professor();
		String nome = "";
		String sobrenome = "";
		String nomeCompleto = nome.concat(sobrenome);
		int matricula;
		double salario;
		double salarioPrimeiraParcela;
		double salarioSegundaParcela;


		System.out.println("Digite seu nome: \n");
		nome = input.next();
		System.out.printf("Seu nome é: " + nome);
		System.out.println("\n Digite seu sobrenome: ");
		sobrenome = input.next();
		System.out.printf("Seu sobrenome é: " + sobrenome);
		System.out.println("\n Nome completo : " + nome + " " + sobrenome);
		System.out.println("Digite seu salario: \n");
		salario = input.nextInt();
		System.out.printf("Seu salario é: " + salario);
		System.out.printf("\nA primeira parcela do seu salario será de: " + salario*0.6);
		System.out.printf("\nA segunda parcela do seu salario será de: " + salario*0.4);






	}
}