package br.com.livraria.dao;

import java.util.List;

import javax.ejb.Stateless;

import br.com.livraria.modelo.Autor;

@Stateless
public class AutorDao {

	private Banco banco = new Banco();

	public void salva(Autor autor) {
		banco.save(autor);
	}
	
	public List<Autor> todosAutores() {
		return banco.listaAutores();
	}

	public Autor buscaPelaId(Integer autorId) {
		Autor autor = this.banco.buscaPelaId(autorId);
		return autor;
	}
	
}
