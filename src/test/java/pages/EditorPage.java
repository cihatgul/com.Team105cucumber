package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EditorPage {
    public EditorPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[text()='New']")
    public WebElement newButonu;

    @FindBy(id = "DTE_Field_first_name")
    public WebElement firstName;

    @FindBy(id = "DTE_Field_last_name")
    public WebElement lastName;

    @FindBy(id = "DTE_Field_position")
    public WebElement position;

    @FindBy(id = "DTE_Field_office")
    public WebElement office;

    @FindBy(id = "DTE_Field_extn")
    public WebElement extension;

    @FindBy(id = "DTE_Field_start_date")
    public WebElement startDate;

    @FindBy(id = "DTE_Field_salary")
    public WebElement salary;

    @FindBy(xpath = "//button[@class='btn']")
    public WebElement createButonu;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchKutusu;

    @FindBy(xpath = "//td[@class='sorting_1']")
    public WebElement ilkIsimElementi;


}























//public class EditorStepdefinitions {
//    EditorPage editorPage = new EditorPage();
//
//    public EditorStepdefinitions() {
//    }
//
//    @Then("new butonuna basar")
//    public void new_butonuna_basar() {
//        this.editorPage.newButonu.click();
//    }
//
//    @Then("First name kutusuna {string} yazar")
//    public void first_name_kutusuna_yazar(String firstName) {
//        this.editorPage.firstName.sendKeys(new CharSequence[]{firstName});
//    }
//
//    @Then("Last name kutusuna {string} yazar")
//    public void last_name_kutusuna_yazar(String lastName) {
//        this.editorPage.lastName.sendKeys(new CharSequence[]{lastName});
//    }
//
//    @Then("position kutusuna {string} yazar")
//    public void position_kutusuna_yazar(String position) {
//        this.editorPage.position.sendKeys(new CharSequence[]{position});
//    }
//
//    @Then("Office kutusuna {string} yazar")
//    public void office_kutusuna_yazar(String office) {
//        this.editorPage.office.sendKeys(new CharSequence[]{office});
//    }
//
//    @Then("Extension kutusuna {string} yazar")
//    public void extension_kutusuna_yazar(String extension) {
//        this.editorPage.extension.sendKeys(new CharSequence[]{extension});
//    }
//
//    @Then("Start date kutusuna {string} yazar")
//    public void start_date_kutusuna_yazar(String startDate) {
//        this.editorPage.startDate.sendKeys(new CharSequence[]{startDate});
//    }
//
//    @Then("Salary kutusuna {string} yazar")
//    public void salary_kutusuna_yazar(String salary) {
//        this.editorPage.salary.sendKeys(new CharSequence[]{salary});
//    }
//
//    @Then("Create tusuna basar")
//    public void create_tusuna_basar() {
//        this.editorPage.createButonu.click();
//    }
//
//    @When("kullanici {string} ile arama yapar")
//    public void kullanici_ile_arama_yapar(String firstName) {
//        this.editorPage.searchKutusu.sendKeys(new CharSequence[]{firstName + Keys.ENTER});
//    }
//
//    @Then("isim bolumunde {string} oldugunu dogrular")
//    public void isim_bolumunde_oldugunu_dogrular(String firstName) {
//        String actualIlkIsimStr = this.editorPage.ilkIsimElementi.getText();
//        Assert.assertTrue(actualIlkIsimStr.contains(firstName));
//    }