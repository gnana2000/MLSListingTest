package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.xpath;

public class HomePage {

    private SelenideElement Logo  = $(xpath("//img[@src='/matrix/images/BoardLogos/MFR_Logo_Header_V2.png']"));

    public void CheckVisibiliyOfLogo(){Logo.shouldBe(Condition.visible);}
    public SelenideElement QuickBttn = $(xpath("//span[contains(text(),'Quick')]"));

    public SelenideElement ResidentialDropdwn = $(xpath("//href=\"/Matrix/Search/Residential/Quick"));
    public SelenideElement ZipField = $(xpath("//*[@id=\"Fm23_Ctrl2097_LB_TB\"]"));




}
