import resources.STC05_SearchPanelistHelper;
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

/**
 * Description : Functional Test Script
 * 
 * @author John Burke
 */
public class STC05_SearchPanelist extends STC05_SearchPanelistHelper {

	public void testMain(Object[] args) {

		// reset the database
		SetDB.resetDB(false);

		// register panelist #1-6 to search
		int index = 1;
		while(dpString("Panelist " + index).equalsIgnoreCase("True")){
			SetDB.registerPanelist(
					dpInt("UserID " + index),				// user ID start at four and count up for each new panelist
					dpString("Fname " + index),				// first name
					dpString("Lname " + index),				// last name
					dpString("username " + index),			// username
					dpString("password " + index),			// password
					dpString("Institution " + index),		// Institution
					dpString("Address " + index),			// Address
					dpString("city " + index),				// City
					dpString("State " + index),				// State
					dpString("zip " + index),				// ZipCode
					dpString("Telephone " + index),			// Telephone
					dpString("Email " + index),				// Email
					dpString("Gender " + index),			// Gender
					dpString("Ethnicity " + index),			// Ethnicity
					dpString("Area of expertise " + index),	// Expertise
					dpInt("ISC ID " + index++)); 				// ISC ID 
		}
		
		
		// HTML Browser
		// Document: ISC Control System:
		// http://localhost:8080/International_Science_Consortium/
		startApp("http://localhost:8080/International_Science_Consortium/");

		// Find and enter employee username
		((GuiTestObject) text_username().find()).click();
		browser_htmlBrowser(document_iscControlSystem(), DEFAULT_FLAGS)
				.inputChars(dpString("Login"));

		// Find and enter employee password
		((GuiTestObject) text_password().find()).click();
		browser_htmlBrowser(document_iscControlSystem(), DEFAULT_FLAGS)
				.inputChars(dpString("Login"));

		// click login button
		button_logInsubmit().click();

		// click search for panelist button
		((GuiTestObject) link_searchForPanelists().find()).click();

		// Find and enter the first name of panelist
		((TextGuiTestObject) text_pFName().find()).click();
		browser_htmlBrowser(document_iscControlSystem2(), DEFAULT_FLAGS)
				.inputChars(dpString("Fname"));

		// Find and enter the last name of panelist
		((TextGuiTestObject) text_pLName().find()).click();
		browser_htmlBrowser(document_iscControlSystem2(), DEFAULT_FLAGS)
				.inputChars(dpString("Lname"));

		// Find and enter the Institution of panelist
		((TextGuiTestObject) text_pInstitution().find()).click();
		browser_htmlBrowser(document_iscControlSystem2(), DEFAULT_FLAGS)
				.inputChars(dpString("Institution"));

		// Find and enter the Address of panelist
		((TextGuiTestObject) text_pAddress().find()).click();
		browser_htmlBrowser(document_iscControlSystem2(), DEFAULT_FLAGS)
				.inputChars(dpString("Address"));

		// Find and enter the City of panelist
		((TextGuiTestObject) text_pCity().find()).click();
		browser_htmlBrowser(document_iscControlSystem2(), DEFAULT_FLAGS)
				.inputChars(dpString("City"));

		// Find and enter the State of panelist
		((TextGuiTestObject) text_pState().find()).click();
		browser_htmlBrowser(document_iscControlSystem2(), DEFAULT_FLAGS)
				.inputChars(dpString("State"));

		// Find and enter the Zip of panelist
		((TextGuiTestObject) text_pZip().find()).click();
		browser_htmlBrowser(document_iscControlSystem2(), DEFAULT_FLAGS)
				.inputChars(dpString("Zip"));

		// Find and enter the Telephone of panelist
		((TextGuiTestObject) text_pTelephone().find()).click();
		browser_htmlBrowser(document_iscControlSystem2(), DEFAULT_FLAGS)
				.inputChars(dpString("Telephone"));

		// Find and enter the Email of panelist
		((TextGuiTestObject) text_pEmail().find()).click();
		browser_htmlBrowser(document_iscControlSystem2(), DEFAULT_FLAGS)
				.inputChars(dpString("Email"));

		// Find and enter the Gender of panelist
		((GuiTestObject) list_pGender().find()).click();
		list_pGender().click(atText(dpString("Gender")));

		// Find and enter the Ethnicity of panelist
		((TextGuiTestObject) text_pEthnicity().find()).click();
		browser_htmlBrowser(document_iscControlSystem2(), DEFAULT_FLAGS)
				.inputChars(dpString("Ethnicity"));

		// Find and enter the Area of expertise of panelist
		((TextGuiTestObject) text_pExpertise().find()).click();
		browser_htmlBrowser(document_iscControlSystem2(), DEFAULT_FLAGS)
				.inputChars(dpString("Area of expertise"));

		// Find and enter the ISC ID of panelist
		((TextGuiTestObject) text_pISCID().find()).click();
		browser_htmlBrowser(document_iscControlSystem2(), DEFAULT_FLAGS)
				.inputKeys(dpString("ISC ID"));

		// Click search button
		((GuiTestObject) button_searchsubmit().find()).click();

		// Verification point
		if (dpString("TestType").equalsIgnoreCase("Sunny")) {
			// successful search
			browser_htmlBrowser().performTest(SuccessfulSearchVP());
		} else if (dpString("TestType").equalsIgnoreCase("Rainy")) {
			// failed search
			browser_htmlBrowser().performTest(FailedSearchVP());
		}

		// Click logout button for employee
		((GuiTestObject) link_logout().find()).click();

		// Close the browser
		browser_htmlBrowser(document_iscControlSystem3(), DEFAULT_FLAGS)
				.close();

		// reset the database
		SetDB.resetDB(false);

	}
}
