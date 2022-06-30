package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mentoria mentoria1 = new Mentoria();
	
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso BigData");
		curso1.setDescricao("Estes são os meus cursos");
		curso1.setCargaHoraria(120);
	
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Intensivão Java");
		curso2.setDescricao("curso completo Java 8 Spring Boot");
		curso2.setCargaHoraria(72);
		
		
		mentoria1.setTitulo("SQL");
		mentoria1.setDescricao("Curso");
		mentoria1.setData(LocalDate.now());
		
		
		Bootcamp boot = new Bootcamp();
		boot.setNome("Java para todos");
		boot.setDescricao("Curso de Java");
		boot.getConteudos().add(curso1);
		boot.getConteudos().add(curso2);
		boot.getConteudos().add(mentoria1);
	    
	    //dev
	    Dev maria = new Dev();
	    maria.setNome("Maria do Carmo");
	    
	    Dev joao = new Dev();
	    joao.setNome("João da Silva");
	    
	    // matricular maria e joao
	    maria.inscreverBootcamp(boot);
	    joao.inscreverBootcamp(boot);
	    
	    
	    System.out.println("Inscrição Maria  " + maria.getConteudosinscritos());
	    System.out.println("-----------------");
	    System.out.println("Inscrições João  "  +joao.getConteudosinscritos());
	    System.out.println("------xxxxxxxxxxx----------");
	    
		

	    maria.progredir();
	    joao.progredir();
		
	    System.out.println("Inscrito Maria  " + maria.getConteudosinscritos());
	    System.out.println("-----xxxxxxxx-----------");
	    System.out.println("Concluído Maria  " + maria.getConteudosConcluidos());
	    
	    System.out.println("-------sssssss---------");
	    System.out.println("Inscrições João  "  +joao.getConteudosinscritos());
	    System.out.println("Conclusão João  "  +joao.getConteudosConcluidos());
	    
	    System.out.println("");System.out.println("");System.out.println("");
	    
	    maria.progredir();
	    joao.progredir();
	    maria.progredir();
	    joao.progredir();
	    maria.progredir();
	    joao.progredir();
	    System.out.println("");
	    System.out.println("Inscrito Maria  " + maria.getConteudosinscritos());
	    System.out.println("-----vvvvvvvvvv-----------");
	    System.out.println("Concluído Maria  " + maria.getConteudosConcluidos());
	    
	    System.out.println("");
	    System.out.println("-------aaaaaaaaaaaaaaaa---------");
	    System.out.println("Inscrições João  "  +joao.getConteudosinscritos());
	    System.out.println("Conclusão João  "  +joao.getConteudosConcluidos());
	    System.out.println("");

	    
	    

		

	}

}
