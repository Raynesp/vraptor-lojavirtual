package br.com.caelum.lojavirtual.loja;

import org.vraptor.Interceptor;
import org.vraptor.LogicException;
import org.vraptor.LogicFlow;
import org.vraptor.annotations.Out;
import org.vraptor.view.ViewException;

import br.com.caelum.lojavirtual.dao.DaoFactory;

public class DaoInterceptor  implements Interceptor {
	private final DaoFactory factory = new DaoFactory();
	
	public void intercept(LogicFlow flow) throws LogicException, ViewException {
		// executa a lógica
		flow.execute();
		
		// se sobrou transação sem comitar, faz rollback
		if (factory.hasTransaction()) {
			factory.rollback();
		}
		
		factory.close();
	}
	
	@Out(key="br.com.caelum.lojavirtual.dao.DaoFactory")
	public DaoFactory getFactory() {
		return factory;
	}

}
