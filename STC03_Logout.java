import resources.STC03_LogoutHelper;
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
public class STC03_Logout extends STC03_LogoutHelper {

	public void testMain(Object[] args) {

		boolean SUNNY = dpString("TestType").equalsIgnoreCase("Sunny");
		boolean RAINY1 = dpString("TestType").equalsIgnoreCase("Rainy1");
		boolean RAINY2 = dpString("TestType").equalsIgnoreCase("Rainy2");
		boolean RAINY3 = dpString("TestType").equalsIgnoreCase("Rainy3");
		
		// reset the database
		SetDB.resetDB();

		// HTML Browser
		// Document: ISC Control System:
		// http://localhost:8080/International_Science_Consortium/
		startApp("http://localhost:8080/International_Science_Consortium/");
		
		// Log user into the system
		// Find and enter username
		((TextGuiTestObject) text_username().find()).click();
		browser_htmlBrowser(document_iscControlSystem(), DEFAULT_FLAGS)
				.inputChars(dpString("username"));
		
		// find and enter password
		((TextGuiTestObject) text_password().find()).click();
		browser_htmlBrowser(document_iscControlSystem(), DEFAULT_FLAGS)
				.inputKeys(dpString("password"));
		
		// log user in
		button_logInsubmit().click();

		// verification point
		if (SUNNY) {
			
			// Click logout
			((GuiTestObject) link_logout().find()).click();
			
			//Verification Point 
			browser_htmlBrowser().performTest(SuccessfulLogoutVP());
		} else if (RAINY1) {
			
			// click something not logout
			link_administer().click();

			//Verification Point 
			browser_htmlBrowser().performTest(FailedLogout1VP());

		} else if (RAINY2) {
			
			// click something not logout
			link_editPanelistProfile2().click();

			//Verification Point 
			browser_htmlBrowser().performTest(FailedLogout2VP());
		} else if (RAINY3) {
			
			// click something not logout
			link_searchForPanelists().click();

			//Verification Point 
			browser_htmlBrowser().performTest(FailedLogout3VP());
		}

		browser_htmlBrowser(document_iscControlSystem2(), DEFAULT_FLAGS)
				.close();
	}
}
