# Rapor

**Ad Soyad:** Muhammed Doruk Karataş
**Numara:** 93

## 1. Algoritma Açıklaması
<!-- Programın nasıl çalıştığını adım adım, kendi cümlelerinizle yazın. -->
Kullanıcdan sayı istenir
sayı 0 değilse devam edilir
0 girildiğinde oluşan bütün sayıların özellikleri yazılır


## 2. Girdi - İşlem - Çıktı

**Girdiler:**sayi
-

**İşlemler:** ortalama alma 
-

**Çıktılar:**
- tek çift toplam sayı ....

## 3. Sözde Kod (Pseudocode)

```
toplamAdet = 0
pozitifAdet = 0
negatifAdet = 0
tekAdet = 0
ciftAdet = 0
toplam = 0

enBuyuk = 0
enKucuk = 0
ilkSayi = DOĞRU

pozitifToplam = 0
asalAdet = 0

DÖNGÜ (DOĞRU)
    OKU sayi

    EĞER sayi == 0 İSE
        DÖNGÜDEN_ÇIK
    BİTİR_EĞER

    EĞER ilkSayi == DOĞRU İSE
        enBuyuk = sayi
        enKucuk = sayi
        ilkSayi = YANLIŞ
    DEĞİLSE
        EĞER sayi > enBuyuk İSE enBuyuk = sayi
        EĞER sayi < enKucuk İSE enKucuk = sayi
    BİTİR_EĞER

    toplam = toplam + sayi
    toplamAdet = toplamAdet + 1

    EĞER sayi > 0 İSE
        pozitifAdet = pozitifAdet + 1
        pozitifToplam = pozitifToplam + sayi
    DEĞİLSE EĞER sayi < 0 İSE
        negatifAdet = negatifAdet + 1
    BİTİR_EĞER

    EĞER sayi MOD 2 == 0 İSE
        ciftAdet = ciftAdet + 1
    DEĞİLSE
        tekAdet = tekAdet + 1
    BİTİR_EĞER

    // Asal Kontrolü
    asalMi = DOĞRU
    EĞER sayi <= 1 İSE
        asalMi = YANLIŞ
    DEĞİLSE
        İÇİN i = 2'den (sayi / 2)'ye kadar
            EĞER sayi MOD i == 0 İSE
                asalMi = YANLIŞ
                DÖNGÜDEN_ÇIK
            BİTİR_EĞER
        DÖNGÜ_BİTİR
    BİTİR_EĞER

    EĞER asalMi == DOĞRU İSE
        asalAdet = asalAdet + 1
    BİTİR_EĞER

    // Mükemmel Sayı Kontrolü
    mukemmelMi = YANLIŞ
    EĞER sayi > 1 İSE
        bolenToplami = 0
        İÇİN i = 1'den (sayi / 2)'ye kadar
            EĞER sayi MOD i == 0 İSE
                bolenToplami = bolenToplami + i
            BİTİR_EĞER
        DÖNGÜ_BİTİR
        EĞER bolenToplami == sayi İSE
            mukemmelMi = DOĞRU
        BİTİR_EĞER
    BİTİR_EĞER

    // Basamak Sayısı
    temp = MUTLAK(sayi)
    basamakSayisi = 0
    EĞER temp == 0 İSE
        basamakSayisi = 1
    DEĞİLSE
        DÖNGÜ (temp > 0)
            basamakSayisi = basamakSayisi + 1
            temp = temp / 10
        DÖNGÜ_BİTİR
    BİTİR_EĞER

DÖNGÜ_BİTİR

EĞER toplamAdet == 0 İSE
    YAZDIR "Uyarı: Hiç sayı girilmeden program sonlandırıldı."
DEĞİLSE
    ortalama = toplam / toplamAdet
    pozitifOrtalama = (pozitifAdet > 0) ? (pozitifToplam / pozitifAdet) : 0
    fark = enBuyuk - enKucuk

    YAZDIR "Toplam Adet:", toplamAdet
    YAZDIR "Pozitif Adet:", pozitifAdet
    YAZDIR "Negatif Adet:", negatifAdet
    YAZDIR "Tek Adet:", tekAdet
    YAZDIR "Çift Adet:", ciftAdet
    YAZDIR "En Büyük:", enBuyuk
    YAZDIR "En Küçük:", enKucuk
    YAZDIR "Fark:", fark
    YAZDIR "Toplam:", toplam
    YAZDIR "Ortalama:", ortalama
    YAZDIR "Pozitif Ortalama:", pozitifOrtalama
    YAZDIR "Asal Adet:", asalAdet
BİTİR_EĞER

BİTİR

```

## 4. Akış Şeması

![Akış Şeması](docs/akis-semasi.png)

## 5. Test Senaryoları (en az 8)

| No | Girilen sayılar | Beklenen sonuç | Programın sonucu | Doğru mu? |
|---|---|---|---|---|
| 1 |  | | |
| 2 | | | | |
| 3 | | | | |
| 4 | | | | |
| 5 | | | | |
| 6 | | | | |
| 7 | | | | |
| 8 | | | | |

## 6. Ek Görevler (Opsiyonel)
<!-- Max-min farkı, pozitiflerin ortalaması, asal sayı adedi için örnek çıktılar. -->

