Feature: Top menu rest of buttons
  Scenario Outline: Top menu "<mainLink>" testing
    Given users navigateto "https://movita.com.tr//"
    When  user hoverover "<mainLink>"
    And   user assert change color of "<mainLink>"
    And   userclick "<mainLink>"
    Then  shouldbe visible "<relatedPage>"

    Examples:
      | mainLink           | relatedPage                              |
      | Rota Optimizasyonu | https://movita.com.tr/rota_optimizasyonu |
      | Uygulamalar        | https://movita.com.tr/uygulamalar        |
      | Kılavuz            | https://movita.com.tr/guide              |
      | İLETİŞİM           | https://movita.com.tr/iletisim           |