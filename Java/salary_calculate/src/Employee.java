public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    public double tax(double salary){
        double tax;
        if(salary<1000){
            tax =0;
        }
        else {
            tax=salary*0.03;
        }

        return tax;
    }
    public  int bonus(int workHours){
        int extraHours;
        int bonus;
        if(workHours>40){
            extraHours=workHours-40;
            bonus=extraHours*30;
        }else {
            bonus=0;
        }
        return bonus;
    }

    public double raiseSalary(int hireYear,double salary){
        int currentYear=2021;
        double salaryRaise=0;
        if(currentYear-hireYear<10){
            salaryRaise=salary*0.05;
        } else if (currentYear-hireYear>9&&currentYear-hireYear<20) {
            salaryRaise=salary*0.10;
        }else if(currentYear-hireYear>19){
            salaryRaise=salary*0.15;
        }
        return salaryRaise;
    }

    public void print(){
        System.out.println("Adı: "+name);
        System.out.println("Maaşı: "+salary);
        System.out.println("Çalışma saati: "+workHours);
        System.out.println("İşe başlangıç yılı: "+hireYear);
        System.out.println("Vergi: "+tax(salary));
        System.out.println("Bonus: "+bonus(workHours));
        System.out.println("Maaş Artışı: "+raiseSalary(hireYear,salary));
        System.out.println("Vergiler ve toplam maaş: "+(salary+bonus(workHours)-tax(salary)));
        System.out.println("Toplam Maaş: "+(salary+bonus(workHours)+raiseSalary(hireYear,salary)-tax(salary)));
    }

}
