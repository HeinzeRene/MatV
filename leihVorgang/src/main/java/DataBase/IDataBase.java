package DataBase;

import java.util.zip.DataFormatException;

public interface IDataBase {

	/*
	 * Methode zum Einlesen von Kundedaten
	 */
	void insertPerson (int idPerson, String anrede, String vorname, String nachname, String matrikelnummer, String adresse, String plz, String wohnort) throws DataFormatException; 
	
	/*
	 * Methode zum Update von Kundendaten
	 */
	void updatePerson (int idPerson, String anrede, String vorname, String nachname, String matrikelnummer, String adresse, String plz, String wohnort); 
	
	/*
	 * Methode zum Löschen von Kundedaten
	 */
	void deletePerson(int idPerson, String anrede, String vorname, String nachname, String matrikelnummer, String adresse, String plz,
			String wohnort) throws DataFormatException;


	
	
}
