package pages;

import net.bytebuddy.agent.builder.AgentBuilder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NewtoursRegisterConfirmationPage extends BasePages{
    public NewtoursRegisterConfirmationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//b")
    private List<WebElement> msgs;

    public String getNoteMsg(){
        return msgs.get(1).getText();
    }
}
