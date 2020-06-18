package bibliotecaAFM.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "collocazione")
public class Collocazione {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String scaffale;
	private String numeroPosto;
	private String codiceStato;
	@ManyToOne(fetch = FetchType.LAZY)
	private Libro libroCollocazione;
	@ManyToOne(fetch = FetchType.LAZY)
	private Sezione sezione;
	
	public Long getId() {
		return id;
	}
	public String getScaffale() {
		return scaffale;
	}
	public String getNumeroPosto() {
		return numeroPosto;
	}
	public String getCodiceStato() {
		return codiceStato;
	}
	public Libro getLibroCollocazione() {
		return libroCollocazione;
	}
	public Sezione getSezione() {
		return sezione;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setScaffale(String scaffale) {
		this.scaffale = scaffale;
	}
	public void setNumeroPosto(String numeroPosto) {
		this.numeroPosto = numeroPosto;
	}
	public void setCodiceStato(String codiceStato) {
		this.codiceStato = codiceStato;
	}
	public void setLibroCollocazione(Libro libroCollocazione) {
		this.libroCollocazione = libroCollocazione;
	}
	public void setSezione(Sezione sezione) {
		this.sezione = sezione;
	}
	


}
