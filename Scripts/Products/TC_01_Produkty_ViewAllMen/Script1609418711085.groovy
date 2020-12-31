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

WebUI.navigateToUrl('http://demo-store.seleniumacademy.com/')

WebUI.mouseOver(findTestObject('Object Repository/Page_Men/a_Men'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Madison Island/a_Tees, Knits and Polos'))

WebUI.click(findTestObject('Object Repository/Page_Tees, Knits and Polos - Men/div_View as                                _54c30a'))

WebUI.click(findTestObject('Object Repository/Page_Tees, Knits and Polos - Men/div_6 Item(s)                              _b8fc0d'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Tees, Knits and Polos - Men/strong_6 Item(s)'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Tees, Knits and Polos - Men/strong_6 Item(s)'), '6 Item(s)')

WebUI.mouseOver(findTestObject('Object Repository/Page_Men/a_Men'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Tees, Knits and Polos - Men/a_View All Men'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Tees, Knits and Polos - Men/strong_6 Item(s)'), 1)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Tees, Knits and Polos - Men/strong_6 Item(s)'), '20 Item(s)')

WebUI.closeBrowser();

