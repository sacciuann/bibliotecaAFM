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
@Table(name = "profiloUtente")
public class ProfiloUtente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String cognome;
	private String indirizzo;
	private String recapito;
	private LocalDate dataNascita;
	private String luogoNascita;
	private Character sesso;
	@ManyToOne(fetch = FetchType.LAZY)
	private Utente utenteProfilo;
	@ManyToOne(fetch = FetchType.LAZY)
	private Profilo profilo;

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public String getRecapito() {
		return recapito;
	}

	public LocalDate getDataNascita() {
		return dataNascita;
	}

	public String getLuogoNascita() {
		return luogoNascita;
	}

	public Character getSesso() {
		return sesso;
	}

	public Utente getUtenteProfilo() {
		return utenteProfilo;
	}

	public Profilo getProfilo() {
		return profilo;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public void setRecapito(String recapito) {
		this.recapito = recapito;
	}

	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}

	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}

	public void setSesso(Character sesso) {
		this.sesso = sesso;
	}

	public void setUtenteProfilo(Utente utenteProfilo) {
		this.utenteProfilo = utenteProfilo;
	}

	public void setProfilo(Profilo profilo) {
		this.profilo = profilo;
	}

}
