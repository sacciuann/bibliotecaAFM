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
@Table(name = "utente")
public class Utente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String password;
	private String email;
	@OneToMany(mappedBy = "utenteProfilo", cascade = CascadeType.ALL)
	private List<ProfiloUtente> listProfilo = new ArrayList<ProfiloUtente>();

	@OneToMany(mappedBy = "utentePrestito", cascade = CascadeType.ALL)
	private List<Prestito> listExperience = new ArrayList<Prestito>();

	public Long getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public List<ProfiloUtente> getListProfilo() {
		return listProfilo;
	}

	public List<Prestito> getListExperience() {
		return listExperience;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setListProfilo(List<ProfiloUtente> listProfilo) {
		this.listProfilo = listProfilo;
	}

	public void setListExperience(List<Prestito> listExperience) {
		this.listExperience = listExperience;
	}


	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	

}
