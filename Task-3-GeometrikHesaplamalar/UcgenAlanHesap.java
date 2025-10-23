public class UcgenAlanHesap {
    public static void main(String[] args) {
    double a = 3, b = 4, c = 5;
    double s = (a + b + c) / 2; // yarı çevre
    double alan = Math.sqrt(s * (s - a) * (s - b) * (s - c));

    System.out.println("Kenarlar: a=" + a + ", b=" + b + ", c=" + c);
    System.out.println("Yarı çevre (s): " + s);
    System.out.println("Alan: " + alan);
}

}
