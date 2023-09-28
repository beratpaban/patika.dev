public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 4},
                {5, 6, 4}
        };

        System.out.println("Matris:");
        printMatrix(matrix);

        int[][] transpose = findTranspose(matrix);

        System.out.println("Transpoze:");
        printMatrix(transpose);
    }

    public static void printMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] findTranspose(int[][] mat) {
        int numRows = mat.length;
        int numCols = mat[0].length;
        int[][] transpose = new int[numCols][numRows];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                transpose[j][i] = mat[i][j];
            }
        }

        return transpose;
    }
}