package br.senai.sp.jandira.calculo_poligonos.dao;

import java.util.Scanner;

import br.senai.sp.jandira.calculo_poligonos.model.Retangulo;

public class RetanguloDao {
	
	public static void criar() {
		Scanner leitor = new Scanner(System.in);
		System.out.println("criando...");
		Retangulo retangulo = new Retangulo();
		
		System.out.print("Digite a medida da base do Retangulo: ");
		
		retangulo.setBase(leitor.nextDouble());
		
		System.out.print("Digite a medida da Altura do Retangulo: ");
		retangulo.setAltura(leitor.nextDouble());
		
		retangulo.exibirDados();
	}

}
