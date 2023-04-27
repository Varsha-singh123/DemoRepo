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

WebUI.navigateToUrl('https://test-apps.blumesolutions.com/cas/login?service=http%3A%2F%2F10.16.0.173%3A8080%2Fexternalx%2Flogin%2Fcas')

WebUI.setText(findTestObject('Object Repository/Page_Login - CAS  Central Authentication Service/input_Username_username'), 
    'Varsha.Singh@blumeglobal.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - CAS  Central Authentication Service/input_Password_password'), 
    'Mq0XerdhNgHzs1h+sOxJSat5cZpyNaer')

WebUI.click(findTestObject('Object Repository/Page_Login - CAS  Central Authentication Service/input_Password_submit'))

WebUI.click(findTestObject('Object Repository/Page_Home/a_Inventories'))

WebUI.click(findTestObject('Object Repository/Page_Inventory/i_Program_fa fa-filter'))

WebUI.click(findTestObject('Object Repository/Page_Inventory/a_Configuration'))

WebUI.click(findTestObject('Object Repository/Page_Inventory/a_Companies and                            Users'))

WebUI.click(findTestObject('Object Repository/Page_Companies And Users/a_Users'))

WebUI.click(findTestObject('Object Repository/Page_Companies And Users/i_Email_fa fa-filter'))

WebUI.setText(findTestObject('Object Repository/Page_Companies And Users/input_Clear All_thm-field'), 'maersk1@rez1.com')

WebUI.click(findTestObject('Object Repository/Page_Companies And Users/button_OK'))

WebUI.click(findTestObject('Object Repository/Page_Companies And Users/div_Maersk1REZ1.COM'))

WebUI.click(findTestObject('Object Repository/Page_Companies And Users/button_Impersonate'))

WebUI.click(findTestObject('Object Repository/Page_Inventory/div_Atlanta-XPO'))

WebUI.click(findTestObject('Page_Inventory/button_Upload Allotments'))

WebUI.click(findTestObject('Page_Inventory/a_Download template'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Page_Inventory/label_Browse'))

WebUI.click(findTestObject('Object Repository/Page_Inventory/label_Browse'))

WebUI.click(findTestObject('Object Repository/Page_Inventory/button_Upload'))

WebUI.click(findTestObject('Object Repository/Page_Inventory/button_OK'))

WebUI.closeBrowser()

