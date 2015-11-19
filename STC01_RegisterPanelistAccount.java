import resources.STC01_RegisterPanelistAccountHelper;
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
import java.sql.SQLException;

/**
 * Description : Functional Test Script
 * 
 * @author John
 */
public class STC01_RegisterPanelistAccount extends
		STC01_RegisterPanelistAccountHelper {
	/**
	 * Script Name : <b>STC01_RegisterPanelistAccount</b> Generated : <b>Oct 24,
	 * 2015 12:57:09 AM</b> Description : Functional Test Script Original Host :
	 * WinNT Version 6.3 Build 9600 ()
	 * 
	 * @since 2015/10/24
	 * @author John
	 */
	public void testMain(Object[] args) {

		// reset the database
		SetDB.resetDB();
		
		// HTML Browser
		// Document: ISC Control System:
		// http://localhost:8080/International_Science_Consortium/
		startApp("http://localhost:8080/International_Science_Consortium/");

		// Document: ISC Control System:
		// http://localhost:8080/International_Science_Consortium/registration
		((GuiTestObject) link_here().find()).click();

		// Find and enter the first name
		((TextGuiTestObject) text_pFName().find()).click();
		browser_htmlBrowser(document_iscControlSystem(), DEFAULT_FLAGS)
				.inputChars(dpString("Fname"));

		// Find and enter the last name
		((TextGuiTestObject) text_pLName().find()).click();
		browser_htmlBrowser(document_iscControlSystem(), DEFAULT_FLAGS)
				.inputChars(dpString("Lname"));

		// Find and enter the username
		((TextGuiTestObject) text_username().find()).click();
		browser_htmlBrowser(document_iscControlSystem(), DEFAULT_FLAGS)
				.inputChars(dpString("Username"));

		// Find and enter the password
		((TextGuiTestObject) text_password().find()).click();
		browser_htmlBrowser(document_iscControlSystem(), DEFAULT_FLAGS)
				.inputChars(dpString("Password"));

		// Find and enter the institution
		((TextGuiTestObject) text_pInstitution().find()).click();
		browser_htmlBrowser(document_iscControlSystem(), DEFAULT_FLAGS)
				.inputChars(dpString("Institution"));

		// Find and enter the address
		((TextGuiTestObject) text_pAddress().find()).click();
		browser_htmlBrowser(document_iscControlSystem(), DEFAULT_FLAGS)
				.inputChars(dpString("Address"));

		// Find and enter the city
		((TextGuiTestObject) text_pCity().find()).click();
		browser_htmlBrowser(document_iscControlSystem(), DEFAULT_FLAGS)
				.inputChars(dpString("City"));

		// Find and enter the state
		((TextGuiTestObject) text_pState().find()).click();
		browser_htmlBrowser(document_iscControlSystem(), DEFAULT_FLAGS)
				.inputChars(dpString("State"));

		// Find and enter the Zip
		((TextGuiTestObject) text_pZip().find()).click();
		browser_htmlBrowser(document_iscControlSystem(), DEFAULT_FLAGS)
				.inputChars(dpString("Zip"));

		// Find and enter the Telephone
		((TextGuiTestObject) text_pTelephone().find()).click();
		browser_htmlBrowser(document_iscControlSystem(), DEFAULT_FLAGS)
				.inputChars(dpString("Telephone"));

		// Find and enter the email
		((TextGuiTestObject) text_pEmail().find()).click();
		browser_htmlBrowser(document_iscControlSystem(), DEFAULT_FLAGS)
				.inputChars(dpString("Email"));

		// Find and enter the Gender
		((GuiTestObject) list_pGender().find()).click();
		list_pGender().click(atText(dpString("Gender")));

		// Find and enter the Ethnicity
		((TextGuiTestObject) text_pEthnicity().find()).click();
		browser_htmlBrowser(document_iscControlSystem(), DEFAULT_FLAGS)
				.inputChars(dpString("Ethnicity"));

		// Find and enter the Area of expertise
		((GuiTestObject) list_pExpertise().find()).click();
		list_pExpertise().click(atText(dpString("Area of expertise")));

		// Find and enter the ISC ID
		((TextGuiTestObject) text_pISCID().find()).click();
		browser_htmlBrowser(document_iscControlSystem(), DEFAULT_FLAGS)
				.inputChars(dpString("ISC ID"));
		button_registersubmit().click();

		// Verification point
		if (dpString("TestType").equalsIgnoreCase("Sunny")) {
			// Successful registration
			browser_htmlBrowser().performTest(SuccessfulRegistrationVP());
		} else if (dpString("TestType").equalsIgnoreCase("Rainy")) {
			// Failed registration
			browser_htmlBrowser().performTest(FailedRegistrationVP());
		}

		// Close Window
		browser_htmlBrowser(document_iscControlSystem(), DEFAULT_FLAGS).close();
		
		// Reset the Database
		SetDB.resetDB();

	}
}
