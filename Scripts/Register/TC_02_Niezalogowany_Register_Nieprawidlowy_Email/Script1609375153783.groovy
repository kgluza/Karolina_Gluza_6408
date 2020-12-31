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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://demo-store.seleniumacademy.com/customer/account/create/')

WebUI.setText(findTestObject('Page_Create New Customer Account/input__firstname'), 'Karolina')

WebUI.setText(findTestObject('Page_Create New Customer Account/input__lastname'), 'Gluza')

for (def row = 1; row <= findTestData('Niepoprawne_Adresy_Email').getRowNumbers(); row++)
{
	WebUI.setText(findTestObject('Page_Create New Customer Account/input__email'), findTestData('Niepoprawne_Adresy_Email').getValue('email', row))
	
	WebUI.click(findTestObject('Page_Create New Customer Account/button_Register'))

	WebUI.verifyElementText(findTestObject('Object Repository/Page_Create New Customer Account/div_Please enter a valid email address. For_90e2b3'), 
		'Please enter a valid email address. For example johndoe@domain.com.')
}



WebUI.closeBrowser()