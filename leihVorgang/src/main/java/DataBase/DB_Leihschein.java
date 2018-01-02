package DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.zip.DataFormatException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class DB_Leihschein implements IDataBase {


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
	}
	
	@Override
	public void insertLeihschein(int leihscheinNummer, Date anfangausleihe, Date endeausleihe) throws DataFormatException {
		// TODO Auto-generated method stub

		L.info("Start einlesen von Leihschein");
		String sql = "insert into leihschein(leihscheinNummer, anfangausleihe, endeausleihe" + 
				"values (?, ?, ?)";
		L.info(sql);
		try(PreparedStatement s = connection.prepareStatement(sql)){
			s.setInt(1, leihscheinNummer);
			s.setDate(2, (java.sql.Date) anfangausleihe);
			s.setDate(3, (java.sql.Date) endeausleihe);
			s.executeUpdate();
		}catch  (SQLException e) {
			L.error(""+e);
			throw new DataFormatException();
		}
		L.info("Ende des Einlesens");
		
	}

	@Override
	public void updateLeihschein(int leihscheinNummer, Date anfangausleihe, Date endeausleihe) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteLeihschein(int leihscheinNummer) throws DataFormatException {
		// TODO Auto-generated method stub
		L.info("Start löschen von Datensatz Leihschein");
		String sql = "delete from leihschein where leihscheinNummer = ?";
		L.info(sql);
		try(PreparedStatement s = connection.prepareStatement(sql)){
			s.setInt(1, leihscheinNummer);
			s.executeUpdate();
		}catch (SQLException e) {
			L.error(""+e);
			throw new DataFormatException();
		}
		L.info("Ende des Löschvorganges");
	}

}
