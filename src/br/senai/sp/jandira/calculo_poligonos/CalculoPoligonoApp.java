package br.senai.sp.jandira.calculo_poligonos;
import br.senai.sp.jandira.calculo_poligonos.model.*;


public class CalculoPoligonoApp{
	public static void main(String[]args){
		Quadrado quadrado1 = new Quadrado();
		quadrado1.setLado(20);
		quadrado1.exibirDados();
		
		Retangulo retangulo1 = new Retangulo();
		retangulo1.setAltura(20);
		retangulo1.setBase(2);
		retangulo1.exibirDados();
		
		Triangulo triangulo1 = new Triangulo();
		triangulo1.setAltura(20);
		triangulo1.setBase(10);
		triangulo1.exibirDados();
		
		Trapezio trapezio1 = new Trapezio();
		trapezio1.setAltura(20);
		trapezio1.setBaseMaior(10);
		trapezio1.setBaseMenor(10);
		trapezio1.exibirDados();
		
		Circulo circulo1 = new Circulo();
		circulo1.setRaio(20);
		circulo1.exibirDados();
		
	}
}