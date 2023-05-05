Feature: HomePage

  Background:url'ye git
    Given kullanıcılar şuraya gider:"https://movita.com.tr//"


  Scenario: movita logo

    When  kullanıcılar movita logosunu tıkladı
    And   Mobil Araç Takip Sistemi görünür olmalıdır
    Then  başarılı olmalı


  Scenario: giris yap

    When  kullanıcı enter düğmesini tıklar
    And   kullanıcı Türkçe dil düğmesini tıklar
    And   user String verify Türkce → “Mobil Vasita izleme takip Sistemi” yazisini verify ett


    When  kullanıcı enter düğmesini tıklar
    And   kullanıcı ingilizce dil düğmesini tıklar
    And   kullanıcı     String verfiy  İngilizce → “Mobil Araç Takip Sistemi” yazısını doğrulama et doğrulama İngilizce → “Mobil Araç Takip Sistemi” yazısını doğrulama et

  Scenario: ana sayfa
    When kullanıcı ana sayfa başlığının üzerine gelir ve başlık rengi değiştirilebilir olmalıdır.
    And  ana başlık tıklanabilir olmalıdır


  @Kurumsal
  Scenario Outline: kurumsal
    When   kullanıcı  "<AnaBaslik>" üzerine gelir
    And   hover over yapar  "<AltBaslik>"
    And   kullanıci atl basliklara tiklar   "<Tıklanabilir>"
    And   "<AnaBaslik>" ve   "<AltBaslik>" renkleri değişmelidir
    Then  alt basliklar   "<Metin>" ile görünür olmalı


    Examples:
      | AnaBaslik | AltBaslik         | Tıklanabilir      | Metin                                |
      | Kurumsal  | Hakkımızda        | Hakkımızda        | Hakkımızda                           |
      | Kurumsal  | Belgelerimiz      | Belgelerimiz      | BELGELERİMİZ                         |
      | Kurumsal  | Bayilik Başvurusu | Bayilik Başvurusu | Bayilik Başvuru                      |
      | Kurumsal  | Demo Başvrusu     | Demo Başvrusu     | Demo Başvuru                         |
      | Kurumsal  | Çerez Politikası  | Çerez Politikası  | Çerez Politikası                     |
      | Kurumsal  | KVKK              | KVKK              | KİŞİSEL VERİLERİN İŞLENME POLİTİKASI |

  @Urunler
  Scenario Outline:ürünler
    When :  kullanici urunler "<AnaBaslIk>" üzerine gelir
    And  :urunler seceneklerinde  hover over yapar "<AltBaslIk>"
    And  :  kullanıcı alt basliklara tiklar "<Tıkla>"
    And  :  alt basliklar "<Metin>" ile görünür olmalıdır
    Then : urunler "<AnaBaslIk>" ve   "<AltBaslIk>" renkleri değişmelidir


    Examples:
      | AnaBaslIk | AltBaslIk            | Tıkla                | Metin                |
      | Ürünler   | MNVR                 | MNVR                 | MNVR                 |
      | Ürünler   | MNVR Pro             | MNVR Pro             | MNVR Pro             |
      | Ürünler   | MNVR AI              | MNVR AI              | MNVR AI              |
      | Ürünler   | Araç Takip Cihazı    | Araç Takip Cihazı    | Araç Takip Cihazı    |
      | Ürünler   | Cam Tracker          | Cam Tracker          | Cam Tracker          |
      | Ürünler   | Akıllı Direk Sistemi | Akıllı Direk Sistemi | Akıllı Direk Sistemi |


  @Cozumler
  Scenario Outline: çözümler
    When : kullanıcı cozumler "<AnaBaslIkk>" üzerine gelir
    And  : cozumler seceneklerinde hover over yapar "<AltBaslIkk>"
    And  : kullanıcı alt basliklara tiklarr "<Tıklarlar>"
    And  : alt basliklar "<Metin>" ile görünürr olmalıdırr
    Then : cozumler  "<AnaBaslIkk>" ve   "<AltBaslIkk>" renkleri değişmelidir


    Examples:
      | AnaBaslIkk | AltBaslIkk                   | Tıklarlar                    | Metin                        |
      | Çözümler   | Taksi ve Özel Araçlar        | Taksi ve Özel Araçlar        | Taksi ve Özel Araçlar        |
      | Çözümler   | Minibüsler ve Midibüsler     | Minibüsler ve Midibüsler     | Minibüsler ve Midibüsler     |
      | Çözümler   | Şehirler Arası Otobüsler     | Şehirler Arası Otobüsler     | Şehirler Arası Otobüsler     |
      | Çözümler   | Zırhlı Taşıma Araçları       | Zırhlı Taşıma Araçları       | Zırhlı Taşıma Araçları       |
      | Çözümler   | Okul Servisleri              | Okul Servisleri              | Okul Servisleri              |
      | Çözümler   | Güvenlik Kuvvetleri Araçları | Güvenlik Kuvvetleri Araçları | Güvenlik Kuvvetleri Araçları |
      | Çözümler   | Yük ve Eşya Taşıyan Araçlar  | Yük ve Eşya Taşıyan Araçlar  | Yük ve Eşya Taşıyan Araçlar  |
      | Çözümler   | Belediye ve Halk Otobüsleri  | Belediye ve Halk Otobüsleri  | Belediye ve Halk Otobüsleri  |

Scenario: Araç Bazlı Rapor Menüsü
  When  kullanıcı enter düğmesini tıklar
  And : kullanıcı girer <kullanıcıadı> ve <sifre>
   |kullanıcıadı|demomovita|
   |sifre       |1192movita|

  And : kullanıcı tıklar giris yap butonuna

