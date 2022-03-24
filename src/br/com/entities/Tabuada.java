package br.com.entities;

public class Tabuada {

	public static int denominador;
	public static int mult;

	public static void tabSoma(int soma) {

		for (mult = 0; mult <= 10; mult++) {
			soma = denominador + mult;
			System.out.println(denominador + " + " + mult + " = " + soma);
		}
	}

	public static void tabSubtracao(int subtracao) {

		for (mult = denominador; mult <= 10 + denominador; mult++) {
			subtracao = mult - denominador;
			System.out.println(denominador + " - " + mult + " = " + subtracao);
		}
	}

	public static void tabMultiplicacao(int multiplicacao) {

		for (mult = 0; mult <= 10; mult++) {
			multiplicacao = denominador * mult;
			System.out.println(denominador + " X " + mult + " = " + multiplicacao);
		}
	}

	public static void tabDivisao(int divisao) {

		for (mult = 0; mult <= denominador * 10; mult = mult + denominador) {
			divisao = mult / denominador;
			System.out.println(mult + " / " + denominador + " = " + divisao);
		}
	}
}