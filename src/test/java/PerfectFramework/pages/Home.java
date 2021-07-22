package PerfectFramework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import PerfectFramework.utils.BrowserUtils;

public class Home extends BrowserUtils {
    public Home(){
        PageFactory.initElements(driver,this);
    }


@FindBy(xpath = "//input[@type='submit']")
    private WebElement buyNow;





    public void setBuyNow(){
        staticWait(2);
        buyNow.click();
    }




}
