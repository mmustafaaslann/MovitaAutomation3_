Feature: Login Page

  Scenario: Login Criterias
    When users navigate to "https://movita.com.tr//"
    Then Griş Yap butonuna Hoverover ol
    And  Griş Yap Butonunu renginin değiştiğini assert et
    And Griş Yap Butonunun clicable olduğunu assert et
    And Griş Yap Butoonuna click et
    Then Sayfada "Şifrenizi mi unuttunuz?" yazısını assert et
    And Kullanıcı kutusu veya şifre hatalı girildiğinde"Kullanıcı Adı Yada Şifre Hatalı" Görüldüğünü assert et

      | Kullanıcı1 Adı | Sifre      |
      | demomov        | 1292movita |
      | demomivita1    | 1192mov    |


    Then Başarılı giriş
      | Kullanıcı | demomovita |
      | Sifre2    | 1192movita |

    And Kullanıcı sayfasına girildiğini doğrula
    Then Kullanıcı adı kutusunu boş bırak şifre yaz Griş Yap tıkla
    And Kullanıcı kutusu altında "Lütfen kullanıcı adı girin!" assert et
    Then Kullanıcı Kutusunu doldur Sifre kutusunu boş bırak Griş yap tıkla
    And Şifre kutusu altında "Lütfen şifre girin!" assert et
    Then Türkçe dil seçeneğine click
    And Griş Yap Buttonuna click et
    And Sayfanın Türkçe olduğunu assert et
    Then English dil seçeneğine click
    And Giriş yap Buttonuna Click et
    And Sayfanın English olduğunu assert et

