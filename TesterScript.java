
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
/*
		int index = 1;
		while(dpString("Panelist " + index).equalsIgnoreCase("True")){
			SetDB.registerPanelist(
					dpInt("UserID " + index),				// user ID start at four and count up for each new panelist
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
			SetDB.createPanel(
					dpInt("PanelID " +index), 
					dpString("PanelName " +index) , 
					dpString("PanelDescription " + index++));
		}
*/
		SetDB.ResetDB();
	}
}

