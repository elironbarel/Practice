import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.lang.reflect.Array;
import java.util.List;

public class WebForm extends PageObject{

    private final String FIRST_NAME = "First Name";
    private final String LAST_NAME = "Last Name";

    @FindBy(id = "irst-name")
    private WebElement first_name;

    @FindBy(id = "last-name")
    private WebElement last_name;

    @FindBy(xpath = "//a[contains(text(),'Submit')]")
    private WebElement submit_button;

    public WebForm(WebDriver driver) {
        super(driver);
    }

    public void enterFirstName(){
        this.first_name.sendKeys(FIRST_NAME);
    }

    public void enterLastName(){
        this.last_name.sendKeys(LAST_NAME);
    }

    public void pressSubmitButton(){
        this.submit_button.click();
    }
    @FindBy(xpath = "//div[contains(text(),'The form was successfully submitted!')]")
    private WebElement alertSuccess;
    public void verifyAlertSuccess(){
        this.alertSuccess.isDisplayed();
    }
    @FindBy(xpath = "//div/input[@type='radio']")
    private WebElement[] radioTypeWebElements;
    public List convertArrayToList(WebElement[] array){
        List<WebElement> list = convertArrayToList(array);
        return list;
    }
}