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

		// HTML Browser
		// Document: ISC Control System:
		// http://localhost:8080/International_Science_Consortium/
		startApp("http://localhost:8080/International_Science_Consortium/");
		
		// find and enter username 
		((TextGuiTestObject) text_username().find()).click();
		//text_username().click();
		browser_htmlBrowser(document_iscControlSystem(), DEFAULT_FLAGS)
				.inputChars(dpString("username"));
		
		// Find and enter password 
		((GuiTestObject) text_password().find()).click();
		browser_htmlBrowser(document_iscControlSystem(), DEFAULT_FLAGS)
				.inputChars(dpString("password"));
		
		// Click login
		button_logInsubmit().click();

		//Verification Point 
		if (dpString("TestType").equalsIgnoreCase("Sunny")) {
			// verification point
			browser_htmlBrowser().performTest(LoginURLVP());
			
			// Logout
			((GuiTestObject) link_logout().find()).click();
		} else if (dpString("TestType").equalsIgnoreCase("Rainy")) {
			// verification point
			browser_htmlBrowser().performTest(FailedLoginVP());
		}
		
		// close the browser when finished
		browser_htmlBrowser(document_iscControlSystem2(), DEFAULT_FLAGS).close();

		// reset the database
		SetDB.resetDB(false);
	}
}
