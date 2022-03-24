package br.com.entities;

public class Calculadora {

	public static double num1;
	public static double num2;
	
	public static double soma() {
		return num1 + num2;
	}

	public static double subtracao() {
		return num1 - num2;
	}

	public static double multiplicacao() {
		return num1 * num2;
	}

	public static double divisao() {
		return num1 / num2;
	}
}