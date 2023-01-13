package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.QualitydemyPage;
import utilities.ConfigReader;

public class QualitydemyStepdefinitions {

    QualitydemyPage qualitydemyPage=new QualitydemyPage();

    @Then("ilk sayfa login linkine click yapar")
    public void ilk_sayfa_login_linkine_click_yapar() {
        qualitydemyPage.ilkLoginLinki.click();
    }

    @Then("kullanici kutusuna {string} yazar")
    public void kullanici_kutusuna_yazar(String istenenUsername) {
        qualitydemyPage.kullaniciEmailKutusu.sendKeys(ConfigReader.getProperty(istenenUsername));
    }

    @Then("password kutusuna {string} yazar")
    public void password_kutusuna_yazar(String istenenPasword) {
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty(istenenPasword));
    }

    @Then("login butonuna basar")
    public void login_butonuna_basar() {
        qualitydemyPage.loginButonu.click();
    }

    @Then("basarili giris yapabildigini test eder")
    public void basarili_giris_yapabildigini_test_eder() {
        Assert.assertTrue(qualitydemyPage.basariliGirisCoursesLinki.isDisplayed());
    }


    @And("giris yapilamadiginiz test eder")
    public void girisYapilamadiginizTestEder() {
        Assert.assertTrue(qualitydemyPage.kullaniciEmailKutusu.isDisplayed());
    }

    @And("kullanici kutusuna manuel olarak {string} yazar")
    public void kullaniciKutusunaManuelOlarakYazar(String username) {
        qualitydemyPage.kullaniciEmailKutusu.sendKeys(username);
    }

    @And("password kutusuna manuel olarak {string} yazar")
    public void passwordKutusunaManuelOlarakYazar(String parword) {
        qualitydemyPage.passwordKutusu.sendKeys(parword);
    }
}
