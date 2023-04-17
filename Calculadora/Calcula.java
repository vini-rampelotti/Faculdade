package Calculadora;

import java.util.Scanner;

public class Calcula {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int oper;
		int n1;
		int n2;
		
		System.out.println("Qual operação você deseja efetuar?");
		System.out.println("(1- Adição 2- Subtração 3- Multiplicação 4- Divisão)");
		oper = scan.nextInt();
		
		System.out.println("1º Número: ");
		n1 = scan.nextInt();
		System.out.println("2º Número: ");
		n2 = scan.nextInt();
		
		if (oper == 1) {
			System.out.printf("Resultado: "+ (n1 + n2));
		}
		if (oper == 2) {
			System.out.printf("Resultado: "+ (n1 - n2));
		}
		if (oper == 3) {
			System.out.printf("Resultado: "+ (n1 * n2));
		}
		if (oper == 4) {
			System.out.printf("Resultado: "+ (n1 / n2));
		}
		
		scan.close();	
		
	}

}
