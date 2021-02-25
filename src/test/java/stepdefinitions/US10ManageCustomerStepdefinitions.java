package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US10ManagecustomerPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethod;

public class US10ManageCustomerStepdefinitions {

 US10ManagecustomerPage manage= new US10ManagecustomerPage();


    @Given("Go to gmibank.com home page")
    public void goToGmibankComHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("gmi_url"));
    }

    @And("Click to User Account Menu and Click to Sign In")
    public void clickToUserAccountMenuAndClickToSignIn() {
        manage.dropDownAccount.click();
        manage.accountSignIn.click();
    }
    @And("Enter the username with valid credentail")
    public void enterTheUsernameWithValidCredentail() {
        manage.username.sendKeys(ConfigurationReader.getProperty("employeeUsername"));
    }

    @And("Enter the pasword with valid credentail")
    public void enterThePaswordWithValidCredentail() {
        manage.password.sendKeys(ConfigurationReader.getProperty("employeePassword"));
    }

    @And("Click to Sign in button")
    public void clickToSignInButton() {
        manage.buttonSignin.click();
    }

    @And("Click to My Operations drop down menu and Click to Manage Costumers")
    public void clickToMyOperationsDropDownMenuAndClickToManageCostumers() {
        manage.myOperations.click();
        manage.manageCostumer.click();
    }
    @And("click to last page button")
    public void clickToLastPageButton() {
        manage.lastPageButton.click();
    }
    @Then("A customer should show up at total nine head on account information of the customer")
    public void aCustomerShouldShowUpAtTotalNineHeadOnAccountInformationOfTheCustomer() {
        Assert.assertTrue(manage.headList.get(0).getText().contains("ID"));
        Assert.assertTrue(manage.headList.get(1).getText().contains("First Name"));
        Assert.assertTrue(manage.headList.get(2).getText().contains("Last Name"));
        Assert.assertTrue(manage.headList.get(3).getText().contains("Middle Initial"));
        Assert.assertTrue(manage.headList.get(4).getText().contains("Email"));
        Assert.assertTrue(manage.headList.get(5).getText().contains("Mobile Phone Number"));
        Assert.assertTrue(manage.headList.get(6).getText().contains("Phone Number"));
        Assert.assertTrue(manage.headList.get(7).getText().contains("Address"));
        Assert.assertTrue(manage.headList.get(8).getText().contains("Create Date"));
        Assert.assertTrue(manage.rowList.size()==10);
    }

    @And("Click to View button.")
    public void clickToViewButton() {
        //Driver.waitForVisibility(manageCostumerPage.buttonWiew, 3);
        Driver.getDriver().navigate().refresh();
        manage.buttonWiew.click();
    }

    @Then("There should be Edit button.")
    public void thereShouldBeEditButton() {
        Assert.assertTrue(manage.ButtonViewEdit.isDisplayed());
    }


    @And("go back to manage costumers page")
    public void goBackToManageCostumersPage() {
        manage.ButtonViewBack.click();
    }

    @Then("There should be Edit button where all customer")
    public void thereShouldBeEditButtonWhereAllCustomer() {
        manage.lastPageButton.click();
        Assert.assertTrue(manage.buttonEdit.isDisplayed());
    }

    @And("Click to Edit button")
    public void clickToEditButton() {
        //Driver.doubleClick(manage.buttonEdit);
    }

    @And("City textbox is updated")
    public void cityTextboxIsUpdated() {
        manage.cityUpdate.clear();
        manage.cityUpdate.sendKeys(ConfigurationReader.getProperty("cityName"));
    }

    @And("Click to Save button in the Edit Page")
    public void clickToSaveButtonInTheEditPage() {

        manage.ButtonEditSave.click();
    }

    @Then("The Edit portal can allow user to update the user info")
    public void theEditPortalCanAllowUserToUpdateTheUserInfo() {
        ReusableMethod.waitForVisibility(manage.alertUpdate, 2);
        Assert.assertTrue(manage.alertUpdate.isDisplayed());
    }

    @And("Confirming that a customer is registered with ID number")
    public void confirmingThatACustomerIsRegisteredWithIDNumber() {
        Assert.assertTrue(manage.userDelete.isDisplayed());
    }

    @And("Click to Delete button")
    public void clickToDeleteButton() {
        Driver.getDriver().navigate().refresh();
        manage.buttonDelete.click();
    }

    @And("seeing a message if the user is sure about deletion")
    public void seeingAMessageIfTheUserIsSureAboutDeletion() {
        ReusableMethod.waitForVisibility(manage.alertDeleteQuestion, 2);
        Assert.assertTrue(manage.alertDeleteQuestion.isDisplayed());
    }

    @Then("User can delete a customer")
    public void userCanDeleteACustomer() {
        manage.alertDeleteButton.click();
        ReusableMethod.waitForVisibility(manage.popupDeleted,2);
        Assert.assertTrue(manage.popupDeleted.isDisplayed());
    }


    @And("Click Save Button")
    public void clickSaveButton() {
        
    }

    @Then("See This field is required.")
    public void seeThisFieldIsRequired() {
    }
}




