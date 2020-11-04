package br.com.application;

import java.util.Scanner;

import br.com.entities.Calculadora;
import br.com.entities.Tabuada;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		Tabuada tab = new Tabuada();
		char resp;

		do {

			System.out.println("=============== Calculadora ===============\n");
			System.out.println("Escolha a opção abaixo:\n");
			System.out.println("1 - Somar");
			System.out.println("2 - Subtrair");
			System.out.println("3 - Multiplicar");
			System.out.println("4 - Divisão");
			System.out.println("5 - Tabuada");
			System.out.println("6 - Sair");
			System.out.print("Opção: ");

			int escolha = sc.nextInt();

			switch (escolha) {

			case (1):

				System.out.print("Insira o 1º número: ");
				calc.num1 = sc.nextDouble();
				System.out.print("Insira o 2º número: ");
				calc.num2 = sc.nextDouble();
				System.out.println("Resultado: " + calc.num1 + " + " + calc.num2 + " = " + calc.soma());
				break;

			case (2):

				System.out.print("Insira o 1º número: ");
				calc.num1 = sc.nextDouble();
				System.out.print("Insira o 2º número: ");
				calc.num2 = sc.nextDouble();
				System.out.println("Resultado: " + calc.subtracao());
				break;

			case (3):

				System.out.print("Insira o 1º número: ");
				calc.num1 = sc.nextDouble();
				System.out.print("Insira o 2º número: ");
				calc.num2 = sc.nextDouble();
				System.out.println("Resultado: " + calc.multiplicacao());
				break;

			case (4):

				System.out.print("Insira o 1º número: ");
				calc.num1 = sc.nextDouble();
				System.out.print("Insira o 2º número: ");
				calc.num2 = sc.nextDouble();
				System.out.println("Resultado: " + calc.divisao());
				break;

			case (5):

				char respt;

				do {

					System.out.println("Escolha a opcão abaixo:\n");
					System.out.println("1 - Somar;");
					System.out.println("2 - Subtrair");
					System.out.println("3 - Multiplicar");
					System.out.println("4 - Divisão");
					int opcao = sc.nextInt();
					
					switch (opcao) {
					
					case (1):
						
						System.out.print("\nEscolha o denominador: ");
						tab.denominador = sc.nextInt();
						int soma = 0;
						tab.tabSoma(soma);
						break;
					
					case (2):
						
						System.out.print("\nEscolha o denominador: ");
						tab.denominador = sc.nextInt();
						int subtracao = 0;
						tab.tabSubtracao(subtracao);
						break;
					
					case (3):
						
						System.out.print("\nEscolha o denominador: ");
						tab.denominador = sc.nextInt();
						int multiplicacao = 0;
						tab.tabMultiplicacao(multiplicacao);
						break;
						
					case (4):
						
						System.out.print("\nEscolha o denominador: ");
						tab.denominador = sc.nextInt();
	
						if (tab.denominador == 0) {
							System.out.println("Impossivel dividir por 0! ");
	
						} else {
	
							int divisao = 0;
							tab.tabDivisao(divisao);

					}
						break;
				}

					System.out.print("\nDeseja repetir a tabuada (s/n)? ");
					respt = sc.next().charAt(0);

				} while (respt != 'n');
			}

			if (escolha >= 7) {
				System.out.println("\nOperação invalida! ");
			}

			System.out.print("\nDeseja repetir a calculadora (s/n)? ");
			resp = sc.next().charAt(0);

		} while (resp != 'n');

		System.out.print("Calculadora encerrada!");
		sc.close();
	}
}
