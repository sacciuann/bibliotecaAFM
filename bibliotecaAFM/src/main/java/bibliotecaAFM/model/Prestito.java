package bibliotecaAFM.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "prestito")
public class Prestito {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private LocalDate dataInizio;
	private LocalDate dataFine;
	private LocalDate dataConsegnaEffettiva;
	private String codiceStato;
	@ManyToOne(fetch = FetchType.LAZY)
	private Stato stato;
	@ManyToOne(fetch = FetchType.LAZY)
	private Libro libro;
	@ManyToOne(fetch = FetchType.LAZY)
	private Utente utentePrestito;
	public Long getId() {
		return id;
	}
	public LocalDate getDataInizio() {
		return dataInizio;
	}
	public LocalDate getDataFine() {
		return dataFine;
	}
	public LocalDate getDataConsegnaEffettiva() {
		return dataConsegnaEffettiva;
	}
	public String getCodiceStato() {
		return codiceStato;
	}
	public Stato getStato() {
		return stato;
	}
	public Libro getLibro() {
		return libro;
	}
	public Utente getUtentePrestito() {
		return utentePrestito;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setDataInizio(LocalDate dataInizio) {
		this.dataInizio = dataInizio;
	}
	public void setDataFine(LocalDate dataFine) {
		this.dataFine = dataFine;
	}
	public void setDataConsegnaEffettiva(LocalDate dataConsegnaEffettiva) {
		this.dataConsegnaEffettiva = dataConsegnaEffettiva;
	}
	public void setCodiceStato(String codiceStato) {
		this.codiceStato = codiceStato;
	}
	public void setStato(Stato stato) {
		this.stato = stato;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	public void setUtentePrestito(Utente utentePrestito) {
		this.utentePrestito = utentePrestito;
	}
	
	
}
