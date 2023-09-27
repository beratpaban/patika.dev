public class Main {
    public static void main(String[] args) {
        int size = 7;

        char[][] bArray = new char[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || i == size / 2 || j == 0)
                    bArray[i][j] = '*';
                else
                    bArray[i][j] = ' ';
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(bArray[i][j]);
            }
            System.out.println();
        }
    }
}