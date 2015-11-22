
import resources.STC08_ViewPanelInformationHelper;
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
 * Description   : Functional Test Script
 * @author John Burke
 */
public class STC08_ViewPanelInformation extends STC08_ViewPanelInformationHelper
{
	/**
	 * Script Name   : <b>ViewPanelInformationSunny</b>
	 * Generated     : <b>Oct 18, 2015 5:36:26 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.3  Build 9600 ()
	 * 
	 * @since  2015/10/18
	 * @author John Burke
	 */
	public void testMain(Object[] args) 
	{
		//reset database
		SetDB.resetDB(false);
		
		// Who is Who
		final boolean SUNNY1 = dpString("TestType").equalsIgnoreCase("Sunny1");
		final boolean SUNNY2 = dpString("TestType").equalsIgnoreCase("Sunny2");
		final boolean SUNNY3 = dpString("TestType").equalsIgnoreCase("Sunny3");
		final boolean RAINY1 = dpString("TestType").equalsIgnoreCase("Rainy1");
		final boolean RAINY2 = dpString("TestType").equalsIgnoreCase("Rainy2");
		final boolean RAINY3 = dpString("TestType").equalsIgnoreCase("Rainy3");
		
		// set up the database
		
		// the index is to control the panelist, panels 
		// and panelist add to the panels for testing
		int index = 1;
		
		// add panelist to add to panels
		while(dpString("Panelist " + index).equalsIgnoreCase("True")){
			SetDB.registerPanelist((3 + index),				// user ID start at '4'
					dpString("Fname " + index),				// first name
					dpString("Lname " + index),				// last name
					dpString("Username " + index),			// user name
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
					dpInt("ISC ID " + index++)); 			// ISC ID 
		}

		// Create panels to add panelist to
		index = 1;
		while (dpString("Panel " + index).equalsIgnoreCase("True")) {
			SetDB.createPanel((2 + index),
					dpString("PanelName " + index),
					dpString("PanelDescription " + index++));
		}

		// Add panelist to panel
		index = 1;
		while (dpString("AddPanelist " + index).equalsIgnoreCase("True")) {
			SetDB.addPanelistToPanel((999 + index), (2 + index++));
		}

		// HTML Browser
		// Document: ISC Control System:
		startApp("http://localhost:8080/International_Science_Consortium/");

		// find and enter user name
		((TextGuiTestObject) text_username().find()).click();
		browser_htmlBrowser(document_iscControlSystem(), DEFAULT_FLAGS)
				.inputChars(dpString("Login"));

		// Find and enter password
		((TextGuiTestObject) text_password().find()).click();
		browser_htmlBrowser(document_iscControlSystem(), DEFAULT_FLAGS)
				.inputChars(dpString("Login"));

		// Click login button
		button_logInsubmit().click();

		if (SUNNY1) {
			// click display my panels link
			((GuiTestObject) link_displayMyPanels().find()).click();

			// Click View panel #1
			((GuiTestObject) link_viewPanel().find()).click();

			// Verification point #1
			browser_htmlBrowser().performTest(Sunny1BrowserVP());

			// Verification point #2
			table_htmlTable_1().performTest(Sunny1HtmlTableVP());

		} else if (SUNNY2) {
			// click display my panels link
			((GuiTestObject) link_displayMyPanels().find()).click();

			// Click View panel #2
			((GuiTestObject) link_viewPanel2().find()).click();

			// Verification point #1
			browser_htmlBrowser().performTest(Sunny2BrowserVP());

			// Verification point #2
			table_htmlTable_1().performTest(Sunny2HtmlTableVP());

		} else if (SUNNY3) {
			// click display my panels link
			((GuiTestObject) link_displayMyPanels().find()).click();

			// Click View panel #3
			((GuiTestObject) link_viewPanel3().find()).click();

			// Verification point #3
			browser_htmlBrowser().performTest(Sunny3BrowserVP());

			// Verification point #2
			table_htmlTable_0().performTest(Sunny3HtmlTableVP());

		} else if (RAINY1) { // admin logged in
			// Verification point #1
			browser_htmlBrowser().performTest(Rainy1BrowserVP());

			// Verification point #2
			link_administer().performTest(Rainy1Administer_textVP());

		} else if (RAINY2) { // panelist logged in
			// Verification point #1
			browser_htmlBrowser().performTest(Rainy2BrowserVP());

			// Verification point #2
			link_editPanelistProfile().performTest(
					Rainy2PanelistProfile_textVP());

		} else if (RAINY3) { // early logout
			// Verification point #1
			browser_htmlBrowser().performTest(Rainy3Browser1VP());
			

			// Verification point #2
			link_displayMyPanels().performTest(Rainy3DisplayMyPanels_textVP());

		}

		// Logout
		((GuiTestObject) link_logout().find()).click();

		if (RAINY3) { // last verification point for rainy 3
			// Verification point #3
			browser_htmlBrowser().performTest(Rainy3Browser2VP());
		}

		// close browser
		browser_htmlBrowser(document_iscControlSystem(), DEFAULT_FLAGS).close();

		// reset database
		SetDB.resetDB(false);
	}
}
