import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=scanner.nextInt();
        System.out.print("Enter r: ");
        int r=scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= r; i++) {
            result *= n - r + i;
            result /= i;
        }
        System.out.println(result);


    }
}