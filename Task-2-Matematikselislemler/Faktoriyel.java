public class Faktoriyel {
    public static void main(String[] args) {
    int sonuc = 1;

    System.out.println("5! = 5 × 4 × 3 × 2 × 1");

    sonuc = sonuc * 5;
    System.out.println("Adım 1: 1 × 5 = " + sonuc);

    sonuc = sonuc * 4;
    System.out.println("Adım 2: 5 × 4 = " + sonuc);

    sonuc = sonuc * 3;
    System.out.println("Adım 3: 20 × 3 = " + sonuc);

    sonuc = sonuc * 2;
    System.out.println("Adım 4: 60 × 2 = " + sonuc);

    sonuc = sonuc * 1;
    System.out.println("Adım 5: 120 × 1 = " + sonuc);

    System.out.println("Sonuç: " + sonuc);
}

}
