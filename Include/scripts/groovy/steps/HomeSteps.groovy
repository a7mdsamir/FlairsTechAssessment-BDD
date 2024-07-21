package steps
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.When
import cucumber.api.java.en.Then
import pages.HomePage



class HomeSteps {
	HomePage homepage = new HomePage()

	@Given("User on home page")
	public void userOnHomePage() {
		homepage.openApp()
		homepage.verifyHomePageLoaded()
	}

	@And("User enter valid data")
	public void userEnterValidData() {
		homepage.chooseCountry("Andorra")
		homepage.enterName()
		homepage.chooseGender()
	}

	@When ("Click on let's shop")
	public void ClickOnLetsShop() {
		homepage.clickOnLetsShopButton()
	}
}