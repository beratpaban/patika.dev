import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int birthYear;
        System.out.print("Lütfen Doğum Yılınız Giriniz: ");
        birthYear=scan.nextInt();
        if (birthYear%12==0){
            System.out.println("Çin Zodyağı Burcunuz: Maymun");
        } else if (birthYear%12==1){
            System.out.println("Çin Zodyağı Burcunuz: Horoz");
        } else if (birthYear%12==2){
            System.out.println("Çin Zodyağı Burcunuz: Köpek");
        } else if (birthYear%12==3){
            System.out.println("Çin Zodyağı Burcunuz: Domuz");
        } else if (birthYear%12==4){
            System.out.println("Çin Zodyağı Burcunuz: Fare");
        } else if (birthYear%12==5){
            System.out.println("Çin Zodyağı Burcunuz: Öküz");
        } else if (birthYear%12==6){
            System.out.println("Çin Zodyağı Burcunuz: Kaplan");
        } else if (birthYear%12==7){
            System.out.println("Çin Zodyağı Burcunuz: Tavşan");
        } else if (birthYear%12==8){
            System.out.println("Çin Zodyağı Burcunuz: Ejderha");
        } else if (birthYear%12==9){
            System.out.println("Çin Zodyağı Burcunuz: Yılan");
        } else if (birthYear%12==10){
            System.out.println("Çin Zodyağı Burcunuz: At");
        } else if (birthYear%12==11){
            System.out.println("Çin Zodyağı Burcunuz: Koyun");
        }else {
            System.out.println("Hatalı Giriş Yaptınız!");
        }

    }
}