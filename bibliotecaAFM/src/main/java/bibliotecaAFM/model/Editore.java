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
@Table(name = "editore")
public class Editore {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String casaEditrice;
	@OneToMany(mappedBy = "editore", cascade = CascadeType.ALL)
	private List<Libro> listLibro = new ArrayList<Libro>();

	public Long getId() {
		return id;
	}

	public String getCasaEditrice() {
		return casaEditrice;
	}

	public List<Libro> getListLibro() {
		return listLibro;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCasaEditrice(String casaEditrice) {
		this.casaEditrice = casaEditrice;
	}

	public void setListLibro(List<Libro> listLibro) {
		this.listLibro = listLibro;
	}

}
