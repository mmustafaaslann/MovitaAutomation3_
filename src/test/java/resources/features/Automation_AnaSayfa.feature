Feature: HomePage

  Background:navigate to url
    Given users navigate to "https://movita.com.tr//"

  Scenario: movita logo

    When  users clicked the movita logo
    And   Mobile Vehicle Tracking System shoould be visible
    Then  should be success

  Scenario: giris yap

    When  user clicks the enter button
    And   user clicks the Turkish language button
    And   user String verify Türkce → “Mobil Vasita izleme takip Sistemi” yazisini verify et


    When  user clicks the enter button
    And   user clicks the english language button
    And   user String verify English → “Mobile Vehicle Tracking System” yazisini verify et

    Scenario: homepage
      When user hover over the homepage title and the title color should be changeble.
      And  the home title should be clickable
      And user String verify Türkce → “Mobil Vasita izleme takip Sistemi” yazisini verify et

  @Kurumsal
  Scenario Outline: kurumsal
    When   user hover over the "<maintitle>"
    And   hover over on the "<subtitles>"
    And   user "<clickable>" the subTitle
    And  "<maintitle>" and "<subtitles>" colours should be change
    Then  verify the subtitle with of "<text>"


    Examples:
      | maintitle | subtitles         | clickable         | text                                 |
      | Kurumsal  | Hakkımızda        | Hakkımızda        | Hakkımızda                           |
      | Kurumsal  | Belgelerimiz      | Belgelerimiz      | BELGELERİMİZ                         |
      | Kurumsal  | Bayilik Başvurusu | Bayilik Başvurusu | Bayilik Başvuru                      |
      | Kurumsal  | Demo Başvrusu     | Demo Başvrusu     | Demo Başvuru                         |
      | Kurumsal  | Çerez Politikası  | Çerez Politikası  | Çerez Politikası                     |
      | Kurumsal  | KVKK              | KVKK              | KİŞİSEL VERİLERİN İŞLENME POLİTİKASI |

  @Urunler
  Scenario Outline: ürünler
    When  user hover over the "<mainTitle>"
    And   hover over the "<subTitle>"
    And   user "<click>" the subTitle
    And   verify the subtitle of "<text>"
    Then  "<mainTitle>" and "<subTitle>" colours should be change


    Examples:
      | mainTitle | subTitle             | click                | text                 |
      | Ürünler   | MNVR                 | MNVR                 | MNVR                 |
      | Ürünler   | MNVR Pro             | MNVR Pro             | MNVR Pro             |
      | Ürünler   | MNVR AI              | MNVR AI              | MNVR AI              |
      | Ürünler   | Araç Takip Cihazı    | Araç Takip Cihazı    | Araç Takip Cihazı    |
      | Ürünler   | Cam Tracker          | Cam Tracker          | Cam Tracker          |
      | Ürünler   | Akıllı Direk Sistemi | Akıllı Direk Sistemi | Akıllı Direk Sistemi |


  @Cozumler
  Scenario Outline: Cozumler
    When  users hover over the "<mainTitles>"
    And   hover over on the "<subTitles>"
    And   user "<clicks>" on the subTitle
    And   verify the subtitle of with"<text>"
    Then  The "<mainTitles>" and "<subTitles>" colours should be change


    Examples:
      | mainTitles | subTitles                    | clicks                       | text                         |
      | Çözümler   | Taksi ve Özel Araçlar        | Taksi ve Özel Araçlar        | Taksi ve Özel Araçlar        |
      | Çözümler   | Minibüsler ve Midibüsler     | Minibüsler ve Midibüsler     | Minibüsler ve Midibüsler     |
      | Çözümler   | Şehirler Arası Otobüsler     | Şehirler Arası Otobüsler     | Şehirler Arası Otobüsler     |
      | Çözümler   | Zırhlı Taşıma Araçları       | Zırhlı Taşıma Araçları       | Zırhlı Taşıma Araçları       |
      | Çözümler   | Okul Servisleri              | Okul Servisleri              | Okul Servisleri              |
      | Çözümler   | Güvenlik Kuvvetleri Araçları | Güvenlik Kuvvetleri Araçları | Güvenlik Kuvvetleri Araçları |
      | Çözümler   | Yük ve Eşya Taşıyan Araçlar  | Yük ve Eşya Taşıyan Araçlar  | Yük ve Eşya Taşıyan Araçlar  |
      | Çözümler   | Belediye ve Halk Otobüsleri  | Belediye ve Halk Otobüsleri  | Belediye ve Halk Otobüsleri  |





















