package br.com.caelum.lojavirtual.logic;

import java.util.List;

import org.vraptor.annotations.Component;
import org.vraptor.annotations.InterceptedBy;

import br.com.caelum.lojavirtual.dao.DaoFactory;
import br.com.caelum.lojavirtual.loja.DaoInterceptor;
import br.com.caelum.lojavirtual.modelo.Usuario;

@Component
//@InterceptedBy({AutorizadorInterceptor.class,DaoInterceptor.class})
@InterceptedBy({DaoInterceptor.class})
public class UsuarioLogic {
	private final DaoFactory daofactory;
	private List<Usuario> usuarios;
	public UsuarioLogic(DaoFactory daofactory) {
		this.daofactory = daofactory;
	}
	
	public void adiciona(Usuario usuario) {
		// logica para adicionar usuario
		this.daofactory.beginTransaction();
		this.daofactory.getUsuarioDao().adiciona(usuario);
		this.daofactory.commit();
	}
	
	public void lista() {
		usuarios = this.daofactory.getUsuarioDao().listaTudo();
	}
	
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	
	public void remove(Usuario usuario) {
		this.daofactory.beginTransaction();
		this.daofactory.getUsuarioDao().remove(usuario);
		this.daofactory.commit();
	}
	public void formulario() {
		
	}
}
