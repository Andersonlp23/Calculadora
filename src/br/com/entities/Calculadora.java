package br.com.entities;

public class Calculadora {

	public double num1;
	public double num2;
	
	public double soma() {
		return num1 + num2;
	}

	public double subtracao() {
		return num1 - num2;
	}

	public double multiplicacao() {
		return num1 * num2;
	}

	public double divisao() {
		return num1 / num2;
	}
}