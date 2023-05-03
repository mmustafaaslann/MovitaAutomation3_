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
