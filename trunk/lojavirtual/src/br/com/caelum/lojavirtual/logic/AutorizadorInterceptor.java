package br.com.caelum.lojavirtual.logic;

import java.io.IOException;

import org.vraptor.Interceptor;
import org.vraptor.LogicException;
import org.vraptor.LogicFlow;
import org.vraptor.annotations.In;
import org.vraptor.scope.ScopeType;
import org.vraptor.view.ViewException;

import br.com.caelum.lojavirtual.modelo.Usuario;

public class AutorizadorInterceptor implements Interceptor {

	@In(scope=ScopeType.SESSION, required=false)
	private Usuario usuario;
	
	public void intercept(LogicFlow flow) throws LogicException, ViewException {
		if (this.usuario == null) {
			try {
					flow.getLogicRequest().getResponse().sendRedirect("admin.login.logic");
			} catch (IOException e) {
				throw new LogicException(e);
			}
		} else {
			flow.execute();
		}
	}
}
