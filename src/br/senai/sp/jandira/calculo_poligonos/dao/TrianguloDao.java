package br.senai.sp.jandira.calculo_poligonos.dao;

import java.util.Scanner;

import br.senai.sp.jandira.calculo_poligonos.model.Triangulo;

public class TrianguloDao {
	
	public static void criar() {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("criando...");
		Triangulo triangulo = new Triangulo();
		
		System.out.print("Digite a medida da base do Triangulo: ");
		
		triangulo.setBase(leitor.nextDouble());
		
		System.out.print("Digite a medida da Altura do Triangulo: ");
		triangulo.setAltura(leitor.nextDouble());
		
		triangulo.exibirDados();
	}


}
