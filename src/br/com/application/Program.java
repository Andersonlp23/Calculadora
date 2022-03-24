package br.com.application;

import java.util.Scanner;

import br.com.entities.Calculadora;
import br.com.entities.Tabuada;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char resp;

		do {
			
			System.out.println("=============== Calculadora ===============\n");
			System.out.println("Escolha a op��o abaixo:\n");
			System.out.println("1 - Somar");
			System.out.println("2 - Subtrair");
			System.out.println("3 - Multiplicar");
			System.out.println("4 - Divis�o");
			System.out.println("5 - Tabuada");
			System.out.println("6 - Sair");
			System.out.print("Op��o: ");

			int escolha = sc.nextInt();

			switch (escolha) {

			case (1):

				System.out.print("Insira o 1� n�mero: ");
				Calculadora.num1 = sc.nextDouble();
				System.out.print("Insira o 2� n�mero: ");
				Calculadora.num2 = sc.nextDouble();
				System.out.printf("Resultado: %.0f + %.0f = %.0f", Calculadora.num1, Calculadora.num2,Calculadora.soma());
				break;

			case (2):

				System.out.print("Insira o 1� n�mero: ");
				Calculadora.num1 = sc.nextDouble();
				System.out.print("Insira o 2� n�mero: ");
				Calculadora.num2 = sc.nextDouble();
				System.out.printf("Resultado: %.0f - %.0f = %.0f", Calculadora.num1, Calculadora.num2,Calculadora.subtracao());
				break;

			case (3):

				System.out.print("Insira o 1� n�mero: ");
				Calculadora.num1 = sc.nextDouble();
				System.out.print("Insira o 2� n�mero: ");
				Calculadora.num2 = sc.nextDouble();
				System.out.printf("Resultado: %.0f x %.0f = %.0f", Calculadora.num1, Calculadora.num2,Calculadora.multiplicacao());
				break;

			case (4):

				System.out.print("Insira o 1� n�mero: ");
				Calculadora.num1 = sc.nextDouble();
				System.out.print("Insira o 2� n�mero: ");
				Calculadora.num2 = sc.nextDouble();
				System.out.printf("Resultado: %.0f / %.0f = %.0f", Calculadora.num1, Calculadora.num2,Calculadora.divisao());
				break;

			case (5):

				char respt;

				do {

					System.out.println("Escolha a opc�o abaixo:\n");
					System.out.println("1 - Somar;");
					System.out.println("2 - Subtrair");
					System.out.println("3 - Multiplicar");
					System.out.println("4 - Divis�o");
					int opcao = sc.nextInt();

					switch (opcao) {

					case (1):

						System.out.print("\nEscolha o denominador: ");
						Tabuada.denominador = sc.nextInt();
						int soma = 0;
						Tabuada.tabSoma(soma);
						break;

					case (2):

						System.out.print("\nEscolha o denominador: ");
						Tabuada.denominador = sc.nextInt();
						int subtracao = 0;
						Tabuada.tabSubtracao(subtracao);
						break;

					case (3):

						System.out.print("\nEscolha o denominador: ");
						Tabuada.denominador = sc.nextInt();
						int multiplicacao = 0;
						Tabuada.tabMultiplicacao(multiplicacao);
						break;

					case (4):

						System.out.print("\nEscolha o denominador: ");
						Tabuada.denominador = sc.nextInt();

						if (Tabuada.denominador == 0) {
							System.out.println("Impossivel dividir por 0! ");

						} else {

							int divisao = 0;
							Tabuada.tabDivisao(divisao);

						}

						break;
					default:
						System.out.println("\nOpera��o invalida! ");
						break;
					}

					System.out.print("\nDeseja repetir a tabuada (s/n)? ");
					respt = sc.next().charAt(0);

				} while (respt != 'n');

				break;
			default:
				System.out.println("\nOpera��o invalida! ");
				break;
			}

			System.out.print("\nDeseja repetir a calculadora (s/n)? ");
			resp = sc.next().charAt(0);

		} while (resp != 'n');

		System.out.print("Calculadora encerrada!");

		sc.close();
	}
}