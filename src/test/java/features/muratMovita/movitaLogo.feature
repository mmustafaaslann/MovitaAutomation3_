Feature: logo functionality

  Scenario: logo
    Given user on homepage
    When  Logo isvisible and clickable
    And   user clicks The Logo
    Then  “Mobil Vasita izleme takip Sistemi” isvisible on page

