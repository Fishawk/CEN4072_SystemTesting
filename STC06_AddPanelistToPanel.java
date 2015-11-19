import resources.STC06_AddPanelistToPanelHelper;
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
 * @author John
 */
public class STC06_AddPanelistToPanel extends STC06_AddPanelistToPanelHelper {
	/**
	 * Script Name : <b>STC06_AddPanelistToPanel</b> Generated : <b>Nov 16, 2015
	 * 9:57:42 PM</b> Description : Functional Test Script Original Host : WinNT
	 * Version 6.3 Build 9600 ()
	 * 
	 * @since 2015/11/16
	 * @author John
	 */
	public void testMain(Object[] args) {

		// reset the database
		SetDB.resetDB(false);

		// WHo is Who
		final boolean SUNNY = dpString("TestType").equalsIgnoreCase("Sunny");
		final boolean RAINY1 = dpString("TestType").equalsIgnoreCase("Rainy1");
		final boolean RAINY2 = dpString("TestType").equalsIgnoreCase("Rainy2");
		final boolean RAINY3 = dpString("TestType").equalsIgnoreCase("Rainy3");

		// add panelist to the database to add to the panels
		int index = 1;
		while (dpString("Panelist " + index).equalsIgnoreCase("True")) {
			SetDB.registerPanelist((3 + index), // user ID starts at '4' 
					dpString("Fname " + index), // first name
					dpString("Lname " + index), // last name
					dpString("username " + index), // username
					dpString("password " + index), // password
					dpString("Institution " + index), // Institution
					dpString("Address " + index), // Address
					dpString("city " + index), // City
					dpString("State " + index), // State
					dpString("zip " + index), // ZipCode
					dpString("Telephone " + index), // Telephone
					dpString("Email " + index), // Email
					dpString("Gender " + index), // Gender
					dpString("Ethnicity " + index), // Ethnicity
					dpString("Area of expertise " + index), // Expertise
					dpInt("ISC ID " + index++)); // ISC ID
		}

		// add panels to the database to add panelist to
		index = 1;
		while (dpString("Panel " + index).equalsIgnoreCase("True")) {
			SetDB.createPanel((2 + index), 
					dpString("PanelName " + index),
					dpString("PanelDescription " + index++));
		}

		// HTML Browser
		// Document: ISC Control System:
		startApp("http://localhost:8080/International_Science_Consortium/");

		// Employee Login user name
		((TextGuiTestObject) text_username().find()).click();
		browser_htmlBrowser(document_iscControlSystem(), DEFAULT_FLAGS)
				.inputChars(dpString("EUsername"));

		// Employee login password
		((TextGuiTestObject) text_password().find()).click();
		browser_htmlBrowser(document_iscControlSystem(), DEFAULT_FLAGS)
				.inputChars(dpString("Epassword"));

		// click login button
		button_logInsubmit().click();
			
		// verification
		if (SUNNY) {
			// Click search for panelist to find a panelist in the database to
			// add to a panel
			((GuiTestObject) link_searchForPanelists().find()).click();

			// Find panelist by last name to add to panel
			((TextGuiTestObject) text_pLName().find()).click();
			browser_htmlBrowser(document_iscControlSystem2(), DEFAULT_FLAGS)
					.inputChars(dpString("Lname"));

			// click panelist search submit button
			((GuiTestObject) button_searchsubmit().find()).click();

			// click the display with the titles of the panels button
			((GuiTestObject) list_addToPanel().find()).click();

			// find and click the title of the panel to add a panelist to
			list_addToPanel().click(atText(dpString("Panel")));

			// click the add panelist to a panel submit button
			((GuiTestObject) button_addToPanelsubmit().find()).click();
			
			// verification point
			browser_htmlBrowser().performTest(SunnyAddPanelistToPanelVP());
			
		} else if (RAINY1) {
			// make sure an admin cannot add panelist to a panel
			// verification point #1
			browser_htmlBrowser().performTest(Rainy1AddPanelistToPanelsVP());
			
			//Verification point #2
			table_htmlTable_0().performTest(
					Rainy1AddPanelistToPanel_HtmlTableVP());

		} else if (RAINY2) {
			// make sure a panelist cannot add panelist to a panel
			// verification point #1
			browser_htmlBrowser().performTest(Rainy2AddPanelistToPanelVP());
			
			// verification point #1
			table_htmlTable_0().performTest(
					Rainy2AddPanelistToPanelHtmlTableVP());

		} else if (RAINY3) {
			// try to add a panelist to two different panels
			SetDB.addPanelistToPanel(1000, 1);

			// Click search for panelist to find a panelist in the database to
			// add to a panel
			((GuiTestObject) link_searchForPanelists().find()).click();

			// Find panelist by last name to add to panel
			((TextGuiTestObject) text_pLName().find()).click();
			browser_htmlBrowser(document_iscControlSystem2(), DEFAULT_FLAGS)
					.inputChars(dpString("Lname"));

			// click panelist search submit button
			((GuiTestObject) button_searchsubmit().find()).click();

			// click the display with the titles of the panels button
			((GuiTestObject) list_addToPanel().find()).click();

			// find and click the title of the panel to add a panelist to
			list_addToPanel().click(atText(dpString("Panel")));

			// click the add panelist to a panel submit button
			((GuiTestObject) button_addToPanelsubmit().find()).click();
			
			// verification point #1
			browser_htmlBrowser().performTest(Rainy3AddPanelistToPanelVP());
			// verification point #2
			table_htmlTable_2().performTest(Rainy3AddPanelistToPanelHtmlTableVP());
			
		}

		// Logout
		((GuiTestObject) link_logout().find()).click();

		// close the browser when finished
		browser_htmlBrowser(document_iscControlSystem2(), DEFAULT_FLAGS)
				.close();

		// reset the database
		SetDB.resetDB(false);

	}
}
