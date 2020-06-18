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
@Table(name = "libro")
public class Libro {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String titolo;

	@ManyToOne(fetch = FetchType.LAZY)
	private Autore autore;
	@OneToMany(mappedBy = "libroCollocazione", cascade = CascadeType.ALL)
	private List<Collocazione> listCollocazione = new ArrayList<Collocazione>();
	@OneToMany(mappedBy = "libro", cascade = CascadeType.ALL)
	private List<Prestito> listPrestito = new ArrayList<Prestito>();
	@ManyToOne(fetch = FetchType.LAZY)
	private Editore editore;

	public Long getId() {
		return id;
	}

	public String getTitolo() {
		return titolo;
	}

	public Autore getAutore() {
		return autore;
	}

	public List<Collocazione> getListCollocazione() {
		return listCollocazione;
	}

	public List<Prestito> getListPrestito() {
		return listPrestito;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public void setAutore(Autore autore) {
		this.autore = autore;
	}

	public void setListCollocazione(List<Collocazione> listCollocazione) {
		this.listCollocazione = listCollocazione;
	}

	public void setListPrestito(List<Prestito> listPrestito) {
		this.listPrestito = listPrestito;
	}

}
