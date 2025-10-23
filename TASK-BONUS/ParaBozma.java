public class ParaBozma {
    public static void main(String[] args) {
    int miktar = 278;

    int yuz = miktar / 100;
    miktar %= 100;

    int elli = miktar / 50;
    miktar %= 50;

    int yirmi = miktar / 20;
    miktar %= 20;

    int bes = miktar / 5;
    miktar %= 5;

    int iki = miktar / 2;
    miktar %= 2;

    int bir = miktar;

    System.out.println("278 TL = " + yuz + "x100, " + elli + "x50, " + yirmi + "x20, " + bes + "x5, " + iki + "x2, " + bir + "x1");
}

}
