public class Main {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Mahmut Hoca", "0532 532 32 32", "MAT");
        Teacher t2=new Teacher("Fatma Hoca", "0532 532 32 32", "FZK");
        Teacher t3=new Teacher("Ali Hoca", "0532 532 32 32", "KMY");
        Teacher t4=new Teacher("Ayşe Hoca", "0532 532 32 32", "BIO");
        Teacher t5=new Teacher("Mehmet Hoca", "0532 532 32 32", "TRH");

        Course matematik=new Course("Matematik", "MAT101", "MAT");
        Course fizik=new Course("Fizik", "FZK101", "FZK");
        Course kimya=new Course("Kimya", "KMY101", "KMY");
        Course biyoloji=new Course("Biyoloji", "BIO101", "BIO");
        Course tarih=new Course("Tarih", "TRH101", "TRH");

        matematik.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);
        biyoloji.addTeacher(t4);
        tarih.addTeacher(t5);

        Student s1=new Student("İnek Şaban", "123", "4", matematik, fizik, kimya);

        s1.addBulkExamNote(50,78,50,  20,10,80);
        s1.isPass();
    }
}