package steps;

import POM.HRPOM;
import POM.TablePOM;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import POM.NavPOM;
import POM.EducationPOM;


public class HRSteps {
    HRPOM hr=new HRPOM();
    TablePOM table = new TablePOM();
    NavPOM nav=new NavPOM();

    @And("^Navigate to Human Resources page$")
    public void navigateToHumanResourcesPage() {
    nav.findElementAndClickFunction("humanResources");
    nav.findElementAndClickFunction("hrSetupButton");

    }

    @When("^User create a position as \"([^\"]*)\" with code \"([^\"]*)\"$")
    public void userCreateAPositionAsWithCode(String name, String code) {
        table.findElementAndClickFunction("AddButton");
        table.findElementAndSendKeysFunction("NameInput",name);
        table.findElementAndSendKeysFunction("shortNameInput",code);
        table.findElementAndClickFunction("SaveButton");

    }


    @When("^User create \"([^\"]*)\"$")
    public void userCreateAPositionSalaryAs(String positionSalaryName) {
        table.findElementAndClickFunction("AddButton");
        hr.findElementAndSendKeysFunction("positionSalaryName",positionSalaryName);
        table.findElementAndClickFunction("SaveButton");
    }

    @When("^User edit the position salary of \"([^\"]*)\" to \"([^\"]*)\"$")
    public void userEditThePositionSalaryTo(String oldPositionSalaryName, String newPositionSalaryName)  {
        table.editAndDeleteFunction(oldPositionSalaryName,"edit");
        hr.findElementAndSendKeysFunction("positionSalaryName", newPositionSalaryName);
        table.findElementAndClickFunction("SaveButton");
}

    @When("^User edit \"([^\"]*)\" to \"([^\"]*)\"$")
    public void userEditTo(String oldName, String newName)  {
        table.editAndDeleteFunction(oldName, "edit");
        table.findElementAndSendKeysFunction("NameInput", newName);
        table.findElementAndClickFunction("SaveButton");

    }

    @And("^Navigate to Position Salary$")
    public void navigateToPositionSalary() {
        nav.findElementAndClickFunction("positionSalary");
    }

    @And("^Navigate to Position$")
    public void navigateToPosition() {
        nav.findElementAndClickFunction("positions");
    }


}
