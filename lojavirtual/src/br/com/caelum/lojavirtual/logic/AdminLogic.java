package br.com.caelum.lojavirtual.logic;

import org.vraptor.annotations.Component;
import org.vraptor.annotations.InterceptedBy;
import org.vraptor.annotations.Out;
import org.vraptor.scope.ScopeType;

import br.com.caelum.lojavirtual.dao.DaoFactory;
import br.com.caelum.lojavirtual.dao.UsuarioDao;
import br.com.caelum.lojavirtual.loja.DaoInterceptor;
import br.com.caelum.lojavirtual.modelo.Usuario;

@Component("admin")
@InterceptedBy(DaoInterceptor.class)
public class AdminLogic {
	private final DaoFactory daoFactory;
	
	private Usuario usuario;
	
	public AdminLogic(DaoFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	public void login() {	
	}
	
	public String efetuaLogin(Usuario usuario) {
		UsuarioDao dao = this.daoFactory.getUsuarioDao();
		this.usuario = dao.existenteUnico(usuario);
		if (this.usuario !=null) {
			return "ok";
		} else {
			return "invalid";
		}
	}
	
	public void logout() {
		this.usuario = null;
	}
	
	@Out(scope=ScopeType.SESSION)
	public Usuario getUsuario() {
		return usuario;
	}
}
