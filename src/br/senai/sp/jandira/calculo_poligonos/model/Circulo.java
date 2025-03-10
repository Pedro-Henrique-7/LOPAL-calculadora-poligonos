package br.senai.sp.jandira.calculo_poligonos.model;

public class Circulo {
	private double raio;
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double calcularArea() {
		double area = Math.PI * Math.pow(raio, 2);
		return area;
	}
	public void exibirDados() {
		System.out.println("----------------");
		System.out.println("DADOS DO Circulo");
		System.out.println("----------------");
		System.out.println("Tamanho do Raio:" + raio);
		System.out.println("Área:" + calcularArea());
		System.out.println("----------------");
		
	}
	
}
