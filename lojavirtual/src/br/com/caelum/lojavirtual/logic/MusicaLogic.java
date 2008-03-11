package br.com.caelum.lojavirtual.logic;

import java.util.List;

import org.vraptor.annotations.Component;
import org.vraptor.annotations.InterceptedBy;
import org.vraptor.plugin.hibernate.Validate;

import br.com.caelum.lojavirtual.dao.DaoFactory;
import br.com.caelum.lojavirtual.loja.DaoInterceptor;
import br.com.caelum.lojavirtual.modelo.Cd;
import br.com.caelum.lojavirtual.modelo.Musica;

@Component("musica")
@InterceptedBy({AutorizadorInterceptor.class,DaoInterceptor.class})
public class MusicaLogic {
	private final DaoFactory daofactory;
	private Musica musica;
	private List<Musica> musicas;
	
	public MusicaLogic(DaoFactory daofactory) {
		this.daofactory = daofactory;
	}

	public void formulario() {
		
	}
	
	// formulario edicao
	public void editar(Musica musica) {
		this.musica = this.daofactory.getMusicaDao().procura(musica.getId());
	}
	
	//adiciona musica nova ou atualiza
	@Validate(params={"musica"})
	public void armazena(Musica musica) {
		this.daofactory.beginTransaction();
		this.daofactory.getMusicaDao().atualiza(musica);
		this.daofactory.commit();
	}
	
	// remove uma musica
	public void remove(Musica musica) {
		this.daofactory.beginTransaction();
		this.daofactory.getMusicaDao().remove(musica);
		this.daofactory.commit();
	}
	
	// lista todas as musicas
	public void lista() {
		this.musicas = this.daofactory.getMusicaDao().listaTudo();
	}

	//Getter para musica
	public Musica getMusica() { 
		return this.musica;
	}
	
	//getter para lista de musicas
	public List<Musica> getMusicas() {
		return this.musicas;
	}
	
	// retorna a lista de cds
	public List<Cd> getListaCds() {
		return this.daofactory.getCdDao().listaTudo();
	}
}