package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class NavPOM extends BasePOM {
    public NavPOM() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Education']")
    private WebElement educationNav;

    @FindBy(xpath = "//span[text()='Setup']")
    private WebElement Setup;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement countries;

    @FindBy(xpath = "//span[text()='Cities']")
    private WebElement cities;

    @FindBy(xpath = "(//span[text()='Setup'])[5]")
    private WebElement eduSetupButton;

    @FindBy(xpath = "(//span[text()='Setup'])[7]")
    private WebElement reportSetup;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement hrSetupButton;

    @FindBy(xpath = "//span[text()='Subject Categories']")
    private WebElement subjectCategory;

    @FindBy(xpath = "(//span[text()='Subjects'])[1]")
    private WebElement subject;

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanResources;

    @FindBy(xpath = "//span[text()='Positions']")
    private WebElement positions;

    @FindBy(xpath = "//span[text()='Position Salary']")
    private WebElement positionSalary;

    @FindBy(xpath = "//span[text()='Salary Types']")
    private WebElement salaryType;

    @FindBy(xpath = "//span[text()='Salary Constants']")
    private WebElement salaryConstant;

    @FindBy(xpath = "//span[text()='Salary Modifiers']")
    private WebElement salaryModifier;

    @FindBy(xpath = "//span[text()='Budget']")
    private WebElement budget;

    @FindBy(xpath = "(//span[text()='Setup'])[6]")
    private WebElement budgetSetup;

    @FindBy(xpath = "//span[text()='Budget Groups']")
    private WebElement budgetGroups;

    @FindBy(xpath = "(//span[text()='Reports'])[3]")
    private WebElement reports;

    @FindBy(xpath = "//span[text()='Excel Template']")
    private WebElement excel;

    @FindBy(xpath = "//span[text()='Cost Centers']")
    private WebElement costCenter;

    WebElement myElement;

    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {
            case "educationNav":
                myElement = educationNav;
                break;
            case "eduSetupButton":
                myElement = eduSetupButton;
                break;
            case "subjectCategory":
                myElement = subjectCategory;
                break;
            case "humanResources":
                myElement = humanResources;
                break;
            case "hrSetupButton":
                myElement = hrSetupButton;
                break;
            case "subject":
                myElement = subject;
                break;
            case "positions":
                myElement = positions;
                break;
            case "positionSalary":
                myElement = positionSalary;
                break;
            case "budget":
                myElement = budget;
                break;
            case "budgetSetup":
                myElement = budgetSetup;
                break;
            case "budgetGroups":
                myElement = budgetGroups;
                break;
            case "Setup":
                myElement = Setup;
                break;
            case "parameters":
                myElement = parameters;
                break;
            case "countries":
                myElement = countries;
                break;
            case "cities":
                myElement = cities;
                break;
            case "salaryType":
                myElement = salaryType;
                break;
            case "salaryConstant":
                myElement = salaryConstant;
                break;
            case "salaryModifier":
                myElement = salaryModifier;
                break;
            case "reports":
                myElement = reports;
                break;
            case "reportSetup":
                myElement = reportSetup;
                break;
            case "excel":
                myElement = excel;
                break;
            case "costCenter":
                myElement = costCenter;
                break;


        }
        waitAndClick(myElement);
    }
}
