package br.senai.sp.jandira.calculo_poligonos.model;

public class Triangulo {
	private double altura;
	private double base;
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double calcularArea() {
		double area = altura * base / 2;
		return area;
	}
	
	public void exibirDados() {
		System.out.println("----------------");
		System.out.println("DADOS DO TRIANGULO");
		System.out.println("----------------");
		System.out.println("Tamanho do Lado:" + altura);
		System.out.println("Área:" + calcularArea());
		System.out.println("----------------");
		
	}
}
