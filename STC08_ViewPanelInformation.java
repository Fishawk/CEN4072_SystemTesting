
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
		//reset database
		SetDB.resetDB(false);
		
		// WHo is Who
		final boolean SUNNY1 = dpString("TestType").equalsIgnoreCase("Sunny1");
		final boolean SUNNY2 = dpString("TestType").equalsIgnoreCase("Sunny2");
		final boolean SUNNY3 = dpString("TestType").equalsIgnoreCase("Sunny3");
		final boolean RAINY1 = dpString("TestType").equalsIgnoreCase("Rainy1");
		final boolean RAINY2 = dpString("TestType").equalsIgnoreCase("Rainy2");
		final boolean RAINY3 = dpString("TestType").equalsIgnoreCase("Rainy3");
		int index = 1;
		
		// set up the database
		if(SUNNY3){
			while(dpString("Panelist " + index).equalsIgnoreCase("True")){
				SetDB.registerPanelist((3 + index),				// user ID start at four and count up for each new panelist
						dpString("Fname " + index),				// first name
						dpString("Lname " + index),				// last name
						dpString("username " + index),			// username
						dpString("password " + index),			// password
						dpString("Institution " + index),		// Institution
						dpString("Address " + index),			// Address
						dpString("city " + index),				// City
						dpString("State " + index),				// State
						dpString("zip " + index),				// ZipCode
						dpString("Telephone " + index),			// Telephone
						dpString("Email " + index),				// Email
						dpString("Gender " + index),			// Gender
						dpString("Ethnicity " + index),			// Ethnicity
						dpString("Area of expertise " + index),	// Expertise
						dpInt("ISC ID " + index++)); 				// ISC ID 
			}
	
			// Create panels to add panelist to
			index = 1;
			while(dpString("Panel " + index).equalsIgnoreCase("True")){
				SetDB.createPanel((2 +index), 
						dpString("PanelName " +index) , 
						dpString("PanelDescription " + index++));
			}
			
			// add panelist to panel
			index = 1;
			while(dpString("AddPanelist " + index).equalsIgnoreCase("True")){
				SetDB.addPanelistToPanel((999 + index),(2 + index++));
			}
		}
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
		
		
		if(SUNNY1){
			// click display my panels link
			((GuiTestObject)link_displayMyPanels().find()).click();
			
		}else if(SUNNY2){
			// click display my panels link
			((GuiTestObject)link_displayMyPanels().find()).click();
		} else if(SUNNY3){
			// click display my panels link
			((GuiTestObject)link_displayMyPanels().find()).click();
			
			
			((GuiTestObject)link_displayMyPanels().find()).click();
			
		}else if (RAINY1){ // admin logged in
			
		}else if (RAINY2){ // panelist logged in
			
		}else if (RAINY3){ // early logout
			
		}
		
		
		// Logout
		((GuiTestObject)link_logout().find()).click();
		
		
		//reset database
		SetDB.resetDB(false);
		
	}
}

