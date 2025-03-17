package br.senai.sp.jandira.calculo_poligonos.ui;

import java.util.Scanner;

import br.senai.sp.jandira.calculo_poligonos.dao.CirculoDao;
import br.senai.sp.jandira.calculo_poligonos.dao.QuadradoDao;
import br.senai.sp.jandira.calculo_poligonos.dao.RetanguloDao;
import br.senai.sp.jandira.calculo_poligonos.dao.TrapezioDao;
import br.senai.sp.jandira.calculo_poligonos.dao.TrianguloDao;

public class Menu {

	public static void criarMenu() {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("--------------------------");
		System.out.println("CALCULADORA DE POLIGoNOS");
		System.out.println();
		System.out.println("1- Quadrado");
		System.out.println("2- Retangulo");
		System.out.println("3- Triangulo");
		System.out.println("4- Circunferencia");
		System.out.println("5- Trapézio");
		System.out.println("----------------------");
		System.out.print("Escolha entre 1 e 5: ");
		
		int option = leitor.nextInt();
		
		if (option == 1) {
			QuadradoDao.criar();
		} else if(option == 2 ) {
			RetanguloDao.criar();
		} else if(option ==3) {
			TrianguloDao.criar();
		}else if (option == 4) {
			CirculoDao.criar();
		} else if (option == 5) {
			TrapezioDao.criar();
		} else {
			System.out.println("Opção invalidade! Você deve escolher um numero entre 1 e 5");
		}
		
	}
}
