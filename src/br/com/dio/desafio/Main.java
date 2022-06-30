package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso curso1 = new Curso();
		Mentoria m = new Mentoria();
		
		curso1.setDescricao("Curso BigData");
		curso1.setDescricao("Estes são os meus cursos");
		curso1.setCargaHoraria(12);
		System.out.println("Cursos "+curso1.getTitulo()+"  " + curso1.getDescricao());
		

	}

}
