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
@Table(name = "sezione")
public class Sezione {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	@OneToMany(mappedBy = "sezione", cascade = CascadeType.ALL)
	private List<Collocazione> listCollocazione = new ArrayList<Collocazione>();

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public List<Collocazione> getListCollocazione() {
		return listCollocazione;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setListCollocazione(List<Collocazione> listCollocazione) {
		this.listCollocazione = listCollocazione;
	}

}
