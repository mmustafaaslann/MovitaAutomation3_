Feature: DropDown
  Scenario:DropDown Fonctuanilty
    Given go to url
    When DropDown visible and clickable
    Then Click DropDown
    And English and Turkish languages are visible
    Then Click English
    And “Mobile Vehicle Tracking System” text visible
    Then Click Turkish
    And “Mobil Vasita izleme takip Sistemi” text visible
