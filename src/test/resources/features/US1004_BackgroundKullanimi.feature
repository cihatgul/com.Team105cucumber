

Feature: US1004 kullanici bastaki ortak adimlar icin Background kullanir

  Background: tum seneryolar icin ortak ilk adim // burada ortak olanlari buraya yazabiliriz
    Given kullanici amazon anasayfaya gider

  Scenario: TC04 kullanici parametreli method ile nutella aratir
    Then amazon arama kutusuna "Nutella" yazip aratir
    And arama sonuclarinin Nutella icerdigini test eder
    And sayfayi kapatir

  Scenario: TC05 kullanici parametreli method ile java aratir
    Then amazon arama kutusuna "Java" yazip aratir
    And arama sonuclarinin Java icerdigini test eder
    And sayfayi kapatir

  Scenario: TC06 kullanici parametreli method ile Samsung aratir
    Then amazon arama kutusuna "Samsung" yazip aratir
    And arama sonuclarinin samsung icerdigini test eder
    And sayfayi kapatir