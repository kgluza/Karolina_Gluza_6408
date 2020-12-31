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

WebUI.setText(findTestObject('Object Repository/Page_Create New Customer Account/input__firstname'), UserFirstName)

WebUI.setText(findTestObject('Object Repository/Page_Create New Customer Account/input_Middle NameInitial_middlename'),	UserMiddleName)

WebUI.setText(findTestObject('Object Repository/Page_Create New Customer Account/input__lastname'), UserLastName)

WebUI.setText(findTestObject('Object Repository/Page_Create New Customer Account/input__email'), UserEmail)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Create New Customer Account/input__password'), '38OQRyRuGQxTdreBfDJ+qw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Create New Customer Account/input__confirmation'), '38OQRyRuGQxTdreBfDJ+qw==')

WebUI.click(findTestObject('Object Repository/Page_Create New Customer Account/button_Register'))

WebUI.click(findTestObject('Object Repository/Page_Create New Customer Account/p_Please enter the following information to_1b9f78'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create New Customer Account/li_There is already an account with this em_61686e'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Create New Customer Account/span_There is already an account with this _4efef2'), 
    'There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.')

WebUI.closeBrowser()


