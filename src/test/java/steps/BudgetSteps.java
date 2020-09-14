package steps;

import POM.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class BudgetSteps extends BasePOM {
    BudgetPOM budget =new BudgetPOM();
    TablePOM table = new TablePOM();
    NavPOM nav=new NavPOM();

    @Given("^I navigate to Budget Groups screen$")
    public void i_navigate_to_Budget_Groups_screen()  {
        nav.findElementAndClickFunction("budgetGroups");
    }


    @When("^I create a Budget Groups name as \"([^\"]*)\"$")
    public void i_create_a_Budget_Groups_name_as(String name) throws InterruptedException {
        Thread.sleep(2000);
        table.findElementAndClickFunction("plusIcon");
        budget.findElementAndSendKeys("description", name );

    }

    @And("^I add a start date as the choosen date$")
    public void iAddAStartDateAsTheChoosenDate() {
        budget.findElementAndClick("startDate");
        budget.findElementAndClick("september1st");
    }

    @And("^I add a finish date as the choosen date$")
    public void iAddAFinishDateAsTheChoosenDate() {
        budget.findElementAndClick("endDate");
        budget.findElementAndClick("september5th");
    }

    @And("^I add a comment as a \"([^\"]*)\"$")
    public void iAddACommentAsA(String comment)  {
        budget.findElementAndSendKeys("commentBox", comment);
    }

    @And("^I click the save Button$")
    public void iClickTheSaveButton() {
        table.findElementAndClickFunction("SaveButton");
    }

    @When("^User edit \"([^\"]*)\" to \"([^\"]*)\" and \"([^\"]*)\" to \"([^\"]*)\"$")
    public void userEditToAndTo(String oldName, String newName, String oldComment, String newComment)  {
        table.editAndDeleteFunction(oldName, "edit");
        budget.findElementAndSendKeys("description", newName );
        budget.findElementAndSendKeys("commentBox", newComment);
        table.findElementAndClickFunction("SaveButton");

    }

    @When("^User create a cost center as \"([^\"]*)\" with code \"([^\"]*)\"$")
    public void userCreateACostCenterAsWithCode(String name, String code) {
        table.findElementAndClickFunction("plusIcon");
        table.findElementAndSendKeysFunction("NameInput", name);
        budget.findElementAndSendKeys("codeInput",code);
        budget.findElementAndClick("type");
        budget.findElementAndClick("service");
        budget.findElementAndSendKeys("orderNo","7");
        budget.findElementAndClick("prefix");
        budget.findElementAndClick("personalRussian");
        table.findElementAndClickFunction("SaveButton");
    }

    @And("^Navigate to Cost Center$")
    public void navigateToCostCenter() {
        nav.findElementAndClickFunction("costCenter");
    }

    @And("^Navigate to Budget Page$")
    public void navigateToBudgetPage() {
        nav.findElementAndClickFunction("budget");
        nav.findElementAndClickFunction("budgetSetup");
    }
}
