package Projektarbeit.leihVorgang;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class MailFehlendeInfo implements JavaDelegate {

	public void execute(DelegateExecution execution) throws Exception {

		String anrede = (String) execution.getVariable("anrede");
		String vorname = (String) execution.getVariable("vorname");
		String nachname = (String) execution.getVariable("nachname");
		String taetigkeit = (String) execution.getVariable("taetigkeit");
		String email = (String) execution.getVariable("email");

		String mailtext = "Sehr geehrte/er " + anrede + " " + vorname + " " + nachname + ",\n" + "\n,vielen Dank für Ihre Leihanfrage."
		+ "\nLeider müssen wir Ihnen mitteilen, dass die angegebenen Informationen nicht ausreichen."
		+ "\nFür eine Bearbeitung der Anfrage füllen Sie bitte alle vorgegebeben Felder wahrheitsgemäß und vollständig aus."		
		+ "\nSollte Sie direkte Fragen zum Verfahren haben können Sie gerne eine E-MAil senden an:" 
		+ "\nini-studimeile@students-htw.de"
		+ "\nDie Anfrage wird hiermit geschlossen. Stellen Sie für eine Leihe bitte eine neue Anfrage mit den aufgeführten Inhalten."
		+ "\n\nMit freundlichen Grüßen,\n die Initiative Studimeile";

		String subject = "Ihre Leihanfrage - Absage mangels Informationen";
		sendEmail(mailtext, subject, email);
	}

	public void sendEmail(String mailtext, String subject, String toEmail) throws EmailException {
		//https://anleitungen.rz.htw-berlin.de/de/email/e-mail_programm/

		/*
		 * Host und Mail anpassen!!!
		 */
		MultiPartEmail email = new MultiPartEmail();
		email.setCharset("utf-8");
		email.setSSL(true);
		email.setSmtpPort(587);
//		email.setHostName("mail.gmx.net");
//		email.setAuthentication("XXXX@gmx.de", "XXXXXXX");
//		email.addTo(toEmail);
//		email.setFrom("XXXXXX@gmx.de");
		email.setHostName("mail.htw-berlin.de");
		email.setAuthentication("s0558874", "@Swastika83");
		email.addTo(toEmail);
		email.setFrom("s0558874@htw-berlin.de");
		email.setSubject(subject);
		email.setMsg(mailtext);
		email.send();

	}

}
