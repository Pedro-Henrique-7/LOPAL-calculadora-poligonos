package br.senai.sp.jandira.calculo_poligonos.model;

public class Trapezio {
	private double altura;
	private double baseMenor;
	private double baseMaior;
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}
	
	public void setBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}
	
	
	public double calcularArea() {
		double area = baseMenor * baseMaior / altura;
		return area;
	}
	
	public void exibirDados() {
		System.out.println("----------------");
		System.out.println("DADOS DO TRAPÉZIO");
		System.out.println("----------------");
		System.out.println("Tamanho do Lado:" + altura);
		System.out.println("Área:" + calcularArea());
		System.out.println("----------------");
		
	}
}
