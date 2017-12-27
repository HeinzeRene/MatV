package Projektarbeit.leihVorgang;

public class Person {

	private int idPerson;
	private String anrede, vorname, nachname, matrikelnummer, adresse, plz, wohnort;
	
	public Person(int idPerson, String anrede, String vorname, String nachname, String matrikelnummer, String adresse, String plz, String wohnort) {
		this.idPerson = idPerson;
		this.anrede = anrede;
		this.vorname = vorname;
		this.nachname = nachname;
		this.matrikelnummer = matrikelnummer;
		this.adresse = adresse;
		this.plz = plz;
		this.wohnort = wohnort;
	}

	/**
	 * @return the idPerson
	 */
	public int getIdPerson() {
		return idPerson;
	}

	/**
	 * @param idPerson the idPerson to set
	 */
	public void setIdPerson(int idPerson) {
		this.idPerson = idPerson;
	}

	/**
	 * @return the anrede
	 */
	public String getAnrede() {
		return anrede;
	}

	/**
	 * @param anrede the anrede to set
	 */
	public void setAnrede(String anrede) {
		this.anrede = anrede;
	}

	/**
	 * @return the vorname
	 */
	public String getVorname() {
		return vorname;
	}

	/**
	 * @param vorname the vorname to set
	 */
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	/**
	 * @return the nachname
	 */
	public String getNachname() {
		return nachname;
	}

	/**
	 * @param nachname the nachname to set
	 */
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	/**
	 * @return the matrikelnummer
	 */
	public String getMatrikelnummer() {
		return matrikelnummer;
	}

	/**
	 * @param matrikelnummer the matrikelnummer to set
	 */
	public void setMatrikelnummer(String matrikelnummer) {
		this.matrikelnummer = matrikelnummer;
	}

	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * @return the plz
	 */
	public String getPlz() {
		return plz;
	}

	/**
	 * @param plz the plz to set
	 */
	public void setPlz(String plz) {
		this.plz = plz;
	}

	/**
	 * @return the wohnort
	 */
	public String getWohnort() {
		return wohnort;
	}

	/**
	 * @param wohnort the wohnort to set
	 */
	public void setWohnort(String wohnort) {
		this.wohnort = wohnort;
	}
	
	
}
