public class Main {
    public static void main(String[] args) {
        int[] arr={10, 20, 20, 10, 10, 20, 5, 20};
        int n = arr.length;
        int[] duplicate = new int[n];

        for (int i = 0; i < n; i++) {
            if (duplicate[i] == -1) {
                continue; 
            }

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    duplicate[j] = -1; 
                }
            }

            duplicate[i] = count;
        }
        for (int i = 0; i < n; i++) {
            if (duplicate[i] != -1) {
                System.out.println(arr[i] + " sayısı " + duplicate[i] + " kere tekrar edildi.");
            }
        }
    }
}