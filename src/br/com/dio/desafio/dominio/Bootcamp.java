package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
	private String nome;
	private String descricao;
	private final LocalDate inicio = LocalDate.now();
	private final LocalDate fim = inicio.plusDays(45); //adiciona 45 dias
	
	private Set<Dev> devinscritos = new HashSet<>();
	private Set<Conteudo> conteudos = new LinkedHashSet<>();
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Set<Dev> getDevinscritos() {
		return devinscritos;
	}
	public void setDevinscritos(Set<Dev> devinscritos) {
		this.devinscritos = devinscritos;
	}
	public Set<Conteudo> getConteudos() {
		return conteudos;
	}
	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}
	public LocalDate getInicio() {
		return inicio;
	}
	public LocalDate getFim() {
		return fim;
	}
	
	//como está trabalhando com hashCode e linkedhasset precisa do equals e hasCode
	@Override
	public int hashCode() {
		return Objects.hash(conteudos, descricao, devinscritos, fim, inicio, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(conteudos, other.conteudos) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(devinscritos, other.devinscritos) && Objects.equals(fim, other.fim)
				&& Objects.equals(inicio, other.inicio) && Objects.equals(nome, other.nome);
	}
	
	
	
}
