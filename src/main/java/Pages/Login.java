package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.xpath;

public class Login {
    public SelenideElement UserNameField = $(xpath("//input[@id=\"j_username\"]"));
    public SelenideElement PasswordField = $(xpath("//input[@id=\"password\"]"));
    public SelenideElement EnterButton = $(xpath("//button[@name=\"login\"]"));

    public void setValueToUserNameField(String UserName)
    {
        UserNameField.setValue(UserName);

    }

    public void setValuePasswordField(String Password)
    {
        UserNameField.sendKeys(Keys.TAB);
        PasswordField.sendKeys(Password);

    }

    public void clickEnterButton()
    {
        EnterButton.click();

    }
                    }



