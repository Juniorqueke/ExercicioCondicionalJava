package oOP;

import java.util.Scanner;

public class ExercicioCondicional {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero inteiro");
		int num1 = sc.nextInt();
		System.out.println("Digite outro número inteiro");
		int num2 = sc.nextInt();
		System.out.println("Digite mais um número inteiro");
		int num3 = sc.nextInt();

		if ((num1 >= num2 && num1 >= num3)) {
			System.out.println("O maior número é: "+num1);
		} else if ((num2 >= num1 && num2 >= num3)) {
			System.out.println("O maior número é: "+num2);
		}
		else if ((num3 >= num1 && num3 >= num2)) {
			System.out.println("O maior número é: "+num3);
		}

		sc.close();
	}

}
