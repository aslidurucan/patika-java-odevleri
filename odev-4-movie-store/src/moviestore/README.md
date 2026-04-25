# Ödev 4 - Online Film Satış/Kiralama Sistemi

## Açıklama
Bu proje, online film satan ve kiralayan bir uygulamanın nesne yönelimli tasarımını içermektedir.

## Sınıflar
- **User** - Temel kullanıcı sınıfı, film satın alabilir ve talep edebilir
- **Subscriber** - User'dan türüyor, kredisi ile film kiralayabilir
- **Movie** - Filmi temsil eder, satış ve kiralama fiyatı vardır
- **Subscription** - Abonelik bilgisini tutar
- **Credit** - Kullanıcının satın aldığı krediyi temsil eder
- **Purchase** - Film satın alma işlemini temsil eder
- **Rental** - Film kiralama işlemini temsil eder, sadece aboneler kiralayabilir
- **MovieRequest** - Mevcut olmayan filmlerin talep edilmesini sağlar

## Özellikler
- Kullanıcılar film satın alabilir
- Aboneler kredi ile film kiralayabilir
- Mevcut olmayan filmler talep edilebilir
- Kredi sistemi ile ödeme yapılabilir

