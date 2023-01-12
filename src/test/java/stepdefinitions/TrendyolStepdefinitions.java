package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import pages.TrendyolPage;
import utilities.Driver;

public class TrendyolStepdefinitions {

    TrendyolPage trendyolPage=new TrendyolPage();

    @Given("kullanici trendyola anasayfasina gider")
    public void kullaniciTrendyolaAnasayfasinaGider() {
        Driver.getDriver().get("https://www.trendyol.com/");

    }

    @Then("trendyolda arama kutusuna nutella yazip aratir")
    public void trendyoldaAramaKutusunaNutellaYazipAratir() {

        trendyolPage=new TrendyolPage();
        trendyolPage.trendyolAramaKutusu.sendKeys("Nutella"+Keys.ENTER);

    }

    @Then("arama sonuclarinin Nutella icerdigini test eder trendyol icin")
    public void aramaSonuclarininNutellaIcerdiginiTestEderTrendyolIcin() {

        String actualAramaSonucu=trendyolPage.aramaTrendyolSonucuElementi.getText();
        String expectedKelime="Nutella";

        Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));

    }

    @Then("trendyol sayfasini kapatir")
    public void trendyolSayfasiniKapatir() {
        Driver.closeDriver();

    }

//    @And("{int} saniye bekler")
//    public void saniyeBekler(int saniye) {
//
//        try {
//            Thread.sleep(saniye*1000);
//        } catch (InterruptedException e) {
//
//        }
//    }
//
//    @Then("sayfayi kapatir")
//    public void sayfayi_kapatir() {
//        Driver.closeDriver();
//    }

}
