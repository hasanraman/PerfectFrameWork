package PerfectFramework.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import PerfectFramework.utils.BrowserUtils;

public class Verification extends BrowserUtils {
    public Verification(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h2")
    private WebElement headerVerification;



    public void verifyMessage(String expected){
        staticWait(2);
        String actualMessage=headerVerification.getText();

        Assert.assertEquals(actualMessage,expected);

    }
}
