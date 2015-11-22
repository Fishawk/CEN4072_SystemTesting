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
		
		final boolean SUNNY1 = dpString("TestType").equalsIgnoreCase("Sunny1");
		final boolean SUNNY2 = dpString("TestType").equalsIgnoreCase("Sunny2");
		final boolean SUNNY3 = dpString("TestType").equalsIgnoreCase("Sunny3");
		final boolean RAINY1 = dpString("TestType").equalsIgnoreCase("Rainy1");
		final boolean RAINY2 = dpString("TestType").equalsIgnoreCase("Rainy2");
		final boolean RAINY3 = dpString("TestType").equalsIgnoreCase("Rainy3");

		// register panelist #1-6 to search
		int index = 1;
		while(dpString("Panelist " + index).equalsIgnoreCase("True")){
			SetDB.registerPanelist( (3 + index),			// user ID start at '4'
					dpString("Fname " + index),				// first name
					dpString("Lname " + index),				// last name
					dpString("Username " + index),			// username
					dpString("Password " + index),			// password
					dpString("Institution " + index),		// Institution
					dpString("Address " + index),			// Address
					dpString("City " + index),				// City
					dpString("State " + index),				// State
					dpString("Zip " + index),				// ZipCode
					dpString("Telephone " + index),			// Telephone
					dpString("Email " + index),				// Email
					dpString("Gender " + index),			// Gender
					dpString("Ethnicity " + index),			// Ethnicity
					dpString("Area of expertise " + index),	// Expertise
					dpInt("ISC ID " + index++)); 				// ISC ID 
		}
		
		
		// HTML Browser
		// Document: ISC Control System:
		startApp("http://localhost:8080/International_Science_Consortium/");

		// Find and enter employee user name
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
		
		// Verification point
		if (SUNNY1) {

			// Find and enter the first name of panelist
			((TextGuiTestObject) text_pFName().find()).click();
			browser_htmlBrowser(document_iscControlSystem2(), DEFAULT_FLAGS)
					.inputChars(dpString("Fname"));

			// Click search button
			((GuiTestObject) button_searchsubmit().find()).click();

			// successful search
			browser_htmlBrowser().performTest(SuccessfulSearchVP());
			
		} else if (SUNNY2) {
			
			// Find and enter the last name of panelist
			((TextGuiTestObject) text_pLName().find()).click();
			browser_htmlBrowser(document_iscControlSystem2(), DEFAULT_FLAGS)
					.inputChars(dpString("Lname"));

			// Click search button
			((GuiTestObject) button_searchsubmit().find()).click();

			// successful search
			browser_htmlBrowser().performTest(SuccessfulSearchVP());
			
		}else if (SUNNY3) {

			// Click search button
			((GuiTestObject) button_searchsubmit().find()).click();

			// successful search
			browser_htmlBrowser().performTest(SuccessfulSearchVP());
			
		}else if (RAINY1) {

			// Find and enter the Telephone of panelist
			((TextGuiTestObject) text_pTelephone().find()).click();
			browser_htmlBrowser(document_iscControlSystem2(), DEFAULT_FLAGS)
					.inputChars(dpString("Telephone"));

			// Click search button
			((GuiTestObject) button_searchsubmit().find()).click();

			// failed search
			browser_htmlBrowser().performTest(FailedSearchVP());
			
		}else if (RAINY2) {

			// Find and enter the Email of panelist
			((TextGuiTestObject) text_pEmail().find()).click();
			browser_htmlBrowser(document_iscControlSystem2(), DEFAULT_FLAGS)
					.inputChars(dpString("Email"));

			// Click search button
			((GuiTestObject) button_searchsubmit().find()).click();

			// failed search
			browser_htmlBrowser().performTest(FailedSearchVP());
			
		}else if (RAINY3) {

			// Find and enter the ISC ID of panelist
			((TextGuiTestObject) text_pISCID().find()).click();
			browser_htmlBrowser(document_iscControlSystem2(), DEFAULT_FLAGS)
					.inputKeys(dpString("ISC ID"));

			// Click search button
			((GuiTestObject) button_searchsubmit().find()).click();

			// failed search
			browser_htmlBrowser().performTest(FailedSearchVP());
			
		}

		// Click logout button for employee
		((GuiTestObject) link_logout().find()).click();

		// Close the browser
		browser_htmlBrowser(document_iscControlSystem3(), DEFAULT_FLAGS).close();

		// reset the database
		SetDB.resetDB(false);

	}
}
