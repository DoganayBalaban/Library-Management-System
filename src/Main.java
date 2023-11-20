import java.util.Random;
import java.util.Scanner;


/* DOĞANAY BALABAN 1220505057 */

public class Main {
    public static void main(String[] args) {
        /*Kullanıcıdan veri almak için scanner, Kütüphane işlemleri için sınıf, rastgele sayı üretmek için random.*/
        Scanner scanner = new Scanner(System.in);
        LibraryManagement lM = new LibraryManagement();
        Random random = new Random();

        /* Menü işlemleri için switch case yapısı */
        while (true) {
            System.out.println("\nKütüphane Yönetim Sistemi Menüsü:");
            System.out.println("1. Kitap Ekle");
            System.out.println("2. Kitap Çıkar");
            System.out.println("3. Kitapları Listele");
            System.out.println("4. Üye Ekle");
            System.out.println("5. Üye Çıkar");
            System.out.println("6. Üyeleri Listele");
            System.out.println("7. Görevli Ekle");
            System.out.println("8. Görevli Çıkar");
            System.out.println("9. Görevlileri Listele");
            System.out.println("10. Kitap Ödünç Ver");
            System.out.println("11. Kitap İade Al");
            System.out.println("12. Ödünç Alınan Kitapları Takip Et");
            System.out.println("0. Çıkış");

            System.out.print("Lütfen bir seçenek girin: ");
            int secim = scanner.nextInt();

            switch (secim) {
                /* Gerekli caselere göre görevler doldurulur. */
                case 1:
                    System.out.print("Kitap Adı: ");
                    String kitapAdi = scanner.next();
                    System.out.print("Yazar: ");
                    String yazar = scanner.next();
                    LibraryManagement.addBook(random.nextInt(), kitapAdi, yazar);
                    break;
                case 2:
                    System.out.print("Çıkarılacak Kitap Adı: ");
                    String cikarilacakKitapAdi = scanner.next();
                    LibraryManagement.deleteBook(cikarilacakKitapAdi);
                    break;
                case 3:
                    LibraryManagement.allBook();
                    break;
                case 4:
                    System.out.print("Üye Adı: ");
                    String uyeAdi = scanner.next();
                    System.out.print("Üye Yaşı: ");
                    Integer uyeYas = scanner.nextInt();
                    System.out.print("Üye Numarası: ");
                    int uyeNo = scanner.nextInt();
                    LibraryManagement.addMember(uyeNo, uyeAdi, uyeYas);
                    break;
                case 5:
                    System.out.print("Çıkarılacak Üye Numarası: ");
                    int cikarilacakUyeNo = scanner.nextInt();
                    LibraryManagement.removeMember(cikarilacakUyeNo);
                    break;
                case 6:
                    LibraryManagement.allmember();
                    break;
                case 7:
                    System.out.print("Görevli Adı: ");
                    String gorevliAdi = scanner.next();
                    System.out.print("Görevli Yaşı: ");
                    Integer gorevliYasi = scanner.nextInt();
                    System.out.print("Görevli Maaşı: ");
                    Double gorevliMaas = scanner.nextDouble();
                    System.out.print("Görevli Görevi: ");
                    String gorevliGorev = scanner.next();
                    LibraryManagement.addEmployee(random.nextInt(), gorevliAdi, gorevliYasi, gorevliMaas, gorevliGorev);
                    break;
                case 8:
                    System.out.print("Çıkarılacak Görevli Adı: ");
                    String cikarilacakGorevliAdi = scanner.next();
                    System.out.print("Çıkarılacak Görevlinin Görevi: ");
                    String cikarilacakGorevliGorevi = scanner.next();
                    LibraryManagement.deleteEmployee(cikarilacakGorevliAdi, cikarilacakGorevliGorevi);
                    break;
                case 9:
                    LibraryManagement.allEmployee();
                    break;
                case 10:
                    System.out.print("Üye Numarası: ");
                    int oduncUyeNo = scanner.nextInt();
                    System.out.print("Kitap Adı: ");
                    String oduncKitapAdi = scanner.next();
                    LibraryManagement.giveBook(oduncUyeNo, oduncKitapAdi);
                    break;
                case 11:
                    System.out.print("İade Edilecek Üye Numarası: ");
                    int iadeUyeNo = scanner.nextInt();
                    LibraryManagement.receiveBook(iadeUyeNo);
                    break;
                case 12:
                    LibraryManagement.followOduncBook();
                    break;
                case 0:
                    System.out.println("Çıkış yapılıyor...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Geçersiz seçenek. Lütfen tekrar deneyin.");
            }
        }
    }
}