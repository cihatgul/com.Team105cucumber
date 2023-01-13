


Feature: US1002 Kullanici amazonda test yapar


  Scenario: TC02 Kullanici amazonda Nutella aratir

    Given kullanici amazon anasayfaya gider
    Then amazon arama kutusuna Nutella yazip aratir
    And arama sonuclarinin Nutella icerdigini test eder
    And sayfayi kapatir

    Given kullanici amazon anasayfaya gider
    Then amazon arama kutusuna Java yazip aratir
    And arama sonuclarinin Java icerdigini test eder
    Then sayfayi kapatir

    Given kullanici amazon anasayfaya gider
    Then amazon arama kutusuna samsung yazip aratir
    And arama sonuclarinin samsung icerdigini test eder
    Then sayfayi kapatir
