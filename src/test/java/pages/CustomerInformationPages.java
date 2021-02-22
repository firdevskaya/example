package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CustomerInformationPages {

    public CustomerInformationPages()


    {
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "//a[@class='btn btn-success btn-sm'][1]")
    public WebElement firstCustomer;

    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "middleInitial")
    public WebElement middleInitial;

    @FindBy(id = "email")
    public WebElement e_mail;

    @FindBy(id = "mobilePhoneNumber")
    public WebElement mobilePhone;

    @FindBy(id = "phoneNumber")
    public WebElement phone;

    @FindBy(id = "zipCode")
    public WebElement zipCode;

    @FindBy(id = "address")
    public WebElement address;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "ssn")
    public WebElement ssnNumber;

    @FindBy(id = "createDate")
    public WebElement createDate;

    @FindBy(id = "zelleEnrolled")
    public WebElement zelleEnrolled;

    @FindBy(xpath = "//*[.='Country'][1]")
    public WebElement country;

    @FindBy(xpath = "//*[.='State'][1]")
    public WebElement state;

    @FindBy(xpath = "//*[.='User'][1]")
    public WebElement userNo;

    @FindBy(xpath = "//*[.='Account'][1]")
    public WebElement account;







}




