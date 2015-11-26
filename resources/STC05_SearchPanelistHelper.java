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
 * Script Name   : <b>STC05_SearchPanelist</b><br>
 * Generated     : <b>2015/11/25 10:00:25 PM</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 8.1 x86 6.3 <br>
 * 
 * @since  November 25, 2015
 * @author John
 */
public abstract class STC05_SearchPanelistHelper extends RationalTestScript
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
	 * LogInsubmit: with default state.
	 *		.id : 
	 * 		.type : submit
	 * 		.value : Log In
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : loginButton
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_logInsubmit() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_logInsubmit"));
	}
	/**
	 * LogInsubmit: with specific test context and state.
	 *		.id : 
	 * 		.type : submit
	 * 		.value : Log In
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : loginButton
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_logInsubmit(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_logInsubmit"), anchor, flags);
	}
	
	/**
	 * Searchsubmit: with default state.
	 *		.id : search
	 * 		.type : submit
	 * 		.value : Search
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : search
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_searchsubmit() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_searchsubmit"));
	}
	/**
	 * Searchsubmit: with specific test context and state.
	 *		.id : search
	 * 		.type : submit
	 * 		.value : Search
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : search
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_searchsubmit(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_searchsubmit"), anchor, flags);
	}
	
	/**
	 * ISCControlSystem: with default state.
	 *		.title : ISC Control System
	 * 		.class : Html.HtmlDocument
	 * 		.url : http://localhost:8080/International_Science_Consortium/
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
	 * 		.url : http://localhost:8080/International_Science_Consortium/
	 */
	protected DocumentTestObject document_iscControlSystem(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_iscControlSystem"), anchor, flags);
	}
	
	/**
	 * ISCControlSystem: with default state.
	 *		.title : ISC Control System
	 * 		.class : Html.HtmlDocument
	 * 		.url : http://localhost:8080/International_Science_Consortium/searchPanelists.jsp
	 */
	protected DocumentTestObject document_iscControlSystem2() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_iscControlSystem2"));
	}
	/**
	 * ISCControlSystem: with specific test context and state.
	 *		.title : ISC Control System
	 * 		.class : Html.HtmlDocument
	 * 		.url : http://localhost:8080/International_Science_Consortium/searchPanelists.jsp
	 */
	protected DocumentTestObject document_iscControlSystem2(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_iscControlSystem2"), anchor, flags);
	}
	
	/**
	 * ISCControlSystem: with default state.
	 *		.title : ISC Control System
	 * 		.class : Html.HtmlDocument
	 * 		.url : http://localhost:8080/International_Science_Consortium/index.jsp
	 */
	protected DocumentTestObject document_iscControlSystem3() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_iscControlSystem3"));
	}
	/**
	 * ISCControlSystem: with specific test context and state.
	 *		.title : ISC Control System
	 * 		.class : Html.HtmlDocument
	 * 		.url : http://localhost:8080/International_Science_Consortium/index.jsp
	 */
	protected DocumentTestObject document_iscControlSystem3(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_iscControlSystem3"), anchor, flags);
	}
	
	/**
	 * Logout: with default state.
	 *		.text : Logout
	 * 		.href : http://localhost:8080/International_Science_Consortium/logout
	 * 		.id : 
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 4
	 */
	protected GuiTestObject link_logout() 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_logout"));
	}
	/**
	 * Logout: with specific test context and state.
	 *		.text : Logout
	 * 		.href : http://localhost:8080/International_Science_Consortium/logout
	 * 		.id : 
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 4
	 */
	protected GuiTestObject link_logout(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_logout"), anchor, flags);
	}
	
	/**
	 * SearchForPanelists: with default state.
	 *		.text : Search for Panelists
	 * 		.href : http://localhost:8080/International_Science_Consortium/searchPanelists.jsp
	 * 		.id : 
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 1
	 */
	protected GuiTestObject link_searchForPanelists() 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_searchForPanelists"));
	}
	/**
	 * SearchForPanelists: with specific test context and state.
	 *		.text : Search for Panelists
	 * 		.href : http://localhost:8080/International_Science_Consortium/searchPanelists.jsp
	 * 		.id : 
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 1
	 */
	protected GuiTestObject link_searchForPanelists(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_searchForPanelists"), anchor, flags);
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
	 * pExpertise: with default state.
	 *		.id : pExpertise
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : pExpertise
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_pExpertise() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_pExpertise"));
	}
	/**
	 * pExpertise: with specific test context and state.
	 *		.id : pExpertise
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : pExpertise
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_pExpertise(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_pExpertise"), anchor, flags);
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
	 *		.id : 
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
	 *		.id : 
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
	 *		.id : 
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
	 *		.id : 
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
	 * Locate and return the verification point FailedSearch object in the SUT.
	 */
	protected IFtVerificationPoint FailedSearchVP() 
	{
		return vp("FailedSearch");
	}
	protected IFtVerificationPoint FailedSearchVP(TestObject anchor)
	{
		return vp("FailedSearch", anchor);
	}
	
	/**
	 * Locate and return the verification point SuccessfulSearch object in the SUT.
	 */
	protected IFtVerificationPoint SuccessfulSearchVP() 
	{
		return vp("SuccessfulSearch");
	}
	protected IFtVerificationPoint SuccessfulSearchVP(TestObject anchor)
	{
		return vp("SuccessfulSearch", anchor);
	}
	
	

	protected STC05_SearchPanelistHelper()
	{
		setScriptName("STC05_SearchPanelist");
	}
	
}

