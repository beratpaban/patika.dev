public class Main {
    static boolean isPalindrome(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if(number==reverseNumber){
            System.out.println(number+" sayısı palindromik bir sayıdır.");
            return true;
        }else{
            System.out.println(number+" sayısı palindromik bir sayı değildir.");
            return false;
        }
    }
    public static void main(String[] args) {

        System.out.println(isPalindrome(12321));
    }
}