public class HesapOzeti {
public static void main(String[] args) {
    String urun1 = "Kalem";
    int miktar1 = 3;
    double fiyat1 = 12.5;

    String urun2 = "Defter";
    int miktar2 = 2;
    double fiyat2 = 25.0;

    String urun3 = "Silgi";
    int miktar3 = 1;
    double fiyat3 = 5.5;

    double toplam = (miktar1 * fiyat1) + (miktar2 * fiyat2) + (miktar3 * fiyat3);

    System.out.println("----------------------------------------");
    System.out.println("Ürün\t Miktar\t Fiyat\t Toplam");
    System.out.println("----------------------------------------");
    System.out.println(urun1 + "\t " + miktar1 + "\t " + fiyat1 + "\t " + (miktar1 * fiyat1));
    System.out.println(urun2 + "\t " + miktar2 + "\t " + fiyat2 + "\t " + (miktar2 * fiyat2));
    System.out.println(urun3 + "\t " + miktar3 + "\t " + fiyat3 + "\t " + (miktar3 * fiyat3));
    System.out.println("----------------------------------------");
    System.out.println("Genel Toplam: " + toplam + " TL");
}

}
