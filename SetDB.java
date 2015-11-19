import resources.SetDBHelper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Description : Functional Test Script to assist with the database manipulation
 * 
 * @author John Burke
 */
public class SetDB extends SetDBHelper {
	//public static void testMain(Object[] args) {}

	/**
	 * This function is to register a panelist so to create different
	 * verification points can be made through out testing. 
	 * 
	 * The first panelist ID must start at four and count up for each 
	 * additional panelist 
	 * 
	 * @ param int ID,  
	 * @ param String FirstName, 
	 * @ param String LastName, 
	 * @ param String Username,  
	 * @ param String Password, 
	 * @ param String Institution, 
	 * @ param String Address, 
	 * @ param String City,  
	 * @ param String State, 
	 * @ param String ZipCode, 
	 * @ param String Telephone,  
	 * @ param String Email, 
	 * @ param String Gender,  
	 * @ param String Ethnicity,  
	 * @ param String expertise,  
	 * @ param int ISCID
	 */
	public static void registerPanelist(
			int ID, 
			String FirstName, 
			String LastName,
			String Username, 
			String Password, 
			String Institution, 
			String Address, 
			String City, 
			String State, 
			String ZipCode, 
			String Telephone, 
			String Email, 
			String Gender, 
			String Ethnicity, 
			String expertise,
			int ISCID) {

		StringBuilder build = new StringBuilder();

		// java.sql
		Connection connection = null;

		try {
			// NetDirect JDBC driver
			Class.forName("com.mysql.jdbc.Driver");
			String connectionUrl = "jdbc:mysql://127.0.0.1/mydb?"
					+ "user=admin&password=cen4010";

			// Creates a connection to the database
			connection = DriverManager.getConnection(connectionUrl);
			Statement stmt = connection.createStatement();

			stmt.execute("use mydb;");

			// Create a user of each type
			// Specify ID to simplify creation of references in other tables
			// Reference Storage.Repository.UserType for UserType values
			build.append("INSERT INTO iscusers (ID, Username, Password, FirstName, LastName, Locked, UserType)");
			build.append("	VALUES");
			build.append("		("+ID+", '"+Username+"', '"+Password+"', '"+FirstName+"', '"+LastName+"', 0, 0);");

			// Fill fields of table and clear StringBuilder
			stmt.executeUpdate(build.toString());
			build = new StringBuilder();
/*
			// Insert Required Employee Data
			build.append("INSERT INTO iscemployee (EID, UserID, Type)");
			build.append("	VALUES");
			build.append("		(1, "+ID+", 0);");

			// Fill fields of table and clear StringBuilder
			stmt.executeUpdate(build.toString());
			build = new StringBuilder();
*/
			// Register Panelist
			// Using basic user from iscuser INSERT
			// Reference PanelistContainer.createPanelist
			stmt.execute("SELECT 'Panelist Data, INSERT INTO (iscpanelist|panelistexpertise)' AS '';");
			build.append("INSERT INTO iscpanelist (ISCID, UserID, Institution, Address, City, State, ZipCode, Telephone, Email, Gender, Ethnicity)");
			build.append("	VALUES ("+ISCID+", "+ID+", '"+Institution+"', '"+Address+"', '"+City+"', '"+State+"',");
			build.append(" '"+ZipCode+"', '"+Telephone+"', '"+Email+"', "+(Gender.equalsIgnoreCase("Male")?0:1)+", '"+Ethnicity+"');");

			// Fill fields of table and clear StringBuilder
			stmt.executeUpdate(build.toString());
			build = new StringBuilder();

			build.append("INSERT INTO panelistexpertise (pid, expertiseid)");
			build.append("	VALUES ("+ISCID+", "+ (
					expertise.equalsIgnoreCase("Computer Science")?1:
						expertise.equalsIgnoreCase("Civil Engineering")?2:
							expertise.equalsIgnoreCase("Electrical Engineering")?3:
								expertise.equalsIgnoreCase("Computer Engineering")?4:5) +");");

			// Fill fields of table and clear StringBuilder
			stmt.execute(build.toString());
			build = new StringBuilder();

			// Close DB
			stmt.close();

		} catch (ClassNotFoundException e) {
			// Could not find the database driver
			System.out.println("SQL Exception: " + e.toString());
		} catch (SQLException e) {
			// Could not connect to the database
			System.out.println("Class Not Found Exception: " + e.toString());
		}
	}
	
	
	/**
	 * This function is to create a panel so to create different verification
	 * points can be made through out testing. 
	 * 
	 * KEY FACTORS: ***  When creating a new panel or panels, you need to start
	 * the PanelID = 3 and increment by one for each additional panel
	 */
	public static void createPanel(int PanelID, String Name, String Description) {

		StringBuilder build = new StringBuilder();

		// java.sql
		Connection connection = null;

		try {
			// NetDirect JDBC driver
			Class.forName("com.mysql.jdbc.Driver");
			String connectionUrl = "jdbc:mysql://127.0.0.1/mydb?"
					+ "user=admin&password=cen4010";

			// Creates a connection to the database
			connection = DriverManager.getConnection(connectionUrl);
			Statement stmt = connection.createStatement();

			stmt.execute("use mydb;");

			// Create a panel
			// Reference PanelContainer.createPanel(...)
			build.append("INSERT INTO panel(PanelID, Name, Description)");
			build.append("	VALUES");
			build.append("		("+PanelID+", '"+Name+"', '"+Description+"');");

			// Fill fields of table and clear StringBuilder
			stmt.executeUpdate(build.toString());
			build = new StringBuilder();

			build.append("INSERT INTO panelhistory (PanelID, PanelStatus, Comments)");
			build.append("	VALUES");
			build.append("		("+PanelID+", 'In Progress', 'Panel Created');");

			// Fill fields of table and clear StringBuilder
			stmt.executeUpdate(build.toString());
			build = new StringBuilder();

			build.append("INSERT INTO panelaccess (EmployeeID, PanelID)");
			build.append("	VALUES");
			build.append("		(1, "+PanelID+");");

			// Fill fields of table and clear StringBuilder
			stmt.executeUpdate(build.toString());
			build = new StringBuilder();

			// Close DB
			stmt.close();

		} catch (ClassNotFoundException e) {
			// Could not find the database driver
			System.out.println("SQL Exception: " + e.toString());
		} catch (SQLException e) {
			// Could not connect to the database
			System.out.println("Class Not Found Exception: " + e.toString());
		}

	}

