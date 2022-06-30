package br.com.dio.desafio.dominio;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

	private String nome;
	// Com o Set só pode adicionar uma vez um determinado curso e mentoria. Linked para colocar na lista em ordem.  
	// a classe Set é classe mão de LinkedHashSet (polimorfismo)
	private Set<Conteudo> conteudosinscritos = new LinkedHashSet<>();
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
	
	public void inscreverBootcamp(Bootcamp bootcamp) {
		//para se inscrever, automatica todos os conteúdos que ele se inscreveu vai para conteudosInscritos
		this.conteudosinscritos.addAll(bootcamp.getConteudos());
	    bootcamp.getDevinscritos().add(this);
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public Set<Conteudo> getConteudosinscritos() {
		return conteudosinscritos;
	}

	public void setConteudosinscritos(Set<Conteudo> conteudosinscritos) {
		this.conteudosinscritos = conteudosinscritos;
	}

	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}

	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}

	public void progredir() {
		//para progredir, tem que pegar o conteúdo dos inscritos e botar no concluidos
		//options surgiu no java 8 e resolve tudo
		Optional<Conteudo> x = this.conteudosinscritos.stream().findFirst();
		if(x.isPresent()) {
			this.conteudosConcluidos.add(x.get());
			this.conteudosinscritos.remove(x.get());
		}else {
			System.err.print("Você não está matriculado em nenhum novo conteúdo");
		}
	}
	
	public Double calcularXP() {
		//return this.conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXP()).sum();
		Iterator<Conteudo> it = this.conteudosConcluidos.iterator();
		double soma =0;
		while(it.hasNext()) {
			double next = it.next().calcularXP();
			soma += next;
		}
		return soma;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudosConcluidos, conteudosinscritos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudosConcluidos, other.conteudosConcluidos)
				&& Objects.equals(conteudosinscritos, other.conteudosinscritos) && Objects.equals(nome, other.nome);
	}
	
	
}
