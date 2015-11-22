
import resources.TesterScriptHelper;
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
public class TesterScript extends TesterScriptHelper
{
	/**
	 * Script Name   : <b>TesterScript</b>
	 * Generated     : <b>Nov 5, 2015 12:20:13 AM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.3  Build 9600 ()
	 * 
	 * @since  2015/11/05
	 * @author John
	 * @throws Exception 
	 */
	public void testMain(Object[] args) throws Exception 
	{
		
		// the index is to control the panelist, panels and panelist add to the panels
		// for testing
		int index = 1;
		
		// add panelist to add to the panels
		while(dpString("Panelist " + index).equalsIgnoreCase("True")){
			SetDB.registerPanelist((3 + index),				// user ID start at four and count up for each new panelist
					dpString("Fname " + index),				// first name
					dpString("Lname " + index),				// last name
					dpString("Username " + index),			// username
					dpString("Password " + index),			// password
					dpString("Institution " + index),		// Institution
					dpString("Address " + index),			// Address
					dpString("City " + index),				// City
					dpString("State " + index),				// State
					dpString("Zip " + index),				// ZipCode
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
			SetDB.addPanelistToPanel((999 + index),(2 + index));
			index++;
		}
		
//		SetDB.resetDB(false);
	}
}

