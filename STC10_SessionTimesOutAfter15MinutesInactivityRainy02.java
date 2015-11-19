
import resources.STC10_SessionTimesOutAfter15MinutesInactivityRainy02Helper;
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
 * @author Princ_000
 */
public class STC10_SessionTimesOutAfter15MinutesInactivityRainy02 extends STC10_SessionTimesOutAfter15MinutesInactivityRainy02Helper
{
	/**
	 * Script Name   : <b>Script1</b>
	 * Generated     : <b>Oct 19, 2015 12:24:02 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.3  Build 9600 ()
	 * 
	 * @since  2015/10/19
	 * @author Princ_000
	 */
	public void testMain(Object[] args) 
	{
		startApp("http://localhost:8080/International_Science_Consortium/");
		
		// HTML Browser
		// Document: ISC Control System: http://localhost:8080/International_Science_Consortium/
		text_username().click();
		browser_htmlBrowser(document_iscControlSystem(),DEFAULT_FLAGS).inputChars("employee");
		text_password().click();
		browser_htmlBrowser(document_iscControlSystem(),DEFAULT_FLAGS).inputChars("employee");
		button_logInsubmit().click();
		// Document: ISC Control System: http://localhost:8080/International_Science_Consortium/messagePage?messageCode=You%20are%20now%20logged%20in.%20Welcome.
		table_htmlTable_0().performTest(HtmlTable_0_gridVP());
		link_logout().performTest(Logout_textVP());
		((GuiTestObject)link_logout().find()).click();
		browser_htmlBrowser(document_iscControlSystem2(),DEFAULT_FLAGS).close();
	}
}

