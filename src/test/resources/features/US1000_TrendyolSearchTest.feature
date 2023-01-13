


Feature: US1000 kullanici trendyola islem yapar


  Scenario: TC00 kullanici trendyolda nutella aratir
    Given kullanici trendyola anasayfasina gider
    Then trendyolda arama kutusuna nutella yazip aratir
    And arama sonuclarinin Nutella icerdigini test eder trendyol icin
    Then trendyol sayfasini kapatir



