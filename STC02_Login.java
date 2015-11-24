import resources.STC02_LoginHelper;
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
public class STC02_Login extends STC02_LoginHelper {
	
	public void testMain(Object[] args) {

		// reset the database
		SetDB.resetDB(false);
		
		// WHo is Who
		final boolean SUNNY = dpString("TestType").equalsIgnoreCase("Sunny");
		final boolean RAINY = dpString("TestType").equalsIgnoreCase("Rainy");

		// HTML Browser
		// Document: ISC Control System:
		startApp("http://localhost:8080/International_Science_Consortium/");
		
		// find and enter username 
		((TextGuiTestObject) text_username().find()).click();
		//text_username().click();
		browser_htmlBrowser(document_iscControlSystem(), DEFAULT_FLAGS)
				.inputChars(dpString("Username"));
		
		// Find and enter password 
		((GuiTestObject) text_password().find()).click();
		browser_htmlBrowser(document_iscControlSystem(), DEFAULT_FLAGS)
				.inputChars(dpString("Password"));
		
		// Click login
		button_logInsubmit().click();

		//Verification Point 
		if (SUNNY) {
			// verification point
			browser_htmlBrowser().performTest(SunnyLoginVP());
			
			// Logout
			((GuiTestObject) link_logout().find()).click();
		} else if (RAINY) {
			// verification point
			browser_htmlBrowser().performTest(FailedLoginVP());
		}
		
		// close the browser when finished
		browser_htmlBrowser(document_iscControlSystem2(), DEFAULT_FLAGS).close();

		// reset the database
		SetDB.resetDB(false);
	}
}
