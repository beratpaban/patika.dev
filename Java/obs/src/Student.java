public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    int classes;
    double avarage;
    boolean isPass;
    Student(String name, String stuNo,String classes, Course c1, Course c2, Course c3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=Integer.parseInt(classes);
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.avarage=0.0;
        this.isPass=false;
    }
    void addBulkExamNote(int note1, int note2, int note3, int verbalNote1, int verbalNote2, int verbalNote3){
        if(note1>=0 && note1<=100){
            c1.note=note1;
        }
        if(note2>=0 && note2<=100){
            c2.note=note2;
        }
        if(note3>=0 && note3<=100){
            c3.note=note3;
        }
        if(verbalNote1>=0 && verbalNote1<=100){
            c1.verbalNote=verbalNote1;
        }
        if(verbalNote2>=0 && verbalNote2<=100){
            c2.verbalNote=verbalNote2;
        }
        if(verbalNote3>=0 && verbalNote3<=100){
            c3.verbalNote=verbalNote3;
        }
    }

    void isPass(){
        this.avarage=(c1.note*0.8+c1.verbalNote*0.2+c2.note*0.8+c2.verbalNote*0.2+c3.note*0.8+c3.verbalNote*0.2)/3.0;
        if(this.avarage>=55){
            System.out.println("Sınıfı Geçti");
        }
        else{
            System.out.println("Sınıfta Kaldı");
        }
    }
    void printNote(){
        System.out.println(c1.name+" Notu:\t"+c1.note);
        System.out.println(c2.name+" Notu:\t"+c2.note);
        System.out.println(c3.name+" Notu:\t"+c3.note);
    }
}
