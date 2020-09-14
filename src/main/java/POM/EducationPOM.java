package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

import java.util.List;

public class EducationPOM extends BasePOM {

    public EducationPOM() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }


    @FindBy(css = "[formcontrolname=\"value\"]")
    private WebElement style;

    @FindBy(xpath = "//span[@class='mat-option-text']")
    private List<WebElement> categoryList;

    @FindBy(xpath = "(//span[text()=' MySubject '])[4]")
    private WebElement styleColor;

    @FindBy(css = "[formgroupname=\"subjectCategory\"]")
    private WebElement subjectCatInSubject;

    WebElement myElement;

    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {
            case "style":
                myElement = style;
                break;
            case "styleColor":
                myElement = styleColor;
                break;
            case "subjectCatInSubject":
                myElement = subjectCatInSubject;
                break;
        }
        waitAndClick(myElement);
    }


    public void clickOnElementInTheDropdown(String whichOption) {

        for (int i = 0; i < categoryList.size(); i++) {

            if (categoryList.get(i).getText().contains(whichOption)) {

                categoryList.get(i).click();
                break;
            }
        }
    }

}
