public class Main {
    public static void main(String[] args) {
        Fighter savas= new Fighter("Savaş", 10, 100, 100, 30);
        Fighter kaan= new Fighter("Kaan", 20, 95, 95, 50);
        Ring r = new Ring(savas,kaan , 90, 100);
        r.run();
    }
}