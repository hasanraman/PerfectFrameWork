package PerfectFramework.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import PerfectFramework.utils.BrowserUtils;

public class Payment extends BrowserUtils {
    public Payment(){
        PageFactory.initElements(driver,this);
    }


    @FindBy(id = "card_nmuber")
    private WebElement cardnumber;
    @FindBy(id = "month")
    private WebElement month;
    @FindBy(id = "year")
    private WebElement year;
    @FindBy(id = "cvv_code")
    private WebElement cvvCode;
    @FindBy(xpath = "//input[@value='Pay $20.00']")
    private WebElement payButton;


    public void setcNumber(String CardNumber) {
        staticWait(1);
        cardnumber.sendKeys(CardNumber);
    }
    public void seteMonth(String Month) {
        staticWait(1);
        Select select = new Select(month);
        select.selectByVisibleText(Month);
    }
    public void seteYear(String Year) {
        staticWait(1);
        Select select = new Select(year);
        select.selectByVisibleText(Year);
    }
    public void setCvvCode(String CvCode) {
        staticWait(1);
        cvvCode.sendKeys(CvCode);
    }
    public void setPayButton() {
        staticWait(1);
        payButton.click();
    }







}
