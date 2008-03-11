package br.com.caelum.lojavirtual.logic;

import java.util.List;

import org.vraptor.annotations.Component;
import org.vraptor.annotations.InterceptedBy;
import org.vraptor.plugin.hibernate.Validate;
import org.vraptor.validator.ValidationErrors;

import br.com.caelum.lojavirtual.dao.DaoFactory;
import br.com.caelum.lojavirtual.loja.DaoInterceptor;
import br.com.caelum.lojavirtual.modelo.Cd;

@Component("cd")
@InterceptedBy({AutorizadorInterceptor.class,DaoInterceptor.class})
public class CdLogic {

	private final DaoFactory daofactory;
	private Cd cd;
	private List<Cd> cds;
	
	public CdLogic(DaoFactory daofactory) {
		this.daofactory = daofactory;
	}
	
	//formulario para adição
	public void formulario() {
		
	}
	
	// formulario para edição
	public void editar(Cd cd) {
		//carrega os dados no banco para edição
		this.cd = this.daofactory.getCdDao().procura(cd.getId());
	}
	
	//Adiciona um cd novo ou atualiza se for edição
	@Validate(params={"cd"})
	public void armazena(Cd cd) {
		this.cd = cd;
		this.daofactory.beginTransaction();
		this.daofactory.getCdDao().atualiza(cd);
		this.daofactory.commit();
	}

	 public void validateArmazena(ValidationErrors errors, Cd cd) {
		 this.cd = cd;
		 }

	
 
	// remove um cd
	public void remove(Cd cd) {
		this.daofactory.beginTransaction();
		this.daofactory.getCdDao().remove(cd);
		this.daofactory.commit();
	}
	
	// lista todos os cds
	public void lista() {
		this.cds = this.daofactory.getCdDao().listaTudo();
	}
	
	// getter pro Cd
	public Cd getCd() {
	   return cd;	
	}
	
	//geter para lista de Cds
	public List<Cd> getCds() {
		return cds;
	}
}
