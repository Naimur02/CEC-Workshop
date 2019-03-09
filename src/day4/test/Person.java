package day4.test;

public class Person {

    String name;
    String semester;
    int balance;
    int sum(int num1,int num2,int num3,int num4){
        return num1+num2+num3+num4;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", semester='" + semester + '\'' +
                ", balance=" + balance +
                '}';
    }

}
