package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TrendyolPage {

    public  TrendyolPage(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//input[@data-testid='suggestion']")
    public WebElement trendyolAramaKutusu;

    @FindBy(xpath = "//div[@class='srch-rslt-title']")
    public WebElement aramaTrendyolSonucuElementi;
}
