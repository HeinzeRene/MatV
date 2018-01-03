package Projektarbeit.leihVorgang;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.zip.DataFormatException;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import DataBase.DB_Person;

public class AngebotErstellen  {


	private static final Logger L = LoggerFactory.getLogger(DB_Person.class);
	//private int leihscheinNummer = -1;	Leihscheinnummer nur anwenden, wenn MySQL nicht automatisch eine vergibt
	private int idGremium = -1;
	
	private Connection connection;
		public void setConnection(Connection connection) {
		this.connection = connection;
	}//end of connection
	
	private Connection getConnection() {
		if (connection == null) {
			try {
				throw new Exception("Connection not set");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return connection;
	}//end of getConnection 

//	public int erstelleLeihscheinNummer() {
//		L.info("Start einlesen der letzten vergebenen Leihscheinnummer");
//		String sql = "select max(leihscheinNummer) from leihschein";
//		L.info(sql);
//		try(PreparedStatement s = connection.prepareStatement(sql)){
//			
//			leihscheinNummer = Integer.parseInt(sql) +1;
//			s.executeUpdate();
//		}catch  (SQLException e) {
//			L.error(""+e);
//			try {
//				throw new Exception();
//			} catch (Exception e1) {
//				e1.printStackTrace();
//			}
//		}
//		L.info("Ende des Einlesens");
//		return leihscheinNummer;
//	}
	
	public void execute(DelegateExecution execution) throws Exception {
	
		//leihscheinNummer = erstelleLeihscheinNummer();
		anfangausleihe = 
				
		L.info("Start einlesen von Leihscheindaten");
		String sql = "insert into leihschein(idPerson, anfangausleihe, endeausleihe" + 
				"values (?, ?, ?)";
		L.info(sql);
		try(PreparedStatement s = connection.prepareStatement(sql)){
			s.setInt(1, idGremium);
			s.setDate(2, anfangausleihe);
			s.setDate(3, endeausleihe);
			s.executeUpdate();
		}catch  (SQLException e) {
			L.error(""+e);
			throw new DataFormatException();
		}
		L.info("Ende des Einlesens");
	}// end of execution

}
