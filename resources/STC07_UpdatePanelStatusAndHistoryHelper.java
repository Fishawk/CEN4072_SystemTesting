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
 * Script Name   : <b>STC07_UpdatePanelStatusAndHistory</b><br>
 * Generated     : <b>2015/11/22 2:47:20 PM</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 8.1 x86 6.3 <br>
 * 
 * @since  November 22, 2015
 * @author John
 */
public abstract class STC07_UpdatePanelStatusAndHistoryHelper extends RationalTestScript
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
	 * UpdatePanelStatussubmit: with default state.
	 *		.id : 
	 * 		.type : submit
	 * 		.value : Update Panel Status
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_updatePanelStatussubmit() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_updatePanelStatussubmit"));
	}
	/**
	 * UpdatePanelStatussubmit: with specific test context and state.
	 *		.id : 
	 * 		.type : submit
	 * 		.value : Update Panel Status
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_updatePanelStatussubmit(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_updatePanelStatussubmit"), anchor, flags);
	}
	
	/**
	 * Updatesubmit: with default state.
	 *		.id : 
	 * 		.type : submit
	 * 		.value : Update
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_updatesubmit() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_updatesubmit"));
	}
	/**
	 * Updatesubmit: with specific test context and state.
	 *		.id : 
	 * 		.type : submit
	 * 		.value : Update
	 * 		.title : 
	 * 		.class : Html.INPUT.submit
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject button_updatesubmit(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_updatesubmit"), anchor, flags);
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
	 * 		.url : http://localhost:8080/International_Science_Consortium/updateStatus.jsp
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
	 * 		.url : http://localhost:8080/International_Science_Consortium/updateStatus.jsp
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
	 * DisplayMyPanels: with default state.
	 *		.text : Display My Panels
	 * 		.href : http://localhost:8080/International_Science_Consortium/displayPanels.jsp
	 * 		.id : 
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 3
	 */
	protected GuiTestObject link_displayMyPanels() 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_displayMyPanels"));
	}
	/**
	 * DisplayMyPanels: with specific test context and state.
	 *		.text : Display My Panels
	 * 		.href : http://localhost:8080/International_Science_Consortium/displayPanels.jsp
	 * 		.id : 
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 3
	 */
	protected GuiTestObject link_displayMyPanels(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_displayMyPanels"), anchor, flags);
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
	 * ViewPanel: with default state.
	 *		.text : View Panel
	 * 		.href : http://localhost:8080/International_Science_Consortium/displayPanel.jsp?panelID= ...
	 * 		.id : 
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link_viewPanel() 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_viewPanel"));
	}
	/**
	 * ViewPanel: with specific test context and state.
	 *		.text : View Panel
	 * 		.href : http://localhost:8080/International_Science_Consortium/displayPanel.jsp?panelID= ...
	 * 		.id : 
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject link_viewPanel(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_viewPanel"), anchor, flags);
	}
	
	/**
	 * ViewPanel: with default state.
	 *		.text : View Panel
	 * 		.id : 
	 * 		.href : http://localhost:8080/International_Science_Consortium/displayPanel.jsp?panelID= ...
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 1
	 */
	protected GuiTestObject link_viewPanel2() 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_viewPanel2"));
	}
	/**
	 * ViewPanel: with specific test context and state.
	 *		.text : View Panel
	 * 		.id : 
	 * 		.href : http://localhost:8080/International_Science_Consortium/displayPanel.jsp?panelID= ...
	 * 		.title : 
	 * 		.class : Html.A
	 * 		.name : 
	 * 		.classIndex : 1
	 */
	protected GuiTestObject link_viewPanel2(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("link_viewPanel2"), anchor, flags);
	}
	
	/**
	 * panelStatus: with default state.
	 *		.text : In Progress Complete Cancelled
	 * 		.id : 
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : panelStatus
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_panelStatus() 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_panelStatus"));
	}
	/**
	 * panelStatus: with specific test context and state.
	 *		.text : In Progress Complete Cancelled
	 * 		.id : 
	 * 		.title : 
	 * 		.class : Html.SELECT
	 * 		.name : panelStatus
	 * 		.classIndex : 0
	 */
	protected SelectGuiSubitemTestObject list_panelStatus(TestObject anchor, long flags) 
	{
		return new SelectGuiSubitemTestObject(
                        getMappedTestObject("list_panelStatus"), anchor, flags);
	}
	
	/**
	 * HtmlTable_0: with default state.
	 *		.id : 
	 * 		.title : 
	 * 		.class : Html.TABLE
	 * 		.caption : 
	 * 		.classIndex : 0
	 */
	protected StatelessGuiSubitemTestObject table_htmlTable_0() 
	{
		return new StatelessGuiSubitemTestObject(
                        getMappedTestObject("table_htmlTable_0"));
	}
	/**
	 * HtmlTable_0: with specific test context and state.
	 *		.id : 
	 * 		.title : 
	 * 		.class : Html.TABLE
	 * 		.caption : 
	 * 		.classIndex : 0
	 */
	protected StatelessGuiSubitemTestObject table_htmlTable_0(TestObject anchor, long flags) 
	{
		return new StatelessGuiSubitemTestObject(
                        getMappedTestObject("table_htmlTable_0"), anchor, flags);
	}
	
	/**
	 * HtmlTable_0: with default state.
	 *		.id : 
	 * 		.title : 
	 * 		.class : Html.TABLE
	 * 		.caption : 
	 * 		.classIndex : 0
	 */
	protected StatelessGuiSubitemTestObject table_htmlTable_0_2() 
	{
		return new StatelessGuiSubitemTestObject(
                        getMappedTestObject("table_htmlTable_0_2"));
	}
	/**
	 * HtmlTable_0: with specific test context and state.
	 *		.id : 
	 * 		.title : 
	 * 		.class : Html.TABLE
	 * 		.caption : 
	 * 		.classIndex : 0
	 */
	protected StatelessGuiSubitemTestObject table_htmlTable_0_2(TestObject anchor, long flags) 
	{
		return new StatelessGuiSubitemTestObject(
                        getMappedTestObject("table_htmlTable_0_2"), anchor, flags);
	}
	
	/**
	 * HtmlTable_1: with default state.
	 *		.id : 
	 * 		.title : 
	 * 		.class : Html.TABLE
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
	 * 		.title : 
	 * 		.class : Html.TABLE
	 * 		.caption : 
	 * 		.classIndex : 1
	 */
	protected StatelessGuiSubitemTestObject table_htmlTable_1(TestObject anchor, long flags) 
	{
		return new StatelessGuiSubitemTestObject(
                        getMappedTestObject("table_htmlTable_1"), anchor, flags);
	}
	
	/**
	 * HtmlTable_1: with default state.
	 *		.id : 
	 * 		.title : 
	 * 		.class : Html.TABLE
	 * 		.caption : 
	 * 		.classIndex : 1
	 */
	protected StatelessGuiSubitemTestObject table_htmlTable_1_2() 
	{
		return new StatelessGuiSubitemTestObject(
                        getMappedTestObject("table_htmlTable_1_2"));
	}
	/**
	 * HtmlTable_1: with specific test context and state.
	 *		.id : 
	 * 		.title : 
	 * 		.class : Html.TABLE
	 * 		.caption : 
	 * 		.classIndex : 1
	 */
	protected StatelessGuiSubitemTestObject table_htmlTable_1_2(TestObject anchor, long flags) 
	{
		return new StatelessGuiSubitemTestObject(
                        getMappedTestObject("table_htmlTable_1_2"), anchor, flags);
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
	 * statusComments: with default state.
	 *		.id : 
	 * 		.title : 
	 * 		.class : Html.TEXTAREA
	 * 		.name : statusComments
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_statusComments() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_statusComments"));
	}
	/**
	 * statusComments: with specific test context and state.
	 *		.id : 
	 * 		.title : 
	 * 		.class : Html.TEXTAREA
	 * 		.name : statusComments
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_statusComments(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_statusComments"), anchor, flags);
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
	 * Locate and return the verification point Rainy1Browser object in the SUT.
	 */
	protected IFtVerificationPoint Rainy1BrowserVP() 
	{
		return vp("Rainy1Browser");
	}
	protected IFtVerificationPoint Rainy1BrowserVP(TestObject anchor)
	{
		return vp("Rainy1Browser", anchor);
	}
	
	/**
	 * Locate and return the verification point Rainy1HtmlTable object in the SUT.
	 */
	protected IFtVerificationPoint Rainy1HtmlTableVP() 
	{
		return vp("Rainy1HtmlTable");
	}
	protected IFtVerificationPoint Rainy1HtmlTableVP(TestObject anchor)
	{
		return vp("Rainy1HtmlTable", anchor);
	}
	
	/**
	 * Locate and return the verification point Rainy2Browser object in the SUT.
	 */
	protected IFtVerificationPoint Rainy2BrowserVP() 
	{
		return vp("Rainy2Browser");
	}
	protected IFtVerificationPoint Rainy2BrowserVP(TestObject anchor)
	{
		return vp("Rainy2Browser", anchor);
	}
	
	/**
	 * Locate and return the verification point Rainy2HtmlTable object in the SUT.
	 */
	protected IFtVerificationPoint Rainy2HtmlTableVP() 
	{
		return vp("Rainy2HtmlTable");
	}
	protected IFtVerificationPoint Rainy2HtmlTableVP(TestObject anchor)
	{
		return vp("Rainy2HtmlTable", anchor);
	}
	
	/**
	 * Locate and return the verification point Rainy3Browser1 object in the SUT.
	 */
	protected IFtVerificationPoint Rainy3Browser1VP() 
	{
		return vp("Rainy3Browser1");
	}
	protected IFtVerificationPoint Rainy3Browser1VP(TestObject anchor)
	{
		return vp("Rainy3Browser1", anchor);
	}
	
	/**
	 * Locate and return the verification point Rainy3Table1 object in the SUT.
	 */
	protected IFtVerificationPoint Rainy3Table1VP() 
	{
		return vp("Rainy3Table1");
	}
	protected IFtVerificationPoint Rainy3Table1VP(TestObject anchor)
	{
		return vp("Rainy3Table1", anchor);
	}
	
	/**
	 * Locate and return the verification point SunnyBrowser object in the SUT.
	 */
	protected IFtVerificationPoint SunnyBrowserVP() 
	{
		return vp("SunnyBrowser");
	}
	protected IFtVerificationPoint SunnyBrowserVP(TestObject anchor)
	{
		return vp("SunnyBrowser", anchor);
	}
	
	/**
	 * Locate and return the verification point SunnyHtmlTable object in the SUT.
	 */
	protected IFtVerificationPoint SunnyHtmlTableVP() 
	{
		return vp("SunnyHtmlTable");
	}
	protected IFtVerificationPoint SunnyHtmlTableVP(TestObject anchor)
	{
		return vp("SunnyHtmlTable", anchor);
	}
	
	

	protected STC07_UpdatePanelStatusAndHistoryHelper()
	{
		setScriptName("STC07_UpdatePanelStatusAndHistory");
	}
	
}

