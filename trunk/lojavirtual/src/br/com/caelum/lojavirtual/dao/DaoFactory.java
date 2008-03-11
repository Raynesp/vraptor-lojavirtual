package br.com.caelum.lojavirtual.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.caelum.lojavirtual.modelo.Cd;
import br.com.caelum.lojavirtual.modelo.Musica;
import br.com.caelum.lojavirtual.util.HibernateUtil;

public class DaoFactory {

	private final Session session;
	private Transaction transaction;
	
	public DaoFactory() {
		session = HibernateUtil.getSession();
	}
	
	public UsuarioDao getUsuarioDao(){
		return new UsuarioDao(this.session);
	}
	
	public Dao<Cd> getCdDao() {
		return new Dao<Cd>(this.session, Cd.class);
	}
	
	public Dao<Musica> getMusicaDao() {
		return new Dao<Musica>(this.session, Musica.class);
	}
	
	public void beginTransaction() {
		this.transaction = this.session.beginTransaction();
		}
	
	public void commit() {
		this.transaction.commit();
		this.transaction = null;
	}
	
	public boolean hasTransaction() {
		return this.transaction != null;
	}
	
	public void rollback() {
		this.transaction.rollback();
		this.transaction = null;
	}
	
	public void close() {
		this.session.close();
	}
}
