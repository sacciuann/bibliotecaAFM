package bibliotecaAFM.service;

import java.util.List;

import bibliotecaAFM.model.Utente;

public interface UtenteService {
	/**
	 * method that allows the addition of a user
	 * @param u
	 */
	public void addUtente(Utente u);
	
	/**
	 * method that allows the deletion of a user
	 * @param id
	 */
	public void deleteUtente(Long id);
	
	/**
	 * method that allows the modification of a user
	 * @param u
	 */
	public void updateUtente(Utente u);
	
	/**
	 * method that allows the search of all users
	 * @return
	 */
	public List<Utente> findAllUtente();
	
	/**
	 * method that allows users to be searched by id
	 * @param id
	 * @return
	 */
	public List<Utente> findAllUtenteById(Long id);
	
	/**
	 * method that allows users to be searched by email
	 * @param email
	 * @return
	 */
	public List<Utente> findAllUtenteByEmail(String email);
	
	/**
	 * method that allows the search of a user by id and password
	 * @param password
	 * @param email
	 * @return
	 */
	public Utente login(String password, String email);
}
