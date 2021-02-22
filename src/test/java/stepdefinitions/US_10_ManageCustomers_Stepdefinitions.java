package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.ManageCustomersPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_10_ManageCustomers_Stepdefinitions {


ManageCustomersPage manageCustomersPage= new ManageCustomersPage();


    @Given("Go to gmibank.com home page")
    public void goToGmibankComHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("gmi_url"));
    }

    @And("Click to User Account Menu and Click to Sign In")
    public void clickToUserAccountMenuAndClickToSignIn() {
manageCustomersPage.dropDownAccount.click();
        manageCustomersPage .accountSignIn.click();
    }
    @And("Enter the username with valid credentail")
    public void enterTheUsernameWithValidCredentail() {
        manageCustomersPage.username.sendKeys(ConfigurationReader.getProperty("employeeUsername"));
    }

    @And("Enter the pasword with valid credentail")
    public void enterThePaswordWithValidCredentail() {
        manageCustomersPage.password.sendKeys(ConfigurationReader.getProperty("employeePassword"));
    }

    @And("Click to Sign in button")
    public void clickToSignInButton() {manageCustomersPage
            .buttonSignin.click();
    }

    @And("Click to My Operations drop down menu and Click to Manage Costumers")
    public void clickToMyOperationsDropDownMenuAndClickToManageCostumers() {
        manageCustomersPage.myOperations.click();
        manageCustomersPage.manageCostumer.click();
    }
    @And("click to last page button")
    public void clickToLastPageButton()
    {manageCustomersPage
            .lastPageButton.click();
    }
    @Then("A customer should show up at total nine head on account information of the customer")
    public void aCustomerShouldShowUpAtTotalNineHeadOnAccountInformationOfTheCustomer() {
        Assert.assertTrue(manageCustomersPage.headList.get(0).getText().contains("ID"));
        Assert.assertTrue(manageCustomersPage.headList.get(1).getText().contains("First Name"));
        Assert.assertTrue(manageCustomersPage.headList.get(2).getText().contains("Last Name"));
        Assert.assertTrue(manageCustomersPage.headList.get(3).getText().contains("Middle Initial"));
        Assert.assertTrue(manageCustomersPage.headList.get(4).getText().contains("Email"));
        Assert.assertTrue(manageCustomersPage.headList.get(5).getText().contains("Mobile Phone Number"));
        Assert.assertTrue(manageCustomersPage.headList.get(6).getText().contains("Phone Number"));
        Assert.assertTrue(manageCustomersPage.headList.get(7).getText().contains("Address"));
        Assert.assertTrue(manageCustomersPage.headList.get(8).getText().contains("Create Date"));
        Assert.assertTrue(manageCustomersPage.rowList.size()==10);
    }

    @And("Click to View button.")
    public void clickToViewButton() {
        //Driver.waitForVisibility(manageCostumerPage.buttonWiew, 3);
        Driver.getDriver().navigate().refresh();
        manageCustomersPage.buttonWiew.click();
    }

    @Then("There should be Edit button.")
    public void thereShouldBeEditButton() {
        Assert.assertTrue(manageCustomersPage.ButtonViewEdit.isDisplayed());
    }


    @And("go back to manage costumers page")
    public void goBackToManageCostumersPage()
    {
        manageCustomersPage.ButtonViewBack.click();
    }

    @Then("There should be Edit button where all customer")
    public void thereShouldBeEditButtonWhereAllCustomer() {
        manageCustomersPage.lastPageButton.click();
        Assert.assertTrue(   manageCustomersPage.buttonEdit.isDisplayed());
    }

    @And("Click to Edit button")
    public void clickToEditButton() {
       /// Driver.doubleClick(   manageCustomersPage.buttonEdit);
    }

    @And("City textbox is updated")
    public void cityTextboxIsUpdated() {
        manageCustomersPage.cityUpdate.clear();
        manageCustomersPage.cityUpdate.sendKeys(ConfigurationReader.getProperty("cityName"));
    }

    @And("Click to Save button in the Edit Page")
    public void clickToSaveButtonInTheEditPage() {

        manageCustomersPage.ButtonEditSave.click();
    }

    @Then("The Edit portal can allow user to update the user info")
    public void theEditPortalCanAllowUserToUpdateTheUserInfo() {
     //   Driver.waitForVisibility(manageCostumerPage.alertUpdate, 2);
        Assert.assertTrue(   manageCustomersPage.alertUpdate.isDisplayed());
    }

    @And("Confirming that a customer is registered with ID number")
    public void confirmingThatACustomerIsRegisteredWithIDNumber() {
        Assert.assertTrue(   manageCustomersPage.userDelete.isDisplayed());
    }

    @And("Click to Delete button")
    public void clickToDeleteButton() {
        Driver.getDriver().navigate().refresh();
        manageCustomersPage.buttonDelete.click();
    }

    @And("seeing a message if the user is sure about deletion")
    public void seeingAMessageIfTheUserIsSureAboutDeletion() {
       // Driver.waitForVisibility(manageCostumerPage.alertDeleteQuestion, 2);
        Assert.assertTrue(   manageCustomersPage.alertDeleteQuestion.isDisplayed());
    }

    @Then("User can delete a customer")
    public void userCanDeleteACustomer() {
        manageCustomersPage.alertDeleteButton.click();
      //  Driver.waitForVisibility(manageCostumerPage.popupDeleted,2);
        Assert.assertTrue(   manageCustomersPage.popupDeleted.isDisplayed());
    }



}
