


Feature: US1003 kullanici parametre olarak girilen degerleri aratir


  Scenario: TC03 kullanici parametreli method ile nutella aratir
    Given kullanici amazon anasayfaya gider
    Then amazon arama kutusuna "Nutella" yazip aratir
    And arama sonuclarinin Nutella icerdigini test eder
    And sayfayi kapatir

  Scenario: TC04 kullanici parametreli method ile java aratir
    Given kullanici amazon anasayfaya gider
    Then amazon arama kutusuna "Java" yazip aratir
    And arama sonuclarinin Java icerdigini test eder
    And 5 saniye bekler
    And sayfayi kapatir

  Scenario: TC03 kullanici parametreli method ile Samsung aratir
    Given kullanici amazon anasayfaya gider
    Then amazon arama kutusuna "Samsung" yazip aratir
    And arama sonuclarinin samsung icerdigini test eder
    And sayfayi kapatir

