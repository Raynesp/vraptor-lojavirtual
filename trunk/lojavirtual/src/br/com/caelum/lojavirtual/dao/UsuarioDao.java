package br.com.caelum.lojavirtual.dao;


import org.hibernate.Query;
import org.hibernate.Session;

import br.com.caelum.lojavirtual.modelo.Usuario;
public class UsuarioDao extends Dao<Usuario> {

	UsuarioDao(Session session) {
		super(session, Usuario.class);
	}

	public Usuario existenteUnico(Usuario u) {
		String hql = "select u from Usuario as u where u.login = :login and u.senha = :senha";
		Query query = getSession().createQuery(hql);
		query.setParameter("login", u.getLogin());
		query.setParameter("senha", u.getSenha());
		return (Usuario)  query.uniqueResult();
	}
}