	/**
	 * This function is to add a panelist to a panel to create different
	 * verification points can be made through out testing 
	 * 
	 * KEY FACTORS: ***  when adding a panelist to a panel, you must have the 
	 * panelist id which is between 1000-1005 and the panel ID which would be 
	 * one through the last panel YOU created.
	 */
	public static void addPanelistToPanel(int PanelistID, int PanelID) {

		StringBuilder build = new StringBuilder();

		// java.sql
		Connection connection = null;

		try {
			// NetDirect JDBC driver
			Class.forName("com.mysql.jdbc.Driver");
			String connectionUrl = "jdbc:mysql://127.0.0.1/mydb?"
					+ "user=admin&password=cen4010";

			// Creates a connection to the database
			connection = DriverManager.getConnection(connectionUrl);
			Statement stmt = connection.createStatement();

			stmt.execute("use mydb;");

			// Add Panelist to Panel
			stmt.execute("SELECT 'Add Panelist to Panel...' AS '';");
			build.append("INSERT INTO servingpanelists (PanelistID, PanelID)");
			build.append("	VALUES ("+PanelistID+", "+PanelID+");");

			// Fill fields of table and clear StringBuilder
			stmt.execute(build.toString());
			build = new StringBuilder();

			// Close DB
			stmt.close();

		} catch (ClassNotFoundException e) {
			// Could not find the database driver
			System.out.println("SQL Exception: " + e.toString());
		} catch (SQLException e) {
			// Could not connect to the database
			System.out.println("Class Not Found Exception: " + e.toString());
		}
	}
	
