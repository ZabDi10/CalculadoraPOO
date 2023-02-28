package com.cursoceat.main;

public class Operaciones {

	private double numerouno;
	private double numerodos;

	// Los constructores
	public Operaciones() {

	}

	public Operaciones(double numerouno) {

		this.numerouno = numerouno;
	}

	public Operaciones(double numerouno, double numerodos) {

		this.numerouno = numerouno;
		this.numerodos = numerodos;

	}

	// Los getter and setter
	public double getNumerouno() {
		return numerouno;
	}

	public void setNumerouno(double numerouno) {
		this.numerouno = numerouno;
	}

	public double getNumerodos() {
		return numerodos;
	}

	public void setNumerodos(double numerodos) {
		this.numerodos = numerodos;
	}

	// Los metodos

	public double suma(double numerouno, double numerodos) {
		double resultado = numerouno + numerodos;
		return resultado;
	}

	public double resta(double numerouno, double numerodos) {
		double resultado = numerouno - numerouno;
		return resultado;
	}

	public double multiplicar(double numerouno, double numerodos) {
		double resultado = numerouno * numerodos;
		return resultado;
	}

	public double dividir(double numerouno, double numerodos) {
		double resultado = numerouno / numerodos;
		return resultado;
	}

	public double resto(double numerouno, double numerodos) {
		double resultado = numerouno % numerodos;
		return resultado;
	}

	public double exponencial(double numerouno, double numerodos) {
		double resultado = Math.pow(numerouno, numerodos);
		return resultado;
	}

}
