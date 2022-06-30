package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
	//muito importate as classes LocalDate e LocalDateTime
	private LocalDate data;

	public Mentoria() {}

	public Mentoria(String titulo, String descricao, LocalDate data) {
		super(titulo, descricao);
		this.data = data;
	}



	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public Double calcularXP() {
		// TODO Auto-generated method stub
		return XP_Padrao *40d;
	}


	@Override
	public String toString() {
		return  "Mentoria {" +
						"titulo ='" +getTitulo()+  '\'' 
						+", descrição = '" +getDescricao()+  '\'' 
						+", data = " +data + '}';
						
	}

	
	

	
}
