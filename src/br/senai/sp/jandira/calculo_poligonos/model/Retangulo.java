package br.senai.sp.jandira.calculo_poligonos.model;

public class Retangulo {
	
	private double altura;
	private double base;
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double calcularArea() {
		double area = altura * base;
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro = 4 * altura;
		return perimetro;
	}
	
	public void exibirDados() {
		System.out.println("----------------");
		System.out.println("DADOS DO RETANGULO");
		System.out.println("----------------");
		System.out.println("Tamanho do Lado:" + altura);
		System.out.println("Área:" + calcularArea());
		System.out.println("Perímetro:" + calcularPerimetro());
		System.out.println("----------------");
		
	}
	
}
