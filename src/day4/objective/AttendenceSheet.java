package day4.objective;

public class AttendenceSheet {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.name="Naimur";
        student1.id=1813344;
        student1.semester="1st";
        student1.location="Bashundhara";

        Student student2 = new Student();

        student2.name="Sakib";
        student2.id=1813345;
        student2.semester="2nd";
        student2.location="Bashundhara";

        System.out.println(student1);
        System.out.println(student2);

        Teacher teacher1 = new Teacher();
        teacher1.name= "Galib";
        teacher1.id = 13533222;
        teacher1.phone = 974577498;
        teacher1.initial="NMP";

        System.out.println(teacher1);

    }
}
