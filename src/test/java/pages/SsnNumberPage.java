package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SsnNumberPage {

    public SsnNumberPage(){
        PageFactory.initElements(Driver.getDriver(), this);
}


    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement firstSignIn;

    @FindBy(xpath = "//*[.='Sign in']")
    public WebElement signIn;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//*[.='My Operations']")
    public WebElement myOperations;

    @FindBy(xpath = "//*[.='Manage Customers']")
    public WebElement manageCustomers;

    @FindBy(id = "jh-create-entity")
    public WebElement createNewCustomer;

    @FindBy(id = "search-ssn")
    public WebElement ssn;

    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement searchButton;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy(id = "tp-customer-country")
    public WebElement country;

    @FindBy(id = "tp-customer-state")
    public WebElement state;

    @FindBy(xpath = "//input[@name='createDate']")
    public WebElement date;

    @FindBy(id = "tp-customer-zelleEnrolled")
    public WebElement zelleEnrolled;





}







