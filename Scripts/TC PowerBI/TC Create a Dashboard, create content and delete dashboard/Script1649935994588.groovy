import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.awt.Robot as Robot
import java.awt.datatransfer.StringSelection as StringSelection
import java.awt.event.KeyEvent as KeyEvent
import java.util.concurrent.Delayed as Delayed
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://app.powerbi.com/')

WebUI.waitForElementVisible(findTestObject('OR PowerBI/label_Enter your email, well check if you need to create a new account'), 
    10)

WebUI.setText(findTestObject('Object Repository/OR PowerBI/input_Email_email'), 'enter your username')

WebUI.enhancedClick(findTestObject('Object Repository/OR PowerBI/button_Submit'))

WebUI.setText(findTestObject('Object Repository/OR PowerBI/input_Enter password_passwd'), 'enter your password')

WebUI.click(findTestObject('Object Repository/OR PowerBI/input_Forgotten my password_idSIButton9'))

WebUI.click(findTestObject('Object Repository/OR PowerBI/input_Do this to reduce the number of times_edee07'))

WebUI.click(findTestObject('Object Repository/OR PowerBI/input_Forgotten my password_idSIButton9'))

WebUI.click(findTestObject('Object Repository/OR PowerBI/mat-icon_Learn_mat-icon notranslate typeIco_c5185a'))

WebUI.click(findTestObject('Object Repository/OR PowerBI/button_Create a workspace'))

WebUI.setText(findTestObject('Object Repository/OR PowerBI/input_Workspace name_groupName'), 'Katalon Workspace23')

WebUI.setText(findTestObject('Object Repository/OR PowerBI/textarea_Description_description'), 'This is Katalon Test Workspace')

WebUI.click(findTestObject('Object Repository/OR PowerBI/button_Save'))

WebUI.click(findTestObject('Object Repository/OR PowerBI/span_New'))

WebUI.click(findTestObject('Object Repository/OR PowerBI/span_Upload a file'))

WebUI.click(findTestObject('Object Repository/OR PowerBI/span_Local File'))

WebUI.delay(2)

not_run: WebUI.click(findTestObject('Object Repository/OR PowerBI/span_Upload'))

WebUI.callTestCase(findTestCase('TC PowerBI/File Uplaod by Robot Class'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR PowerBI/button_Upload'))

WebUI.delay(4)

WebUI.refresh()

WebUI.delay(4)

WebUI.verifyElementText(findTestObject('Object Repository/OR PowerBI/a_DataDrivenFile'), 'TestData')

WebUI.mouseOver(findTestObject('Object Repository/OR PowerBI/a_DataDrivenFile'))

WebUI.click(findTestObject('Object Repository/OR PowerBI/mat-icon_DataDrivenFile_mat-icon notranslat_a216a3'))

WebUI.click(findTestObject('Object Repository/OR PowerBI/span_Delete'))

WebUI.click(findTestObject('Object Repository/OR PowerBI/button_Remove'))

WebUI.click(findTestObject('Object Repository/OR PowerBI/span_Settings'))

WebUI.click(findTestObject('Object Repository/OR PowerBI/button_Delete workspace'))

WebUI.click(findTestObject('Object Repository/OR PowerBI/input_concat(You, , re about to delete this_ae28ac'))

WebUI.click(findTestObject('Object Repository/OR PowerBI/i_My workspace_glyphicon glyph-small pbi-gl_6cd8e7'))

WebUI.click(findTestObject('Object Repository/OR PowerBI/a_Sign out'))

WebUI.closeBrowser()

