
import resources.STC10_15MinTimeOutHelper;
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
 * @author John
 */
public class STC10_15MinTimeOut extends STC10_15MinTimeOutHelper
{
	/**
	 * Script Name   : <b>STC10_15MinTimeOut</b>
	 * Generated     : <b>Nov 22, 2015 2:54:39 AM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.3  Build 9600 ()
	 * 
	 * @since  2015/11/22
	 * @author John
	 */
	public void testMain(Object[] args) 
	{
		//reset database
		SetDB.resetDB(false);
		
		// Who is Who
		final boolean SUNNY = dpString("TestType").equalsIgnoreCase("Sunny");
		final boolean RAINY1 = dpString("TestType").equalsIgnoreCase("Rainy1");
		final boolean RAINY2 = dpString("TestType").equalsIgnoreCase("Rainy2");
		final boolean RAINY3 = dpString("TestType").equalsIgnoreCase("Rainy3");
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
		
		
		// verification points
		if(SUNNY){
			// sleep for sixteen minutes
			sleep(960); 
			
			// verification point 
			browser_htmlBrowser().performTest(SunnyBrowserVP());
		} else if(RAINY1){
			
		} else if(RAINY2){
			
		} else if(RAINY3){
			
		}
	}
}

