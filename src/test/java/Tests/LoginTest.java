package Tests;


import Pages.HomePage;
import Pages.Login;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class LoginTest {

    private Login login = new Login();

    private HomePage homePage = new HomePage();

    @BeforeEach
    public void setUp(){

        Configuration.browser = "chrome";
        ChromeDriverManager.chromedriver().version("2.46").setup();
        Selenide.clearBrowserCookies();
        Configuration.timeout = 10000;
        Configuration.startMaximized = true;



    }

    @Test
    public void LoginTest() {

        open("https://mfrmls.idp.clareity.net/idp/Authn/UserPassword");
        sleep(1000);
        login.setValueToUserNameField("261558895");
        sleep(1000);
        login.setValuePasswordField("98Ashwin!");
        sleep(1000);
        login.clickEnterButton();
        sleep(1000);
        homePage.CheckVisibiliyOfLogout();

    }



}

