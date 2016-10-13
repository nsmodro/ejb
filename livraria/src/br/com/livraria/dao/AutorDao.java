package br.com.livraria.dao;

import java.util.List;

import javax.ejb.Stateless;

import br.com.livraria.modelo.Autor;

@Stateless
public class AutorDao {

	private Banco banco = new Banco();

	void aposCriacao() {
		System.out.println("AutorDAO foi criado");
	}
	
	public void salva(Autor autor) {
		
		System.out.println("Salvando autor" + autor.getNome());
		try {
			Thread.sleep(20000);//20s
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Salvou autor" + autor.getNome());
		
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
