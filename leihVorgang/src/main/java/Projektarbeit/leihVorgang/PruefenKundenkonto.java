package Projektarbeit.leihVorgang;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.Logger;

public class PruefenKundenkonto {

	int idPerson;
	String anrede, vorname, nachname, matrikelnummer, adresse, plz, wohnort, eMailAdresse;
	
	
	
	private static final Logger L = (Logger) LoggerFactory.getLogger(PruefenKundenkonto.class);
	
	private Connection connection;
		public void setConnection(Connection connection) {
		this.connection = connection;
	}//end of connection
	
	private Connection getConnection() {
		if (connection == null) {
			try {
				throw new Exception("Connection not set");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return connection;
	}//end of getConnection
	
	private boolean getPerson(String vorname, String nachname) throws Exception {
		
		
		L.info("Start Auslesen von Personendaten");
		//Person prs = new Person (null, "", "", "", "", "", "", "", "");
		L.info("Start Auslesen von Kundendaten");
		String sql = "select * person where vorname = ? and nachname is ?";
		L.info(sql);
		try(PreparedStatement ps = connection.prepareStatement(sql)){
			ps.setString(1, "VORNAME");
			ps.setString(2, "NACHNAME");
			try(ResultSet rs = ps.executeQuery()){
				if(rs.next()) {
					idPerson = rs.getInt("idPerson");
					vorname = rs.getString("vorname");
					nachname = rs.getString("nachname");
					matrikelnummer = rs.getString("matrikelnummer");
					adresse = rs.getString("adresse");
					plz = rs.getString("plz");
					wohnort = rs.getString("wohnort");
					eMailAdresse = rs.getString("eMailAdresse");
				}
			}catch  (SQLException e) {
			L.error(""+e);
			throw new Exception(e);
			}
		L.info("Ende des Einlesens");

		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		if(eMailAdresse == null) {
			
		}
		return false;	
		
		
	}
	
}
