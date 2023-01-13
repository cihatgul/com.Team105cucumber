package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.EditorPage;

public class EditorStepdefinitions {

    EditorPage editorPage=new EditorPage();

    public EditorStepdefinitions(){
    }

    @Then("new butonuna basar")
    public void newButonu(){
        this.editorPage.newButonu.click();
    }

    @And("First name kutusuna {string} yazar")
    public void firstNameKutusunaYazar(String firstName) {
        this.editorPage.firstName.sendKeys(new CharSequence[]{firstName});
    }


    @And("Last name kutusuna {string} yazar")
    public void lastNameKutusunaYazar(String lastName) {
        this.editorPage.lastName.sendKeys(new CharSequence[]{lastName});
    }

    @And("position kutusuna {string} yazar")
    public void positionKutusunaYazar(String position) {
        this.editorPage.position.sendKeys(new CharSequence[]{position});
    }

    @And("Office kutusuna {string} yazar")
    public void officeKutusunaYazar(String office) {
        this.editorPage.office.sendKeys(new CharSequence[]{office});
    }

    @And("Extension kutusuna {string} yazar")
    public void extensionKutusunaYazar(String extension) {
        this.editorPage.extension.sendKeys(new CharSequence[]{extension});
    }

    @And("Start date kutusuna {string} yazar")
    public void startDateKutusunaYazar(String startDate) {
        this.editorPage.startDate.sendKeys(new CharSequence[]{startDate});
    }

    @And("Salary kutusuna {string} yazar")
    public void salaryKutusunaYazar(String salary) {
        this.editorPage.salary.sendKeys(new CharSequence[]{salary});
    }

    @And("Create tusuna basar")
    public void createTusunaBasar() {
        this.editorPage.createButonu.click();
    }

    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstName) {
        this.editorPage.searchKutusu.sendKeys(new CharSequence[]{firstName+ Keys.ENTER});
    }

    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isimBolumundeOldugunuDogrular(String firstName) {
        String actualIlkIsimStr=this.editorPage.ilkIsimElementi.getText();
        Assert.assertTrue(actualIlkIsimStr.contains(firstName));
    }
}
