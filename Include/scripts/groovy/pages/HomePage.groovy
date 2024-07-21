package pages;

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

public class HomePage {

	def openApp(){
		String projectDir = RunConfiguration.getProjectDir()
		String AppLocation = projectDir + GlobalVariable.AppLocation
		Mobile.startApplication(AppLocation, true)
	}

	def verifyHomePageLoaded(){
		Mobile.verifyElementExist(findTestObject('Object Repository/TaskRepo/dropDownList'), 0)
	}

	def chooseCountry(String Country) {
		Mobile.tap(findTestObject('Object Repository/TaskRepo/dropDownList'), GlobalVariable.TimeOut)
		Mobile.tap(findTestObject('Object Repository/TaskRepo/Dropdown/'+ Country), GlobalVariable.TimeOut)
	}
	def enterName() {
		Mobile.setText(findTestObject('Object Repository/TaskRepo/nameTxtFld'), GlobalVariable.Name, GlobalVariable.TimeOut)
	}
	def chooseGender() {
		Mobile.tap(findTestObject('Object Repository/TaskRepo/maleRadioButton'), GlobalVariable.TimeOut)
	}
	def clickOnLetsShopButton(){
		Mobile.tap(findTestObject('Object Repository/TaskRepo/letsShopBtn'), GlobalVariable.TimeOut)
	}
	def verifyItemsPageLoaded(){
		Mobile.verifyElementExist(findTestObject('TaskRepo/AddToCart/addToCartTxt-AirJordan4Reto'), GlobalVariable.TimeOut)
	}
}