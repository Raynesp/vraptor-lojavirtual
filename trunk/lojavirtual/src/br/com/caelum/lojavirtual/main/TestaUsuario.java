package br.com.caelum.lojavirtual.main;


import java.util.List;

import br.com.caelum.lojavirtual.dao.DaoFactory;
import br.com.caelum.lojavirtual.dao.UsuarioDao;
import br.com.caelum.lojavirtual.modelo.Usuario;


public class TestaUsuario {
	
	public static void main(String[] args) {	
	
		
	// cria um usuario
	Usuario u = new Usuario();
	u.setLogin("admin3");
	u.setSenha("admin3");
	
	// Cria dao
	UsuarioDao dao = new DaoFactory().getUsuarioDao();
	
	// abre transa��o e insere

	
	// Lista usuarios
	List<Usuario> lista = dao.listaTudo();
	for(Usuario usuario : lista) {
		System.out.println(usuario.getLogin());
	}
	
//	session.close();
}
}
