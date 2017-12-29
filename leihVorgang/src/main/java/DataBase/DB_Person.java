package DataBase;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.zip.DataFormatException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.sun.beans.finder.FieldFinder;

public class DB_Person implements IDataBase{

	private static final Logger L = LoggerFactory.getLogger(DB_Person.class);
	
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

	/*
	 * PRÜFEN - IDataBase mit bereits implemetierten Exceptions???
	 */

	
	
	@Override
	public void insertPerson (int idPerson, String anrede, String vorname, String nachname, String matrikelnummer, String adresse, String plz, String wohnort) throws DataFormatException {
	
		L.info("Start einlesen von Personendaten");
		String sql = "insert into Person(idPerson, anrede, vorname, nachname, matrikelnummer, adresse, plz, wohnort" + 
				"values (?, ?, ?, ?, ?, ?, ?, ?)";
		L.info(sql);
		try(PreparedStatement s = connection.prepareStatement(sql)){
			s.setInt(1, idPerson);
			s.setString(2, anrede);
			s.setString(3, vorname);
			s.setString(4, nachname);
			s.setString(5, matrikelnummer);
			s.setString(6, adresse);
			s.setString(7, plz);
			s.setString(8, wohnort);
			s.executeUpdate();
		}catch  (SQLException e) {
			L.error(""+e);
			throw new DataFormatException();
		}
		L.info("Ende des Einlesens");
	}// end of insertPerson

	@Override
	public void updatePerson(int idPerson, String anrede, String vorname, String nachname, String matrikelnummer,
			String adresse, String plz, String wohnort) {
		// TODO Auto-generated method stub
	}

	@Override
	public void deletePerson(int idPerson, String anrede, String vorname, String nachname, String matrikelnummer, String adresse,
			String plz, String wohnort) throws DataFormatException {
		L.info("Start löschen von Datensatz");
		String sql = "delete from Person where idPerson = ?";
		L.info(sql);
		try(PreparedStatement s = connection.prepareStatement(sql)){
			s.setLong(1, idPerson);
			s.executeUpdate();
		}catch (SQLException e) {
			L.error(""+e);
			throw new DataFormatException();
		}
		L.info("Ende des Löschvorganges");
		
	}

}
