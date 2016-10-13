package br.com.livraria.bean;

import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import br.com.livraria.dao.AutorDao;
import br.com.livraria.modelo.Autor;

@Model
public class AutorBean {
	
	private Autor autor = new Autor();
	
	@Inject
	private AutorDao dao;
	
	public Autor getAutor() {
		return autor;
	}
	
	public void cadastra() {
		this.dao.salva(autor);
		this.autor = new Autor();
	}
	
	public List<Autor> getAutores() {
		return this.dao.todosAutores();
	}
}
