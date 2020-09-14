package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

import java.util.List;

public class CountryPOM extends BasePOM {

    public CountryPOM() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(css = "[formgroupname=\"country\"]")
    private WebElement country;

    @FindBy(css = ".mat-option-text")
    private List<WebElement> countryList;


    WebElement myElement;

    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {
            case "country":
                myElement = country;
                break;

        }
        waitAndClick(myElement);
    }
    public void clickOnElementInTheDropdown(String whichOption) {

        for (int i = 0; i < countryList.size(); i++) {

            if (countryList.get(i).getText().contains(whichOption)) {

                countryList.get(i).click();
                break;
            }
        }
    }

}
