package bibliotecaAFM.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "configurazione")
public class Configurazione {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Integer copiaMinPresente;
	private Integer copiePrestitoMax;
	private Integer dimensioneScaffale;
	private Integer numeroMaxCopie;
	private Integer giorniMaxPrestito;

	public Long getId() {
		return id;
	}

	public Integer getCopiaMinPresente() {
		return copiaMinPresente;
	}

	public Integer getCopiePrestitoMax() {
		return copiePrestitoMax;
	}

	public Integer getDimensioneScaffale() {
		return dimensioneScaffale;
	}

	public Integer getNumeroMaxCopie() {
		return numeroMaxCopie;
	}

	public Integer getGiorniMaxPrestito() {
		return giorniMaxPrestito;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCopiaMinPresente(Integer copiaMinPresente) {
		this.copiaMinPresente = copiaMinPresente;
	}

	public void setCopiePrestitoMax(Integer copiePrestitoMax) {
		this.copiePrestitoMax = copiePrestitoMax;
	}

	public void setDimensioneScaffale(Integer dimensioneScaffale) {
		this.dimensioneScaffale = dimensioneScaffale;
	}

	public void setNumeroMaxCopie(Integer numeroMaxCopie) {
		this.numeroMaxCopie = numeroMaxCopie;
	}

	public void setGiorniMaxPrestito(Integer giorniMaxPrestito) {
		this.giorniMaxPrestito = giorniMaxPrestito;
	}

}
