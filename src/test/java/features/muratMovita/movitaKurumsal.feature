Feature: Hakkımızda Button

  Scenario Outline: Verify Kurumsal button_subMenu "<mainLink>"_"<subLink>" functionality
    Given users navigate to "https://movita.com.tr//"
    When  user hover over "<mainLink>"
    And   user assert change color of
    And   user hover over "<subLink>"
    And   user assert change color of
    And   user click "<subLink>"
    Then  "<relatedPage>" should be visible
    Then  "<text>" should be visible in related page
    Examples:
      | mainLink | subLink           | relatedPage                        | text             |
      | Kurumsal | Hakkımızda        | https://movita.com.tr/about        | Hakkımızda       |
      | Kurumsal | Belgelerimiz      | https://movita.com.tr/belgelerimiz | BELGELERİMİZ     |
      | Kurumsal | Bayilik Başvurusu | https://movita.com.tr/bayi_basvuru | Bayilik Başvuru  |
      | Kurumsal | Demo Başvrusu     | https://movita.com.tr/demo_basvuru | Demo Başvuru     |
      | Kurumsal | Çerez Politikası  | https://movita.com.tr/cerez        | Çerez Politikası |
      | Kurumsal | KVKK              | https://movita.com.tr/kvkk         | KİŞİSEL VERİLER  |