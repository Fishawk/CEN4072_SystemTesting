
import resources.STC07_UpdatePanelStatusAndHistoryHelper;
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
public class STC07_UpdatePanelStatusAndHistory extends STC07_UpdatePanelStatusAndHistoryHelper
{
	/**
	 * Script Name   : <b>STC07_UpdatePanelStatusAndHistory</b>
	 * Generated     : <b>Nov 18, 2015 9:23:41 AM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.3  Build 9600 ()
	 * 
	 * @since  2015/11/18
	 * @author John Burke
	 */
	public void testMain(Object[] args) 
	{
		// Who is Who
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
			.inputChars(dpString("Username"));
		
		// find and enter password
		((TextGuiTestObject)text_password().find()).click();
		browser_htmlBrowser(document_iscControlSystem(),DEFAULT_FLAGS)
			.inputChars(dpString("Password"));
		
		// click login button
		button_logInsubmit().click();
	
		if(SUNNY){
			// click display my panels link
			((GuiTestObject)link_displayMyPanels().find()).click();

			// click view panels link
			((GuiTestObject)link_viewPanel().find()).click();
			
			// click update panel status submit button
			((GuiTestObject)button_updatePanelStatussubmit().find()).click();
			
			// click panel status list and update with new status
			((GuiTestObject)list_panelStatus().find()).click();
			list_panelStatus().click(atText(dpString("Status")));
			
			// click and update comments for panel
			((TextGuiTestObject)text_statusComments().find()).click();
			browser_htmlBrowser(document_iscControlSystem2(), DEFAULT_FLAGS)
					.inputChars(dpString("Comment"));

			// click update submit to update status of panel
			((GuiTestObject)button_updatesubmit().find()).click();
			
			// Verification point #1
			browser_htmlBrowser().performTest(
					SunnyUpdatePanelStatusAndHistoryVP());
			
			// Verification point #2
			table_htmlTable_1().performTest(
					SunnyUpdatePanelStatusAndHistoryHtmlTableVP());

			// click logout button
			((GuiTestObject)link_logout().find()).click();
			
		}else if (RAINY1){
			// Verification point #1
			browser_htmlBrowser().performTest(Rainy1UpdatePanelStatusAndHistoryVP());

			// Verification point #2
			table_htmlTable_0().performTest(Rainy1UpdatePanelStatusAndHistoryHtmlTableVP());

			// click logout button
			((GuiTestObject)link_logout().find()).click();
			
		}else if (RAINY2){
			browser_htmlBrowser().performTest(Rainy2UpdatePanelStatusAndHistoryVP());
			table_htmlTable_0().performTest(Rainy2UpdatePanelStatusAndHistoryHtmlTableVP());

			// click logout button
			((GuiTestObject)link_logout().find()).click();
			
		}else if (RAINY3){
			
			// click display my panels link
			((GuiTestObject)link_displayMyPanels().find()).click();

			// click view panels link
			((GuiTestObject)link_viewPanel().find()).click();
			
			// HTML Browser
			table_htmlTable_1_2().performTest(Rainy3UpdatePanelStatusAndHistoryVP());
			
			// close browser
			browser_htmlBrowser(document_iscControlSystem3(),DEFAULT_FLAGS).close();

			// HTML Browser
			// Document: ISC Control System: 
			startApp("http://localhost:8080/International_Science_Consortium/");
			
			// find and enter user name
			((TextGuiTestObject)text_username().find()).click();
			browser_htmlBrowser(document_iscControlSystem(),DEFAULT_FLAGS)
				.inputChars(dpString("Username"));
			
			// find and enter password
			((TextGuiTestObject)text_password().find()).click();
			browser_htmlBrowser(document_iscControlSystem(),DEFAULT_FLAGS)
				.inputChars(dpString("Password"));
			
			// click login button
			button_logInsubmit().click();
			
			// click display my panels link
			((GuiTestObject)link_displayMyPanels().find()).click();

			// click view panels link
			((GuiTestObject)link_viewPanel().find()).click();
			
			// HTML Browser
			table_htmlTable_1_2().performTest(Rainy3UpdatePanelStatusAndHistoryVP());
			
			//verify information straight from database
			table_htmlTable_1_2().performTest(Rainy3UpdatePanelStatusAndHistoryVP());
			
		}
		
		// close browser
		browser_htmlBrowser(document_iscControlSystem3(),DEFAULT_FLAGS).close();
		
		// reset the database to a clean slate
		SetDB.resetDB();
	}
}