	/**
	 * This method resets the database to a clean slate.
	 * IFF a test case within a script crashes the database set the mode to true 
	 * ELSE set to false
	 * @param mode
	 */
	public static void resetDB(boolean mode) {

		StringBuilder build = new StringBuilder();

		// java.sql
		Connection connection = null;

		try {
			// NetDirect JDBC driver
			Class.forName("com.mysql.jdbc.Driver");
			String connectionUrl = "jdbc:mysql://127.0.0.1/mydb?"
					+ "user=admin&password=cen4010";

			// Creates a connection to the database
			connection = DriverManager.getConnection(connectionUrl);
			Statement stmt = connection.createStatement();

			if(mode){
			stmt.execute("SELECT 'CREATE USER \'admin\'@\'localhost\' and GRANT PRIVELEGES' AS '';");
			stmt.execute("DROP USER 'admin'@'localhost';");
			stmt.execute("CREATE USER 'admin'@'localhost' IDENTIFIED BY 'cen4010';");
			stmt.execute("GRANT ALL PRIVILEGES ON mydb.* TO 'admin'@'localhost';");
			stmt.execute("FLUSH PRIVILEGES;");
			}
			/*****************************************************************************
			 * Create `mydb` Database Reference Storage.Repository.DBConnection
			 ******************************************************************************/
			stmt.execute("SELECT 'DROP and CREATE DATABSE mydb' AS '';");
			stmt.execute("DROP DATABASE IF EXISTS mydb;");
			stmt.execute("CREATE DATABASE mydb;");

			/*****************************************************************************
			 * Create `mydb` Tables
			 ******************************************************************************/
			stmt.execute("use mydb;");

			// Create panel table
			stmt.execute("DROP TABLE IF EXISTS panel;");
			build.append("CREATE TABLE panel (");
			build.append("    PanelID INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,");
			build.append("    Name VARCHAR(45),");
			build.append("    Description TEXT);");

			// Add table and clear StringBuilder
			stmt.execute(build.toString());
			build = new StringBuilder();

			// Create status table
			stmt.execute("DROP TABLE IF EXISTS status;");
			build.append("CREATE TABLE status (");
			build.append("    StatusID INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,");
			build.append("    Type VARCHAR(45) );");

			// Add table and clear StringBuilder
			stmt.execute(build.toString());
			build = new StringBuilder();

			// Create panel history table
			stmt.execute("DROP TABLE IF EXISTS panelhistory;");
			build.append("CREATE TABLE panelhistory (");
			build.append("    PanelID INT UNSIGNED AUTO_INCREMENT,");
			build.append("    PanelStatus VARCHAR(45),");
			build.append("    StatusDate DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,");
			build.append("    Comments TEXT,");
			build.append("    FOREIGN KEY (PanelID) REFERENCES panel(PanelID) );");

			// Add table and clear StringBuilder
			stmt.execute(build.toString());
			build = new StringBuilder();

			// Create ISCUsers table
			stmt.execute("DROP TABLE IF EXISTS iscusers;");
			build.append("CREATE TABLE iscusers (");
			build.append("    ID INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,");
			build.append("    Username VARCHAR(45),");
			build.append("    Password VARCHAR(45),");
			build.append("    FirstName VARCHAR(45),");
			build.append("    LastName VARCHAR(45),");
			build.append("    Locked VARCHAR(45),");
			build.append("    UserType INT );");

			// Add table and clear StringBuilder
			stmt.execute(build.toString());
			build = new StringBuilder();

			// Create ISCEmployee table
			stmt.execute("DROP TABLE IF EXISTS iscemployee;");
			build.append("CREATE TABLE iscemployee (");
			build.append("    EID INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,");
			build.append("    UserID INT UNSIGNED,");
			build.append("    Type TINYINT,");
			build.append("    FOREIGN KEY (UserID) REFERENCES iscusers(ID) );");

			// Add table and clear StringBuilder
			stmt.execute(build.toString());
			build = new StringBuilder();

			// Create ISCID table
			stmt.execute("DROP TABLE IF EXISTS iscids;");
			build.append("CREATE TABLE iscids (");
			build.append("    iscid INT UNSIGNED PRIMARY KEY );");

			// Add table and clear StringBuilder
			stmt.execute(build.toString());
			build = new StringBuilder();

			// Create ISCPanelist table
			stmt.execute("DROP TABLE IF EXISTS iscpanelist;");
			build.append("CREATE TABLE iscpanelist (");
			build.append("    ISCID INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,");
			build.append("    UserID INT UNSIGNED NOT NULL,");
			build.append("    Institution VARCHAR(45),");
			build.append("    Address VARCHAR(45),");
			build.append("    City VARCHAR(45),");
			build.append("    State VARCHAR(45),");
			build.append("    ZipCode VARCHAR(45),");
			build.append("    Telephone VARCHAR(45),");
			build.append("    Email VARCHAR(45),");
			build.append("    Gender INT,");
			build.append("    Ethnicity VARCHAR(45) );");

			// add table and clear StringBuilder
			stmt.execute(build.toString());
			build = new StringBuilder();

			// Create expertise table
			stmt.execute("DROP TABLE IF EXISTS expertise;");
			build.append("CREATE TABLE expertise (");
			build.append("    ID INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,");
			build.append("    Name VARCHAR(45) );");

			// Add table and clear StringBuilder
			stmt.execute(build.toString());
			build = new StringBuilder();

			// Create panelistExpertise table
			stmt.execute("DROP TABLE IF EXISTS panelistexpertise;");
			build.append("CREATE TABLE panelistexpertise (");
			build.append("    pid INT UNSIGNED NOT NULL,");
			build.append("    expertiseid INT UNSIGNED NOT NULL,");
			build.append("    FOREIGN KEY (pid) REFERENCES iscpanelist(ISCID),");
			build.append("    FOREIGN KEY (expertiseid) REFERENCES expertise(ID) );");

			// Add table and clear StringBuilder
			stmt.execute(build.toString());
			build = new StringBuilder();

			// Create servingPanelist table
			stmt.execute("DROP TABLE IF EXISTS servingpanelists;");
			build.append("CREATE TABLE servingpanelists (");
			build.append("    PanelistID INT UNSIGNED NOT NULL,");
			build.append("    PanelID INT UNSIGNED NOT NULL,");
			build.append("    FOREIGN KEY (PanelistID) REFERENCES iscpanelist(ISCID),");
			build.append("    FOREIGN KEY (PanelID) REFERENCES panel(PanelID) );");

			// Add table and clear StringBuilder
			stmt.execute(build.toString());
			build = new StringBuilder();

			// Create panelAccess table
			stmt.execute("DROP TABLE IF EXISTS panelaccess;");
			build.append("CREATE TABLE panelaccess (");
			build.append("    EmployeeID INT UNSIGNED NOT NULL,");
			build.append("    PanelID INT UNSIGNED NOT NULL,");
			build.append("    FOREIGN KEY (EmployeeID) REFERENCES iscemployee(EID),");
			build.append("    FOREIGN KEY (PanelID) REFERENCES panel(PanelID) );");

			// Add table and clear StringBuilder
			stmt.execute(build.toString());
			build = new StringBuilder();

			/*****************************************************************************
			 * Initialize Required Data Rows
			 ******************************************************************************/

			// Create some usable iscids for registering panelists
			// Reference PanelistContainer.createPanelist
			build.append("INSERT INTO iscids (iscid)");
			build.append("	VALUES (999),(1000),(1001),(1002),(1003),(1004),(1005);");

			// Fill fields of table and clear StringBuilder
			stmt.executeUpdate(build.toString());
			build = new StringBuilder();

			// Forms/register.html specifies values which are inserted by
			// PanelistContainer.createPanelist(...)
			build.append("INSERT INTO expertise (ID, Name)");
			build.append("    VALUES ");
			build.append("        (1, 'Computer Science'),");
			build.append("        (2, 'Civil Engineering'),");
			build.append("        (3, 'Electrical Engineering'),");
			build.append("        (4, 'Computer Engineering'),");
			build.append("        (5, 'Physics');");

			// Fill fields of table and clear StringBuilder
			stmt.executeUpdate(build.toString());
			build = new StringBuilder();

			/*****************************************************************************
			 * Initialize Sample Data Rows
			 ******************************************************************************/

			// Create a user of each type
			// Specify ID to simplify creation of references in other tables
			// Reference Storage.Repository.UserType for UserType values
			build.append("INSERT INTO iscusers (ID, Username, Password, FirstName, LastName, Locked, UserType)");
			build.append("	VALUES");
			build.append("		(1, 'admin', 'admin', 'Peter', 'Clarke', 0, 2),");
			build.append("		(2, 'employee', 'employee', 'John', 'Doe', 0, 1),");
			build.append("		(3, 'panelist', 'panelist', 'Jane', 'Doe', 0, 0);");

			// Fill fields of table and clear StringBuilder
			stmt.executeUpdate(build.toString());
			build = new StringBuilder();

			// Insert Required Employee Data
			build.append("INSERT INTO iscemployee (EID, UserID, Type)");
			build.append("	VALUES");
			build.append("		(1, 2, 1);");

			// Fill fields of table and clear StringBuilder
			stmt.executeUpdate(build.toString());
			build = new StringBuilder();

			// Register Panelist
			// Using basic user from iscuser INSERT
			// Reference PanelistContainer.createPanelist
			build.append("INSERT INTO iscpanelist (ISCID, UserID, Institution, Address, City, State, ZipCode, Telephone, Email, Gender, Ethnicity)");
			build.append("	VALUES (999, 3, 'FIU', '123 Fiu Lane', 'Miami', 'FL', '33127', '1234567890', 'jane@doe.com', 0, 'all');");

			// Fill fields of table and clear StringBuilder
			stmt.executeUpdate(build.toString());
			build = new StringBuilder();

			build.append("INSERT INTO panelistexpertise (pid, expertiseid)");
			build.append("	VALUES (999, 5);");

			// Fill fields of table and clear StringBuilder
			stmt.execute(build.toString());
			build = new StringBuilder();

			// Create a panel
			// Reference PanelContainer.createPanel(...)
			build.append("INSERT INTO panel(PanelID, Name, Description)");
			build.append("	VALUES");
			build.append("		(1, 'Algorithms', 'Best Algorithms by Computer Scientists.'),");
			build.append("		(2, 'FIU Panel', 'All about FIU');");

			// Fill fields of table and clear StringBuilder
			stmt.executeUpdate(build.toString());
			build = new StringBuilder();

			build.append("INSERT INTO panelhistory (PanelID, PanelStatus, Comments)");
			build.append("	VALUES");
			build.append("		(1, 'In Progress', 'Panel Created'),");
			build.append("		(2, 'In Progress', 'Panel Created');");

			// Fill fields of table and clear StringBuilder
			stmt.executeUpdate(build.toString());
			build = new StringBuilder();

			build.append("INSERT INTO panelaccess (EmployeeID, PanelID)");
			build.append("	VALUES");
			build.append("		(1, 1),");
			build.append("		(1, 2);");

			// Fill fields of table and clear StringBuilder
			stmt.executeUpdate(build.toString());
			build = new StringBuilder();

			// Add Panelist to Panel
			build.append("INSERT INTO servingpanelists (PanelistID, PanelID)");
			build.append("	VALUES");
			build.append("		(999, 2);");

			// Fill fields of table and clear StringBuilder
			stmt.execute(build.toString());
			build = new StringBuilder();

			// Close DB
			stmt.close();

		} catch (ClassNotFoundException e) {
			// Could not find the database driver
			System.out.println("SQL Exception: " + e.toString());
		} catch (SQLException e) {
			// Could not connect to the database
			System.out.println("Class Not Found Exception: " + e.toString());
		}
	}
	
}
