// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources;

import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.vp.IFtVerificationPoint;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Script Name   : <b>STC09_PanelistAttemptsToRegisterTwice</b><br>
 * Generated     : <b>2015/11/18 7:37:26 PM</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 8.1 x86 6.3 <br>
 * 
 * @since  November 18, 2015
 * @author John
 */
public abstract class STC09_PanelistAttemptsToRegisterTwiceHelper extends RationalTestScript
{
	/**
	 * htmlBrowser: with default state.
	 *		.class : Html.HtmlBrowser
	 * 		.browserName : MS Internet Explorer
	 * 		.processName : iexplore.exe
	 */
	protected BrowserTestObject browser_htmlBrowser() 
	{
		return new BrowserTestObject(
                        getMappedTestObject("browser_htmlBrowser"));
	}
	/**
	 * htmlBrowser: with specific test context and state.
	 *		.class : Html.HtmlBrowser
	 * 		.browserName : MS Internet Explorer
	 * 		.processName : iexplore.exe
	 */
	protected BrowserTestObject browser_htmlBrowser(TestObject anchor, long flags) 
	{
		return new BrowserTestObject(
                        getMappedTestObject("browser_htmlBrowser"), anchor, flags);
	}
	
	/**
	 * Registersubmit: with default state.
	 *		.id : register
	 * 		.type : submit
	 * 		.value : Register
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : register
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_registersubmit() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_registersubmit"));
	}
	/**
	 * Registersubmit: with specific test context and state.
	 *		.id : register
	 * 		.type : submit
	 * 		.value : Register
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : register
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_registersubmit(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_registersubmit"), anchor, flags);
	}
	
	/**
	 * ISCControlSystem: with default state.
	 *		.title : ISC Control System
	 * 		.class : Html.HtmlDocument
	 * 		.url : http://localhost:8080/International_Science_Consortium/registration
	 */
	protected DocumentTestObject document_iscControlSystem() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_iscControlSystem"));
	}
	/**
	 * ISCControlSystem: with specific test context and state.
	 *		.title : ISC Control System
	 * 		.class : Html.HtmlDocument
	 * 		.url : http://localhost:8080/International_Science_Consortium/registration
	 */
	protected DocumentTestObject document_iscControlSystem(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_iscControlSystem"), anchor, flags);
	}
	
	/**
	 * here: with default state.
	 *		.text : here
	 * 		.id : 
	 * 		.href : http://localhost:8080/International_Science_Consortium/registration
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 1
	 */
	protected GuiTestObject link_here() 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_here"));
	}
	/**
	 * here: with specific test context and state.
	 *		.text : here
	 * 		.id : 
	 * 		.href : http://localhost:8080/International_Science_Consortium/registration
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 1
	 */
	protected GuiTestObject link_here(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_here"), anchor, flags);
	}
	
	/**
	 * pExpertise: with default state.
	 *		.text : Civil Engineering Computer Engineering Computer Science Electrical Engineering P ...
	 * 		.id : 
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : pExpertise
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_pExpertise() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_pExpertise"));
	}
	/**
	 * pExpertise: with specific test context and state.
	 *		.text : Civil Engineering Computer Engineering Computer Science Electrical Engineering P ...
	 * 		.id : 
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : pExpertise
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_pExpertise(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_pExpertise"), anchor, flags);
	}
	
	/**
	 * pGender: with default state.
	 *		.text : Male Female
	 * 		.id : pGender
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : pGender
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_pGender() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_pGender"));
	}
	/**
	 * pGender: with specific test context and state.
	 *		.text : Male Female
	 * 		.id : pGender
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : pGender
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_pGender(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_pGender"), anchor, flags);
	}
	
	/**
	 * HtmlTable_1: with default state.
	 *		.id : 
	 * 		.class : Html.TABLE
	 * 		.title : 
	 * 		.caption : 
	 * 		.classIndex : 1
	 */
	protected StatelessGuiSubitemTestObject table_htmlTable_1() 
	{
		return new StatelessGuiSubitemTestObject(
                        getMappedTestObject("table_htmlTable_1"));
	}
	/**
	 * HtmlTable_1: with specific test context and state.
	 *		.id : 
	 * 		.class : Html.TABLE
	 * 		.title : 
	 * 		.caption : 
	 * 		.classIndex : 1
	 */
	protected StatelessGuiSubitemTestObject table_htmlTable_1(TestObject anchor, long flags) 
	{
		return new StatelessGuiSubitemTestObject(
                        getMappedTestObject("table_htmlTable_1"), anchor, flags);
	}
	
	/**
	 * HtmlTable_2: with default state.
	 *		.id : 
	 * 		.title : 
	 * 		.class : Html.TABLE
	 * 		.caption : 
	 * 		.classIndex : 2
	 */
	protected StatelessGuiSubitemTestObject table_htmlTable_2() 
	{
		return new StatelessGuiSubitemTestObject(
                        getMappedTestObject("table_htmlTable_2"));
	}
	/**
	 * HtmlTable_2: with specific test context and state.
	 *		.id : 
	 * 		.title : 
	 * 		.class : Html.TABLE
	 * 		.caption : 
	 * 		.classIndex : 2
	 */
	protected StatelessGuiSubitemTestObject table_htmlTable_2(TestObject anchor, long flags) 
	{
		return new StatelessGuiSubitemTestObject(
                        getMappedTestObject("table_htmlTable_2"), anchor, flags);
	}
	
	/**
	 * pAddress: with default state.
	 *		.id : pAddress
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : pAddress
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_pAddress() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_pAddress"));
	}
	/**
	 * pAddress: with specific test context and state.
	 *		.id : pAddress
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : pAddress
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_pAddress(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_pAddress"), anchor, flags);
	}
	
	/**
	 * pCity: with default state.
	 *		.id : pCity
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : pCity
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_pCity() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_pCity"));
	}
	/**
	 * pCity: with specific test context and state.
	 *		.id : pCity
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : pCity
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_pCity(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_pCity"), anchor, flags);
	}
	
	/**
	 * pEmail: with default state.
	 *		.id : pEmail
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : pEmail
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_pEmail() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_pEmail"));
	}
	/**
	 * pEmail: with specific test context and state.
	 *		.id : pEmail
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : pEmail
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_pEmail(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_pEmail"), anchor, flags);
	}
	
	/**
	 * pEthnicity: with default state.
	 *		.id : pEthnicity
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : pEthnicity
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_pEthnicity() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_pEthnicity"));
	}
	/**
	 * pEthnicity: with specific test context and state.
	 *		.id : pEthnicity
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : pEthnicity
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_pEthnicity(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_pEthnicity"), anchor, flags);
	}
	
	/**
	 * pFName: with default state.
	 *		.id : pFName
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : pFName
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_pFName() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_pFName"));
	}
	/**
	 * pFName: with specific test context and state.
	 *		.id : pFName
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : pFName
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_pFName(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_pFName"), anchor, flags);
	}
	
	/**
	 * pISCID: with default state.
	 *		.id : pISCID
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : pISCID
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_pISCID() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_pISCID"));
	}
	/**
	 * pISCID: with specific test context and state.
	 *		.id : pISCID
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : pISCID
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_pISCID(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_pISCID"), anchor, flags);
	}
	
	/**
	 * pInstitution: with default state.
	 *		.id : pInstitution
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : pInstitution
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_pInstitution() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_pInstitution"));
	}
	/**
	 * pInstitution: with specific test context and state.
	 *		.id : pInstitution
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : pInstitution
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_pInstitution(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_pInstitution"), anchor, flags);
	}
	
	/**
	 * pLName: with default state.
	 *		.id : pLName
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : pLName
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_pLName() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_pLName"));
	}
	/**
	 * pLName: with specific test context and state.
	 *		.id : pLName
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : pLName
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_pLName(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_pLName"), anchor, flags);
	}
	
	/**
	 * pState: with default state.
	 *		.id : pState
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : pState
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_pState() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_pState"));
	}
	/**
	 * pState: with specific test context and state.
	 *		.id : pState
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : pState
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_pState(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_pState"), anchor, flags);
	}
	
	/**
	 * pTelephone: with default state.
	 *		.id : pTelephone
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : pTelephone
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_pTelephone() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_pTelephone"));
	}
	/**
	 * pTelephone: with specific test context and state.
	 *		.id : pTelephone
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : pTelephone
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_pTelephone(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_pTelephone"), anchor, flags);
	}
	
	/**
	 * pZip: with default state.
	 *		.id : pZip
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : pZip
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_pZip() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_pZip"));
	}
	/**
	 * pZip: with specific test context and state.
	 *		.id : pZip
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : pZip
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_pZip(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_pZip"), anchor, flags);
	}
	
	/**
	 * password: with default state.
	 *		.id : password
	 * 		.type : password
	 * 		.title : 
	 * 		.class : Html.INPUT.password
	 * 		.name : password
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_password() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_password"));
	}
	/**
	 * password: with specific test context and state.
	 *		.id : password
	 * 		.type : password
	 * 		.title : 
	 * 		.class : Html.INPUT.password
	 * 		.name : password
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_password(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_password"), anchor, flags);
	}
	
	/**
	 * username: with default state.
	 *		.id : password
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : username
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_username() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_username"));
	}
	/**
	 * username: with specific test context and state.
	 *		.id : password
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : username
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_username(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_username"), anchor, flags);
	}
	
	/**
	 * Locate and return the verification point RainyRegisterTwiceBrowser object in the SUT.
	 */
	protected IFtVerificationPoint RainyRegisterTwiceBrowserVP() 
	{
		return vp("RainyRegisterTwiceBrowser");
	}
	protected IFtVerificationPoint RainyRegisterTwiceBrowserVP(TestObject anchor)
	{
		return vp("RainyRegisterTwiceBrowser", anchor);
	}
	
	/**
	 * Locate and return the verification point RainyRegisterTwiceHtmlTable object in the SUT.
	 */
	protected IFtVerificationPoint RainyRegisterTwiceHtmlTableVP() 
	{
		return vp("RainyRegisterTwiceHtmlTable");
	}
	protected IFtVerificationPoint RainyRegisterTwiceHtmlTableVP(TestObject anchor)
	{
		return vp("RainyRegisterTwiceHtmlTable", anchor);
	}
	
	/**
	 * Locate and return the verification point SunnyRegisterTwiceBrowser object in the SUT.
	 */
	protected IFtVerificationPoint SunnyRegisterTwiceBrowserVP() 
	{
		return vp("SunnyRegisterTwiceBrowser");
	}
	protected IFtVerificationPoint SunnyRegisterTwiceBrowserVP(TestObject anchor)
	{
		return vp("SunnyRegisterTwiceBrowser", anchor);
	}
	
	/**
	 * Locate and return the verification point SunnyRegisterTwiceHtmlTablegrid object in the SUT.
	 */
	protected IFtVerificationPoint SunnyRegisterTwiceHtmlTablegridVP() 
	{
		return vp("SunnyRegisterTwiceHtmlTablegrid");
	}
	protected IFtVerificationPoint SunnyRegisterTwiceHtmlTablegridVP(TestObject anchor)
	{
		return vp("SunnyRegisterTwiceHtmlTablegrid", anchor);
	}
	
	

	protected STC09_PanelistAttemptsToRegisterTwiceHelper()
	{
		setScriptName("STC09_PanelistAttemptsToRegisterTwice");
	}
	
}

