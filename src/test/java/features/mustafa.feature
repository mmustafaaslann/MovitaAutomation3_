Feature: HomePage

  Background:url git
    Given kullanici urly gider "https://movita.com.tr//"


  Scenario: movita logo

    When : kullanici movita logosunu tikladi
    And  :  Mobile Vehicle Tracking System görünür olmalidir
    Then  : Basarili calısir