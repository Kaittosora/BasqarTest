package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class BudgetPOM extends BasePOM {

    public WebElement budgetElements;

    BasePOM page = new BasePOM();

    public BudgetPOM() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }


    @FindBy(xpath = "//input[@name='description']")
    private WebElement description;

    @FindBy(xpath = "//input[@data-placeholder='Budget Info Entering Start Date']")
    private WebElement startDate;

    @FindBy(xpath = "//input[@data-placeholder='Budget Info Entering End Date']")
    private WebElement endDate;

    @FindBy(css = "[formcontrolname='comment']")
    private WebElement commentBox;

    @FindBy(xpath = "(//input[contains(@id ,'ms-text-field')])[2]")
    private WebElement codeInput;

    @FindBy(css = "[placeholder=\"Expense accout code prefixes\"]")
    private WebElement prefix;

    @FindBy(xpath = "//input[@type='number']")
    private WebElement orderNo;

    @FindBy(xpath = "//div[text()=1]")
    private WebElement september1st;

    @FindBy(xpath = "// span[text()='Type']")
    private WebElement type;

    @FindBy(xpath = "// span[text()=' Service ']")
    private WebElement service;

    @FindBy(xpath = "// span[text()=' 2.1 | Персонал ']")
    private WebElement personalRussian;

    @FindBy(xpath = "//div[text()=5]")
    private WebElement september5th;


    public void findElementAndClick(String element) {
        switch (element) {
            case "startDate":
                budgetElements = startDate;
                break;
            case "endDate":
                budgetElements = endDate;
                break;
            case "september1st":
                budgetElements = september1st;
                break;
            case "september5th":
                budgetElements = september5th;
                break;
            case "type":
                budgetElements = type;
                break;
            case "service":
                budgetElements = service;
                break;
            case "prefix":
                budgetElements = prefix;
                break;
            case "personalRussian":
                budgetElements = personalRussian;
                break;
        }
        waitAndClick(budgetElements);

    }

    public void findElementAndSendKeys(String element, String value) {

        switch (element) {
            case "description":
                budgetElements = description;
                break;
            case "commentBox":
                budgetElements = commentBox;
                break;
            case "codeInput":
                budgetElements = codeInput;
                break;
            case "orderNo":
                budgetElements = orderNo;
                break;

        }
        waitAndSendKeys(budgetElements, value);

    }

}
