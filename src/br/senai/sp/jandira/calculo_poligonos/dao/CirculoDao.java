package br.senai.sp.jandira.calculo_poligonos.dao;

import java.util.Scanner;

import br.senai.sp.jandira.calculo_poligonos.model.Circulo;

public class CirculoDao {
	public static void criar() {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("criando...");
		Circulo circulo = new Circulo();
		
		System.out.print("Digite a medida do Raio: ");
		
		circulo.setRaio(leitor.nextDouble());
		
		circulo.exibirDados();
	}

}
