public class Main {
    public static void main(String[] args) {
        double[] numbers = {2.0, 3.0, 4.0, 5.0};
        double harmonicMean = calculateHarmonicMean(numbers);
        System.out.println("Harmonik Ortalama: " + harmonicMean);
    }
    public static double calculateHarmonicMean(double[] numbers) {
        double reciprocalsSum = 0.0;

        for (double number : numbers) {
            reciprocalsSum += 1.0 / number;
        }

        return numbers.length / reciprocalsSum;
    }


}