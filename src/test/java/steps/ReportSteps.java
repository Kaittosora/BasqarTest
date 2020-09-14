package steps;

import POM.EducationPOM;
import POM.NavPOM;
import POM.TablePOM;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class ReportSteps {

    TablePOM table = new TablePOM();
    NavPOM nav=new NavPOM();

    @And("^Navigate to Reports Excel Template$")
    public void navigateToReportsExcelTemplate() {
        nav.findElementAndClickFunction("reports");
        nav.findElementAndClickFunction("reportSetup");
        nav.findElementAndClickFunction("excel");

    }

    @When("^User create an excel template as \"([^\"]*)\"$")
    public void userCreateAnExcelTemplateAs(String template) {
        table.findElementAndClickFunction("plusIcon");
        table.findElementAndSendKeysFunction("NameInput",template);
        table.findElementAndClickFunction("SaveButton");


    }
}
