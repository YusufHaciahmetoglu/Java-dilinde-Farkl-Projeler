import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GunlukSoruTakipProgrami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> soruTakip = new HashMap<>();

        boolean devam = true;
        while (devam) {
            System.out.println("G�nl�k Soru Takip Program�na Ho�geldiniz.....");
            System.out.println("Dersler...");
            System.out.println("Say�sal");
            System.out.println("S�zel");
            System.out.print("Hangi alanda secmek istersiniz? (say�sal/s�zel) ");
            String alan = scanner.nextLine();

            if (alan.equalsIgnoreCase("sayisal") || alan.equalsIgnoreCase("sozel")) {
                System.out.print("Kac soru C�zmeyi hedefliyorsunuz? ");
                int hedef = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Başlangıçta belirlediğin hedef soru sayısını girin: ");
                int baslangic = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Kaç soru çözdünüz? ");
                int cevap = scanner.nextInt();
                scanner.nextLine();

                soruTakip.put(alan, cevap);

                int kalanSoru = hedef - cevap;

                if (cevap >= baslangic) {
                    if (cevap >= hedef) {
                        System.out.println("Tebrikler! Hedefinize ulaştınız.");
                    } else {
                        System.out.println("Hedeflediğin soru sayısını geçtiniz. Kalan soru sayısı: " + kalanSoru);
                    }
                } else {
                    System.out.println("Maalesef, hedefinize ulaşamadınız. Kalan soru sayısı: " + kalanSoru);
                }
            } else {
                System.out.println("Geçersiz bir seçim yaptınız.");
                scanner.nextLine();
                continue;
            }

            System.out.print("Başka bir alanda çalışmak istiyor musunuz? (evet/hayır) ");
            String cevap = scanner.nextLine();

            if (cevap.equalsIgnoreCase("hayır")) {
                devam = false;
            }
        }

        System.out.println("Günlük soru takip sonuçları:");
        for (Map.Entry<String, Integer> entry : soruTakip.entrySet()) {
            System.out.println(entry.getKey() + " alanda " + entry.getValue() + " soru çözüldü.");
        }

        scanner.close();
    }
}
