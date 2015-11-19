
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
 * @author Princ_000
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
		
		// WHo is Who
		final boolean SUNNY = dpString("TestType").equalsIgnoreCase("Sunny");
		final boolean RAINY1 = dpString("TestType").equalsIgnoreCase("Rainy1");
		final boolean RAINY2 = dpString("TestType").equalsIgnoreCase("Rainy2");
		final boolean RAINY3 = dpString("TestType").equalsIgnoreCase("Rainy3");

		// HTML Browser
		// Document: ISC Control System:
		startApp("http://localhost:8080/International_Science_Consortium/");
		
		// find and enter user name
		((TextGuiTestObject)text_username().find()).click();
		browser_htmlBrowser(document_iscControlSystem(),DEFAULT_FLAGS)
			.inputChars(dpString("username"));
		
		// Find and enter password
		((TextGuiTestObject)text_password().find()).click();
		browser_htmlBrowser(document_iscControlSystem(),DEFAULT_FLAGS)
			.inputChars(dpString("password"));
		
		// Click login button
		button_logInsubmit().click();
		
		
		if(SUNNY){
			// click display my panels link
			link_displayMyPanels().click();
			
		}else if (RAINY1){
			
		}else if (RAINY2){
			
		}else if (RAINY3){
			
		}

/*		
		//
		table_htmlTable_0().performTest(HtmlTable_0_gridVP());
		link_viewPanel().click();
		sleep(3);
		// Document: ISC Control System: http://localhost:8080/International_Science_Consortium/displayPanel.jsp?panelID=1
		table_htmlTable_0_2().performTest(HtmlTable_0_grid_2VP());
		button_back(browser_htmlBrowser(document_iscControlSystem2(),DEFAULT_FLAGS),DEFAULT_FLAGS).click();
		// Document: ISC Control System: http://localhost:8080/International_Science_Consortium/displayPanels.jsp
		link_viewPanel2().click();
		sleep(3);
		// Document: ISC Control System: http://localhost:8080/International_Science_Consortium/displayPanel.jsp?panelID=1
		table_htmlTable_0_2().performTest(HtmlTable_0_grid_3VP());
		button_back(browser_htmlBrowser(document_iscControlSystem2(),DEFAULT_FLAGS),DEFAULT_FLAGS).click();
		// Document: ISC Control System: http://localhost:8080/International_Science_Consortium/displayPanels.jsp
		link_viewPanel3().click();
		sleep(3);
		// Document: ISC Control System: http://localhost:8080/International_Science_Consortium/displayPanel.jsp?panelID=1
		table_htmlTable_0_2().performTest(HtmlTable_0_grid_4VP());
		link_displayMyPanels2().click();
		// Document: ISC Control System: http://localhost:8080/International_Science_Consortium/displayPanels.jsp
		((GuiTestObject)link_logout().find()).click();
		browser_htmlBrowser(document_iscControlSystem3(),DEFAULT_FLAGS).close();
*/
	}
}

