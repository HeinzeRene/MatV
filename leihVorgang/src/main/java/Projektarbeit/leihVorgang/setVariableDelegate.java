package Projektarbeit.leihVorgang;

import java.util.Date;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.runtime.Execution;

public class setVariableDelegate implements JavaDelegate {

	private int idPerson, leihscheinNummer;
	private String anrede, vorname, nachname, matrikelnummer, adresse, plz, wohnort;
	private Date anfangausleihe, endeausleihe;

	/* (non-Javadoc)
	 * @see org.camunda.bpm.engine.delegate.JavaDelegate#execute(org.camunda.bpm.engine.delegate.DelegateExecution)
	 */
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		
		idPerson = (int) execution.getVariable("idPerson");
		if(idPerson == 0 ) {
		  generateIdPerson();
		}
		
		anrede = (String) execution.getVariable("anrede");
		vorname = (String) execution.getVariable("vorname");
		nachname = (String) execution.getVariable("nachname");
		matrikelnummer = (String) execution.getVariable("matrikelnummer");
		adresse = (String) execution.getVariable("adresse");
		plz = (String) execution.getVariable("plz");
		wohnort = (String) execution.getVariable("wohnort");
		anfangausleihe = (Date) execution.getVariable("anfangausleihe");
		endeausleihe = (Date) execution.getVariable("endeausleihe");
		leihscheinNummer = (int) execution.getVariable("leihscheinNummer");
	}

	public String getVorname() {
		return vorname;
	}
	

	/**
	 * @return the anrede
	 */
	public String getAnrede() {
		return anrede;
	}


	/**
	 * @return the nachname
	 */
	public String getNachname() {
		return nachname;
	}

	/**
	 * @return the matrikelnummer
	 */
	public String getMatrikelnummer() {
		return matrikelnummer;
	}

	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @return the plz
	 */
	public String getPlz() {
		return plz;
	}

	/**
	 * @return the wohnort
	 */
	public String getWohnort() {
		return wohnort;
	}
	
	public Date getAnfangausleihe() {
		return anfangausleihe;
	}
	
	public Date getEndeausleihe(){
		return endeausleihe;
	}
	
	private void generateIdPerson() {
		idPerson = (int) Math.random()*9999+10000;
	}
	
	
}	