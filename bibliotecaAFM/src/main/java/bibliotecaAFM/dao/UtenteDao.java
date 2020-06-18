package bibliotecaAFM.dao;

import java.util.List;

import bibliotecaAFM.model.Utente;

public interface UtenteDao {
	
	public void addUtente(Utente u);

	public void deleteUtente(Long id);

	public void updateUtente(Utente u);

	public List<Utente> findAllUtente();

	public List<Utente> findAllUtenteById(Long id);

	public List<Utente> findAllUtenteByEmail(String email);

	public Utente findByUsernameAndPassword(String password, String email);

}
