
import resources.STC10_SessionTimesOutAfter15MinutesInactivitySunnyHelper;
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
public class STC10_SessionTimesOutAfter15MinutesInactivitySunny extends STC10_SessionTimesOutAfter15MinutesInactivitySunnyHelper
{
	/**
	 * Script Name   : <b>STC_SUNNY_SESSION_TIMES_OUT_AFTER_15_MINUTES_OF_INACTIVITY</b>
	 * Generated     : <b>Oct 16, 2015 4:03:19 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.3  Build 9600 ()
	 * 
	 * @since  2015/10/16
	 * @author Princ_000
	 */
	public void testMain(Object[] args) 
	{
		startApp("http://localhost:8080/International_Science_Consortium/");
		
		// HTML Browser
		// Document: ISC Control System: http://localhost:8080/International_Science_Consortium/
		text_username().click();
		browser_htmlBrowser(document_iscControlSystem(),DEFAULT_FLAGS).inputChars(dpString("username"));
		text_password().click();
		browser_htmlBrowser(document_iscControlSystem(),DEFAULT_FLAGS).inputChars(dpString("password"));
		button_logInsubmit().click();
		// Document: ISC Control System: http://localhost:8080/International_Science_Consortium/messagePage?messageCode=You%20are%20now%20logged%20in.%20Welcome.
		table_htmlTable_0().performTest(HtmlTable_0_gridVP());
		link_home().click();
		// Document: ISC Control System: http://localhost:8080/International_Science_Consortium/
		sleep(1000);
		table_htmlTable_0_2().performTest(HtmlTable_0_grid_2VP());
		table_htmlTable_2().performTest(HtmlTable_2_gridVP());
		browser_htmlBrowser(document_iscControlSystem(),DEFAULT_FLAGS).close();
	}
}

