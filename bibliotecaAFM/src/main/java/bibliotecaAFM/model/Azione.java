package bibliotecaAFM.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "azione")
public class Azione {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String descrizione;
	@ManyToOne(fetch = FetchType.LAZY)
	private Profilo profilo;

	public Long getId() {
		return id;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public Profilo getProfilo() {
		return profilo;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public void setProfilo(Profilo profilo) {
		this.profilo = profilo;
	}

}
