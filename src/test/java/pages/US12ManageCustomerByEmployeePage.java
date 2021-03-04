package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US12ManageCustomerByEmployeePage {

    public US12ManageCustomerByEmployeePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(name = "username")
    public WebElement username;

    @FindBy(name = "password")
    public  WebElement password;

    @FindBy(id = "firstName")
    public WebElement firstNameHeader;

    @FindBy(id = "email")
    public WebElement emailHeader;

    @FindBy(css = ".btn.btn-primary")
    public WebElement editButton;

    @FindBy(xpath = "/html/body/div/div/div/div[3]/div[1]/div/div/div/div/a[2]")
    public WebElement customerEdit;

    @FindBy(xpath = "/html/body/div/div/div/div[3]/div[1]/div/div/div/div/dl/dd[4]")
    public WebElement viewEmail;

    @FindBy(xpath = "//*[@class='btn btn-primary btn-sm']")
    public WebElement viewRightEdit;

    @FindBy(xpath = "/html/body/div/div/div/div[3]/div[1]/div/div/div/div/h2/span")
    public WebElement CustomerYazi;

    @FindBy(xpath = "//label[@for='tp-customer-email']")
    public WebElement editEmail;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement editCity;

    @FindBy(id="save-entity")
    public WebElement EditSaveBtn;

    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement succesEditedMessage;

    @FindBy(xpath = "/html/body/div/div/div/div[3]/div[1]/div/div/div/div[1]/div/table/tbody/tr[1]/td[10]/div/a[3]")
    public WebElement deleteButon;

    @FindBy(id="jhi-confirm-delete-tPCustomer")
    public WebElement confirmdelbtn;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/div/div/div[1]")
    public WebElement succesdelmessage;

}
