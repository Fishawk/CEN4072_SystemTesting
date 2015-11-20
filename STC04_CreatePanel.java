import resources.STC04_CreatePanelHelper;
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
 * @author Princ_000
 */
public class STC04_CreatePanel extends STC04_CreatePanelHelper {
	/**
	 * Script Name : <b>STC04_CreatePanel</b> Generated : <b>Oct 19, 2015
	 * 12:52:16 AM</b> Description : Functional Test Script Original Host :
	 * WinNT Version 6.3 Build 9600 ()
	 * 
	 * @since 2015/10/19
	 * @author Princ_000
	 */
	public void testMain(Object[] args) {

		// reset the database
		SetDB.resetDB(false);
		
		// WHo is Who
		final boolean SUNNY = dpString("TestType").equalsIgnoreCase("Sunny");
		final boolean RAINY = dpString("TestType").equalsIgnoreCase("Rainy");

		// HTML Browser
		// Document: ISC Control System:
		// http://localhost:8080/International_Science_Consortium/
		startApp("http://localhost:8080/International_Science_Consortium/");

		// find and enter username
		((TextGuiTestObject) text_username().find()).click();
		browser_htmlBrowser(document_iscControlSystem(), DEFAULT_FLAGS)
				.inputKeys(dpString("Login"));
		
		// Find and enter password
		((TextGuiTestObject) text_password().find()).click();
		browser_htmlBrowser(document_iscControlSystem(), DEFAULT_FLAGS)
				.inputChars(dpString("Login"));
		button_logInsubmit().click();

		// Click create panel
		link_createAPanel().click();

		// find and enter panel name
		((TextGuiTestObject) text_panelName().find()).click();
		browser_htmlBrowser(document_iscControlSystem2(), DEFAULT_FLAGS)
				.inputChars(dpString("Panel Name"));
		
		// find and enter panel description
		((TextGuiTestObject) text_panelDescription().find()).click();
		browser_htmlBrowser(document_iscControlSystem2(), DEFAULT_FLAGS)
				.inputChars(dpString("Discription"));
		
		// click create panel
		((GuiTestObject) button_createsubmit().find()).click();

		// Verification point
		if (SUNNY) {
			//successful verification
			browser_htmlBrowser().performTest(PanelMadeVP());
			
		} else if(RAINY){
			// Failed verification 
			browser_htmlBrowser().performTest(FailedCreatePanelVP());
		}

		// Logout 
		((GuiTestObject) link_logout().find()).click();
		
		// Close Browser
		browser_htmlBrowser(document_iscControlSystem3(), DEFAULT_FLAGS).close();

		// reset the database
		SetDB.resetDB(false);

	}
}
