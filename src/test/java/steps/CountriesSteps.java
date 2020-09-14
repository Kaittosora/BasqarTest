package steps;

import POM.CountryPOM;
import POM.EducationPOM;
import POM.NavPOM;
import POM.TablePOM;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class CountriesSteps {
    CountryPOM country=new CountryPOM();
    TablePOM table = new TablePOM();
    NavPOM nav=new NavPOM();


    @And("^Navigate to Parameters$")
    public void navigateToParameters() {
        nav.findElementAndClickFunction("Setup");
        nav.findElementAndClickFunction("parameters");

    }

    @And("^Navigate to Country$")
    public void navigateToCountry() {
        nav.findElementAndClickFunction("countries");
    }

    @And("^Navigate to City$")
    public void navigateToCity() {
        nav.findElementAndClickFunction("cities");
    }

    @When("^User create city \"([^\"]*)\" and choose \"([^\"]*)\" as a country$")
    public void userCreateCityAndChooseAsACountry(String city, String countryName)  {
        table.findElementAndClickFunction("plusIcon");
        country.findElementAndClickFunction("country");
        country.clickOnElementInTheDropdown(countryName);
        table.findElementAndSendKeysFunction("NameInput",city);
        table.findElementAndClickFunction("SaveButton");
    }
}
