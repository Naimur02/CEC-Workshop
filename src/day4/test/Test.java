package day4.test;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Azmi";
        person1.semester = "4th";
        person1.balance = 50;

        Person person2 = new Person();
        person2.name = "Naimur";
        person2.semester = "4th";
        person2.balance = 70;

        Person person3 = new Person();
        person3.name = "Jubair";
        person3.semester = "7th";
        person3.balance = 100;

        Person person4 = new Person();
        person4.name = "Sabrina";
        person4.semester = "3rd";
        person4.balance = 50;


        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);

        Person sum =new Person();
        System.out.print("Total Sum: "+sum.sum(person1.balance,person2.balance,person3.balance,person4.balance));

    }
}
