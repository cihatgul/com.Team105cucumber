Feature: US1004 kullanici parametre olarak girilen degerleri aratir


  @wip
  Scenario: TC04 kullanici parametreli method ile nutella aratir
    Given kullanici amazon anasayfaya gider
    Then amazon arama kutusuna "Nutella" yazip aratir
    And amazon sonuclarinin "Nutella" icerdigini test eder
    And sayfayi kapatir


  Scenario: TC05 kullanici parametreli method ile java aratir
    Given kullanici amazon anasayfaya gider
    Then amazon arama kutusuna "Java" yazip aratir
    And amazon sonuclarinin "Java" icerdigini test eder
    And sayfayi kapatir


  Scenario: TC05 kullanici parametreli method ile Samsung aratir
    Given kullanici amazon anasayfaya gider
    Then amazon arama kutusuna "Samsung" yazip aratir
    And amazon sonuclarinin "Samsung" icerdigini test eder
    And sayfayi kapatir