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
@Table(name = "profilo")
public class Profilo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String descrizione;
	@OneToMany(mappedBy = "profilo", cascade = CascadeType.ALL)
	private List<Azione> listAzione = new ArrayList<Azione>();

	public Long getId() {
		return id;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public List<Azione> getListAzione() {
		return listAzione;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public void setListAzione(List<Azione> listAzione) {
		this.listAzione = listAzione;
	}

}
