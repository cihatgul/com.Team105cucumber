package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@wip",
        dryRun = false
        // true yazinca test'de hata var mi yok mu ona bakiyor yani binevi testi calistirmaz sadece hatanin olup olmadigina bakar
        // false yazinca dosyayi calistirir

)

public class Runner {

    /*
    Cucumber'da Runner Class'ı bos bir class'tır.
    Runner class'ını diğer class'lardan farklı kılan ve TestNG'deki
    xml dosyaları gibi calışmasını saglayan iki adet notasyon mevcuttur

   * @RunWith notasyonu projemize cucumber junit dependency eklememizin sebebidir.
    bu sayede runner class'larımız cucumber ile çalışır.

   * @CucumberOptions notasyonu  ile istediğimiz özellikleri Runner Class'ına ekleyebiliriz
    Raporlama gibi extra option'larıda ileride ekleyeceğiz
    Ancak !
    Öncelikli görevi features dosyaları ile stepdefinitions'da bulunan java methodlarını
    ilişiklendirmektir.

   * tags: features clasoru içerisinde yazılan tag(lari) aratıp buldugu tüm feature veya
    senaryoları çalıştırır.

   * dryRun: iki değer alabilir

   * true: seçilirse , verilen tag ile işaretli olan Feature veya
    Scenario'daki eksik stepdefinitions'ları
    bulup ilgili method'ları olusturur.
    Hiçbir sekilde test'ımızı calıstırmaz eksik adım yoksa test PASSED olarak işaretler

    * false: seçilirse verilen tag ile işaretlenen Feature veya Scenario'ları calıstırır.

     */

}
