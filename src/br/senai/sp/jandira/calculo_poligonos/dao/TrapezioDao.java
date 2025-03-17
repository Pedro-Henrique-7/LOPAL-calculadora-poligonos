package br.senai.sp.jandira.calculo_poligonos.dao;

import java.util.Scanner;

import br.senai.sp.jandira.calculo_poligonos.model.Trapezio;

public class TrapezioDao {
	public static void criar() {
			
			Scanner leitor = new Scanner(System.in);
			System.out.println("criando...");
			Trapezio trapezio = new Trapezio();
			
			System.out.print("Digite a medida da Altura do Trapézio: ");
			
			trapezio.setAltura(leitor.nextDouble());
			
			System.out.print("Digite a medida da Base Menor do Triangulo: ");
			trapezio.setBaseMenor(leitor.nextDouble());
			
			System.out.print("Digite a medida da Base Maior do Triangulo: ");
			trapezio.setBaseMaior(leitor.nextDouble());
			
			trapezio.exibirDados();
	}


}
