public class Main {
    public static void main(String[] args) {
        int n = 15;
        recursiveOperation(n, n);
    }
    public static void recursiveOperation(int n, int originalN) {
        if (n <= 0) {
            System.out.println("Son Değer: " + n);
            n += 5;
            System.out.println("Son Değer: " + n);
        } else {
            System.out.println("Son Değer: " + n);
            n -= 5;
            recursiveOperation(n, originalN);
            n += 5;
            System.out.println("Son Değer: " + n);
        }
        if (n == originalN) {
            System.out.println("İşlem Tamamlandı");
        }
    }
}