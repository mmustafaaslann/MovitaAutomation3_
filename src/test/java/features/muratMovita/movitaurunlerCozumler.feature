Feature: Ürünler ve çözümler Button

  Scenario Outline: Verify Ürünler ve çözümler button_subMenu "<mainLink>"_"<subLink>" functionality
    Given users navigate too "https://movita.com.tr//"
    When  user hover overr "<mainLink>"
    And   user assert change color off
    And   user hover overr "<subLink>"
    And   user assert change color off
    And   user clickk "<subLink>"
    Then  "<relatedPage>" should be visiblee
    Then  "<text>" should be visible in related pagee


    Examples:
      | mainLink | subLink                      | relatedPage                                 | text                         |
      | Ürünler  | MNVR                         | https://movita.com.tr/mnvr                  | MNVR                         |
      | Ürünler  | MNVR Pro                     | https://movita.com.tr/mnvr_pro              | MNVR Pro                     |
      | Ürünler  | MNVR AI                      | https://movita.com.tr/mnvr_ai               | MNVR AI                      |
      | Ürünler  | Araç Takip Cihazı            | https://movita.com.tr/arac_takip_cihazi     | Araç Takip Cihazı            |
      | Ürünler  | Cam Tracker                  | https://movita.com.tr/urunler               | Ürünler                      |
      | Ürünler  | Akıllı Direk Sistemi         | https://movita.com.tr/akilli_direk          | Akıllı Direk Sistemi         |
      | Çözümler | Minibüsler ve Midibüsler     | https://movita.com.tr/minibus-midibus       | Minibüsler ve Midibüsler     |
      | Çözümler | Şehirler Arası Otobüsler     | https://movita.com.tr/sehirler-arasi-otobus | Şehirler Arası Otobüsler     |
      | Çözümler | Zırhlı Taşıma Araçları       | https://movita.com.tr/zirhli-tasima-arac    | Zırhlı Taşıma Araçları       |
      | Çözümler | Okul Servisleri              | https://movita.com.tr/okul-servisleri       | Okul Servisleri              |
      | Çözümler | Güvenlik Kuvvetleri Araçları | https://movita.com.tr/guvenlik-kuvvet-arac  | Güvenlik Kuvvetleri Araçları |
      | Çözümler | Yük ve Eşya Taşıyan Araçlar  | https://movita.com.tr/yuk-tasiyan-araclar   | Yük ve Eşya Taşıyan Araçlar  |
      | Çözümler | Belediye ve Halk Otobüsleri  | https://movita.com.tr/belediye-halk-otobus  | Belediye ve Halk Otobüsleri  |