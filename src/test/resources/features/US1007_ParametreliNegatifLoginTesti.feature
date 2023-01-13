


Feature: US10007 Kullanici yanlis bilgilerle giris yapamaz

  Scenario: TC09 Gecerli kullanici adi ve Gecersiz sifre ile Negatif Login Testi
    Given kullanici "qdUrl" anasayfaya gider
    Then ilk sayfa login linkine click yapar
    And kullanici kutusuna "qdGecerliUsername" yazar
    And password kutusuna "qdGecersizPassword" yazar
    Then login butonuna basar
    And giris yapilamadiginiz test eder
    And 3 saniye bekler
    Then sayfayi kapatir

  Scenario: TC010 Gecersiz kullanici adi ve Gecerli sifre ile Negatif Login Testi
    Given kullanici "qdUrl" anasayfaya gider
    Then ilk sayfa login linkine click yapar
    And kullanici kutusuna "qdGecersizUsername" yazar
    And password kutusuna "qdGecerliPassword" yazar
    Then login butonuna basar
    And giris yapilamadiginiz test eder
    And 3 saniye bekler
    Then sayfayi kapatir

  Scenario: TC011 Gecersiz kullanici adi ve Gecersiz sifre ile Negatif Login Testi
    Given kullanici "qdUrl" anasayfaya gider
    And 3 saniye bekler
    Then ilk sayfa login linkine click yapar
    And kullanici kutusuna "qdGecersizUsername" yazar
    And password kutusuna "qdGecersizliPassword" yazar
    Then login butonuna basar
    And giris yapilamadiginiz test eder
    And 3 saniye bekler
    Then sayfayi kapatir