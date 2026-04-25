# Ödev 3 - Uçuş Yönetim Sistemi

## Açıklama
Bu proje, uçuşların ve pilotların yönetimi için nesne yönelimli bir sistem tasarımını içermektedir.

## Sınıflar
- **Airline** - Hava yolu şirketini temsil eder, uçakları, pilotları ve uçuşları yönetir
- **Flight** - Uçuşu temsil eder, benzersiz kimliği, kalkış/iniş havaalanı ve saatleri vardır
- **Aircraft** - Uçağı temsil eder, çalışır veya onarım durumunda olabilir
- **AircraftType** - Uçak tipini temsil eder, kaç pilota ihtiyaç duyduğunu tutar
- **Airport** - Havaalanını temsil eder, benzersiz kimliği ve ismi vardır
- **Pilot** - Pilotu temsil eder, deneyim seviyesi vardır

## İlişkiler
- Hava yolu şirketinin uçakları, pilotları ve uçuşları vardır
- Her uçuşun bir pilotu ve yardımcı pilotu vardır
- Her uçuşun kalkış ve iniş havaalanı vardır
- Her uçak bir tipe sahiptir
