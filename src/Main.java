import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplamAdet = 0;
        int pozitifAdet = 0;
        int negatifAdet = 0;
        int tekAdet = 0;
        int ciftAdet = 0;
        long toplam = 0;
        
        int enBuyuk = 0;
        int enKucuk = 0;
        boolean ilkSayi = true;

        long pozitifToplam = 0;
        int asalAdet = 0;

        while (true) {
            int sayi = scanner.nextInt();

            if (sayi == 0) {
                break;
            }

            if (ilkSayi) {
                enBuyuk = sayi;
                enKucuk = sayi;
                ilkSayi = false;
            } else {
                if (sayi > enBuyuk) enBuyuk = sayi;
                if (sayi < enKucuk) enKucuk = sayi;
            }

            toplam += sayi;
            toplamAdet++;

            if (sayi > 0) {
                pozitifAdet++;
                pozitifToplam += sayi;
            } else if (sayi < 0) {
                negatifAdet++;
            }

            if (sayi % 2 == 0) {
                ciftAdet++;
            } else {
                tekAdet++;
            }

            boolean asalMi = true;
            if (sayi <= 1) {
                asalMi = false;
            } else {
                for (int i = 2; i <= sayi / 2; i++) {
                    if (sayi % i == 0) {
                        asalMi = false;
                        break;
                    }
                }
            }
            if (asalMi) {
                asalAdet++;
            }

            boolean mukemmelMi = false;
            if (sayi > 1) {
                int bolenToplami = 0;
                for (int i = 1; i <= sayi / 2; i++) {
                    if (sayi % i == 0) {
                        bolenToplami += i;
                    }
                }
                if (bolenToplami == sayi) {
                    mukemmelMi = true;
                }
            }

            int temp = sayi;
            if (temp < 0) {
                temp = -temp;
            }
            int basamakSayisi = 0;
            if (temp == 0) {
                basamakSayisi = 1;
            } else {
                while (temp > 0) {
                    basamakSayisi++;
                    temp /= 10;
                }
            }

            System.out.println("-> Asal: " + (asalMi ? "Evet" : "Hayır") + 
                               ", Mükemmel: " + (mukemmelMi ? "Evet" : "Hayır") + 
                               ", Basamak: " + basamakSayisi);
        }

        scanner.close();

        if (toplamAdet == 0) {
            System.out.println("Uyarı: Hiç sayı girilmeden program sonlandırıldı.");
            return;
        }

        double ortalama = (double) toplam / toplamAdet;
        double pozitifOrtalama = (pozitifAdet > 0) ? (double) pozitifToplam / pozitifAdet : 0;
        int fark = enBuyuk - enKucuk;

        System.out.println("\n=== SONUÇ RAPORU ===");
        System.out.println("Toplam Adet: " + toplamAdet);
        System.out.println("Pozitif Adet: " + pozitifAdet);
        System.out.println("Negatif Adet: " + negatifAdet);
        System.out.println("Tek Adet: " + tekAdet);
        System.out.println("Çift Adet: " + ciftAdet);
        System.out.println("En Büyük: " + enBuyuk);
        System.out.println("En Küçük: " + enKucuk);
        System.out.println("Fark: " + fark);
        System.out.println("Toplam: " + toplam);
        System.out.println("Ortalama: " + ortalama);
        System.out.println("Pozitif Ortalama: " + pozitifOrtalama);
        System.out.println("Asal Adet: " + asalAdet);
    }
}

        scanner.close();
    }
}
