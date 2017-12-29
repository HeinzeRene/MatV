package DataBase;

import java.util.Date;
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

	/*
	 * Methode zum Einlesen eines Leihscheines
	 */
	void insertLeihschein (int leihscheinNummer, Date anfangausleihe, Date endeausleihe) throws DataFormatException;
	
	/*
	 * Methode um Update eines Leihscheins
	 */
	void updateLeihschein (int leihscheinNummer, Date anfangausleihe, Date endeausleihe);
	
	/*
	 * Methode zum Löschen eines Leihscheins
	 */
	void deleteLeihschein (int leihscheinNummer, Date anfangausleihe, Date endeausleihe) throws DataFormatException;
	
}
