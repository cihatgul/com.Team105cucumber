package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import pages.HerokuappPage;

public class HerokuappStepdefinitions {

    HerokuappPage herokuappPage=new HerokuappPage();

    public HerokuappStepdefinitions(){

    }

        @Then("Add Element butonuna basar")
        public void addElementButonunaBasar() {
            this.herokuappPage.addElementButonu.click();

        }

        @Then("Delete butonu gorunur oluncaya kadar bekler")
        public void deleteButonuGorunurOluncayaKadarBekler() throws InterruptedException{
            Thread.sleep(2000L);

        }

        @Then("Delete butonunun gorunur oldugunu test eder")
        public void deleteButonununGorunurOldugunuTestEder() {
            Assert.assertTrue(this.herokuappPage.deleteButonu.isDisplayed());

        }

        @Then("Delete butonuna basarak butonu siler")
        public void deleteButonunaBasarakButonuSiler() {
            this.herokuappPage.deleteButonu.click();

        }

        @Then("Delete butonunun gorunmedigini test eder")
        public void deleteButonununGorunmediginiTest_eder() {
            int flag = 3;

            try {
                this.herokuappPage.deleteButonu.click();
                Assert.assertFalse(flag == 3);
            } catch (NoSuchElementException var3) {
                Assert.assertTrue(flag == 3);
            }

        }

}



