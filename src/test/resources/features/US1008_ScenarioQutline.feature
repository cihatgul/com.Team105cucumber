


Feature: US10008 Scenario Qutline ile birden fazla data icin test calistirma

  Scenario Outline: TC012
    Given kullanici "amazonUrl" anasayfaya gider
    Then amazon arama kutusuna "<arananUrun>" yazip aratir
    And arama sonuclarinin "<arananUrun>" icerdigini test eder
    Then sayfayi kapatir




    Examples:
      |arananUrun|
      |Nutella   |
      |Java      |
      |Samsung   |
      |Apple     |

