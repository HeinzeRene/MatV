package Projektarbeit.leihVorgang;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.runtime.Execution;

public class setVariableDelegate implements JavaDelegate {

	private Integer idPerson;
	private String anrede, vorname, nachname, matrikelnummer, adresse, plz, wohnort;

	/* (non-Javadoc)
	 * @see org.camunda.bpm.engine.delegate.JavaDelegate#execute(org.camunda.bpm.engine.delegate.DelegateExecution)
	 */
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		
		idPerson = (Integer) execution.getVariable("idPerson");
		if(idPerson.equals("")) {
			idPerson.setIdPerson();
		}
		
		anrede = (String) execution.getVariable("anrede");
		vorname = (String) execution.getVariable("vorname");
		nachname = (String) execution.getVariable("nachname");
		matrikelnummer = (String) execution.getVariable("matrikelnummer");
		adresse = (String) execution.getVariable("adresse");
		plz = (String) execution.getVariable("plz");
		wohnort = (String) execution.getVariable("wohnort");
		
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
	private Integer setIdPerson(Integer idPerson) {
		idPerson =  setIdPersonConvert ((Math.random()*9999)+10000);
		return  idPerson;
	}
	
	
}	
