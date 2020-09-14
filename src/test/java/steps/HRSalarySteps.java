package steps;

import POM.EducationPOM;
import POM.HRPOM;
import POM.NavPOM;
import POM.TablePOM;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class HRSalarySteps {
    HRPOM hr = new HRPOM();
    TablePOM table = new TablePOM();
    NavPOM nav = new NavPOM();

    @And("^Navigate to Salary Type$")
    public void navigateToSalaryType() {
        nav.findElementAndClickFunction("salaryType");
    }

    @When("^User create a salary type as \"([^\"]*)\"$")
    public void userCreateASalaryTypeAs(String type) {
        table.findElementAndClickFunction("plusIcon");
        table.findElementAndSendKeysFunction("NameInput", type);
        hr.findElementAndClickFunction("userType");
        hr.findElementAndClickFunction("guest");
        table.findElementAndClickFunction("SaveButton");

    }

    @And("^Navigate to Salary Constant$")
    public void navigateToSalaryConstant() {
        nav.findElementAndClickFunction("salaryConstant");
    }

    @When("^User create a salary constant as \"([^\"]*)\"$")
    public void userCreateASalaryConstantAs(String constant) throws InterruptedException {
        Thread.sleep(2000);
        table.findElementAndClickFunction("plusIcon");
        hr.findElementAndSendKeysFunction("experienceRange", constant);
        hr.findElementAndClickFunction("validFrom");
        hr.findElementAndClickFunction("september6th");
        hr.findElementAndSendKeysFunction("key","us" );
        hr.findElementAndSendKeysFunction("consValue", "22");
        table.findElementAndClickFunction("SaveButton");


    }

    @And("^Navigate to Salary Modifier$")
    public void navigateToSalaryModifier() {
        nav.findElementAndClickFunction("salaryModifier");
    }

    @When("^User create a salary modifier as \"([^\"]*)\"$")
    public void userCreateASalaryModifierAs(String modifier)  {
        table.findElementAndClickFunction("plusIcon");
        hr.findElementAndSendKeysFunction("description", modifier);
        hr.findElementAndSendKeysFunction("variable", "mod");
        hr.findElementAndSendKeysFunction("amount", "100000");
        table.findElementAndClickFunction("SaveButton");

    }

    @When("^User edit description of \"([^\"]*)\" to \"([^\"]*)\"$")
    public void userEditDescriptionOfTo(String oldModifier, String newModifier) throws InterruptedException {
        table.editAndDeleteFunction(oldModifier, "edit");
        Thread.sleep(2000);
        hr.findElementAndSendKeysFunction("description", newModifier);
        table.findElementAndClickFunction("SaveButton");

    }

    @When("^User edit Salary Constant of \"([^\"]*)\" to \"([^\"]*)\"$")
    public void userEditSalaryConstantOfTo(String oldConstant, String newConstant) {
        table.editAndDeleteFunction(oldConstant, "edit");
        hr.findElementAndSendKeysFunction("experienceRange", newConstant);
        table.findElementAndClickFunction("SaveButton");


    }
}
