package bibliotecaAFM.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "stato")
public class Stato {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String descrizione;
	@OneToMany(mappedBy = "stato", cascade = CascadeType.ALL)
	private List<Prestito> listPrestito = new ArrayList<Prestito>();
	public Long getId() {
		return id;
	}
	
	public List<Prestito> getListPrestito() {
		return listPrestito;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public void setListPrestito(List<Prestito> listPrestito) {
		this.listPrestito = listPrestito;
	}
	



}
