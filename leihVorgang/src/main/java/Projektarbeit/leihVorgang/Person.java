package Projektarbeit.leihVorgang;

public class Person {

	String vorname;
	
	private setVariableDelegate setVar;
	
	public Person (int idPerson, String anrede, String vorname, String nachname, String matrikelnummer, String adresse, String plz, String wohnort) {
		
		anrede = setVar.getVorname();
		vorname = setVar.getVorname();
		nachname = setVar.getNachname();
		matrikelnummer = setVar.getMatrikelnummer();
		adresse = setVar.getAdresse();
		plz = setVar.getPlz();
		wohnort = setVar.getWohnort();
	}
}
