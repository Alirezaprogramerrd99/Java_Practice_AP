package MidTermExersize;
import Hobys.SwapTest;

class BirthDay{
    private int year;
    private int month;
    private int day;

    BirthDay(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setYear(int year){
        this.year = year;
    }

    public String toString(){
        return "\nyear: " + year + "\nmonth: " + month + "\nday: " + day;
    }

}

class Student{
    private long id;
    private BirthDay birthDay;

    Student(long id, int year, int month, int day){
        this.id = id;
        this.birthDay = new BirthDay(year, month, day);
    }

    public BirthDay getBirthDay() {
        return birthDay;
    }
}

public class ImmutableExample {

    public static void main(String[] args) {

        Student s1 = new Student(12344,1999, 4, 11);
        System.out.println(s1.getBirthDay().toString());
        System.out.println("------------------------------");
        BirthDay birth = s1.getBirthDay();  // can controles the year , month , day of student s1.
        int number1 = 15,number2 = 10;
        SwapTest s = new SwapTest(number1, number2);
        SwapTest.swapNumbers(s);
        System.out.println(s.getNumber1());


        birth.setYear(2001);

        System.out.println(s1.getBirthDay().toString());
    }
}
