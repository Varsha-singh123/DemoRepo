import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
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

WebUI.navigateToUrl(GlobalVariable.QA_URL)

WebUI.setText(findTestObject('Page_Login - CAS  Central Authentication Service/input_Username_username'), GlobalVariable.Super_User)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - CAS  Central Authentication Service/input_Password_password'), 
    GlobalVariable.PASSWORD)

WebUI.click(findTestObject('Object Repository/Page_Login - CAS  Central Authentication Service/input_Password_submit'))

WebUI.click(findTestObject('Object Repository/Page_Inventory/a_Home'))

WebUI.click(findTestObject('Object Repository/Page_Home/button_Columns'))

WebUI.click(findTestObject('Page_Home/a_Deselect All'))

WebUI.click(findTestObject('Object Repository/Page_Home/button_Ok'))

WebUI.click(findTestObject('Object Repository/Page_Home/button_Columns'))

WebUI.click(findTestObject('Object Repository/Page_Home/button_Restore Defaults'))

WebUI.closeBrowser()

