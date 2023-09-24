import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double km;
        double costPerKm=0.1;
        double totalPrice;
        byte type;
        int age;
        boolean isError=false;


        System.out.print("Lütfen mesafeyi giriniz: ");
        km=scan.nextDouble();

        System.out.print("Lütfen yaşınızı giriniz: ");
        age=scan.nextInt();

        System.out.print("Sadece gidiş için ise '1' Gidiş-Geliş için ise '2' yazınız:");
        type= scan.nextByte();

        totalPrice=km*costPerKm;

        if (age<12){
            totalPrice*=0.5;
        } else if (age>12 && age<24) {
            totalPrice*=0.9;
        }else if(age>65){
            totalPrice*=0.7;
        }

        switch (type) {
            case 2 -> {
                totalPrice *= 0.8;
                totalPrice *= 2;
            }
            case 1 -> {
            }
            default -> isError = true;
        }
        if(!(km>=0)){
            isError=true;
        }
        if (isError){
            System.out.print("Hatalı veri girdiniz!");
        }
        else {
            System.out.println("Toplam tutar: "+totalPrice+"₺");
        }
    }
}