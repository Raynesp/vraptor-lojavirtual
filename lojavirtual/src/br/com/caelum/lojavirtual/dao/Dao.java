package br.com.caelum.lojavirtual.dao;

import java.util.List;
import org.hibernate.Session;

public class Dao<T> {

	private final Session session;
	@SuppressWarnings("unchecked")
	private final Class classe;
	
	@SuppressWarnings("unchecked")
	public Dao(Session session, Class classe) {
		this.session = session;
		this.classe  = classe;
	}
	
	public void adiciona(T u) {
		this.session.save(u);
	}
	
	public void remove(T u) {
		this.session.delete(u);
	}
	
	public void atualiza(T u){
		this.session.merge(u);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> listaTudo() {
		return this.session.createCriteria(this.classe).list();
	}
	
	@SuppressWarnings("unchecked")
	public T procura(Long id) {
		return (T) session.load(this.classe, id);
	}
	
	protected Session getSession() {
		return session;
	}
}
