# Ödev 5 - Asansör Simülasyon Sistemi

## Açıklama
Bu proje, 12 katlı bir ofis binasındaki 5 asansörün işlemlerini modelleyen bir simülasyon sistemidir.

## Sınıflar
- **Building** - 12 katlı binayı temsil eder, 5 asansör ve 12 kata sahiptir
- **Elevator** - Asansörü temsil eder, kapasitesi 6 kişidir
- **ElevatorDoor** - Asansör kapısını temsil eder, açılıp kapanabilir
- **ControlPanel** - Kontrol panelini temsil eder, hedef butonları ve acil buton içerir
- **FloorIndicatorLight** - Asansör içindeki kat gösterge ışığını temsil eder
- **Floor** - Katı temsil eder, kapılar, ziller ve çağrı butonları içerir
- **FloorDoor** - Kattaki asansör kapısını temsil eder
- **ArrivalBell** - Asansör varış zilini temsil eder
- **SignalLight** - Kapı üzerindeki sinyal ışığını temsil eder
- **CallButton** - Asansör çağrı butonunu temsil eder
- **Simulator** - Simülasyonu yönetir, yolcu oluşturur ve asansör atar
- **Scheduler** - En yakın asansörü seçer ve göreve atar
- **Passenger** - Yolcuyu temsil eder, kalkış ve varış katı vardır
- **Clock** - Simülasyon saatini tutar, zaman damgası üretir

## Özellikler
- 5 asansör, 12 kat simülasyonu
- En yakın asansör atama algoritması
- Rastgele yolcu oluşturma
- Zaman damgalı olay kaydı

