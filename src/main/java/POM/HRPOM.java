package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

import java.util.ArrayList;
import java.util.List;

public class HRPOM extends BasePOM {

    public HRPOM() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@formcontrolname='name']")
    private WebElement experienceRange;

    @FindBy(css = "[data-placeholder='From']")
    private WebElement From;

    @FindBy(css = "[aria-label='September 6, 2020']")
    private WebElement september6th;

    @FindBy(css = "[data-placeholder='Salary']")
    private WebElement salaryName;

    @FindBy(xpath = "//span[text()='Currency']")
    private WebElement currency;

    @FindBy(xpath = "//span[text()=' USD ']")
    private WebElement usd;

    @FindBy(xpath = "//span[text()=' Add ']")
    private WebElement addInSalary;

    @FindBy(xpath = "//span[text()=' Guest ']")
    private WebElement guest;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='title']/input")
    private WebElement positionSalaryName;

    @FindBy(css = "[placeholder=\"User Type\"]")
    private WebElement userType;

    @FindBy(css = "[data-placeholder=\"Valid From\"]")
    private WebElement validFrom;

    @FindBy(xpath = "//input[contains(@id, 'ms-text-field')]")
    private WebElement key;

    @FindBy(xpath = "//input[contains(@id, 'ms-integer-field')]")
    private WebElement consValue;

    @FindBy(css = "[formcontrolname=\"description\"]")
    private WebElement description;

    @FindBy(css = "[formcontrolname=\"variable\"]")
    private WebElement variable;

    @FindBy(css = "[data-placeholder=\"Amount\"]")
    private WebElement amount;

    @FindBy(css = "[data-icon=\"trash-alt\"]")
    private WebElement deleteData;


    WebElement myElement;

    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {
            case "From":
                myElement = From;
                break;
            case "september6th":
                myElement = september6th;
                break;
            case "currency":
                myElement = currency;
                break;
            case "usd":
                myElement = usd;
                break;
            case "addInSalary":
                myElement = addInSalary;
                break;
            case "userType":
                myElement = userType;
                break;
            case "guest":
                myElement = guest;
                break;
            case "validFrom":
                myElement = validFrom;
                break;
            case "key":
                myElement = key;
                break;
            case "deleteData":
                myElement = deleteData;
                break;


        }
        waitAndClick(myElement);
    }

    public void findElementAndSendKeysFunction(String ElementName, String value) {

        switch (ElementName) {
            case "emailInput":

            case "experienceRange":
                myElement = experienceRange;
                break;
            case "positionSalaryName":
                myElement = positionSalaryName;
                break;
            case "salaryName":
                myElement = salaryName;
                break;
            case "key":
                myElement = key;
                break;
            case "consValue":
                myElement = consValue;
                break;
            case "description":
                myElement = description;
                break;
            case "variable":
                myElement = variable;
                break;
            case "amount":
                myElement = amount;
                break;


        }
        waitAndSendKeys(myElement, value);
    }

}
