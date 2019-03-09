package day4.objective;

public class Student {

        String name;
        int id;
        String location;
        String semester;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", location='" + location + '\'' +
                ", semester='" + semester + '\'' +
                '}';
    }
}
