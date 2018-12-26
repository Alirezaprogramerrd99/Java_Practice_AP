package Hobys;

public class Person {

    protected String name;
    protected int hight;

    Person(String name, int hight) {
        this.name = name;
        this.hight = hight;
    }

    public void Talk() {
        System.out.println("Hello iam person");
    }

    public static void main(String[] args) {
        Person p = new Student("ali",178, 12, 96243097);  // up casting.
        System.out.println(p.toString());
        p.Talk();
        ((Student) p).Specialst(); // down casting.
        Person c = new Child2("mk", 167, 19, 9532456, 23);
        ((Child2) c).Specialst();

        // we can also write this:
        // ((Student) c).Specialst();

        System.out.println(c.toString());
    }

}

class Student extends Person {

    protected int avg;
    protected long sid;
    protected static int NUMBER_OF_STS;

    Student(String name, int hight, int avg, long sid) {

        super(name, hight);
        this.avg = avg;
        this.sid = sid;
        NUMBER_OF_STS++;
    }

    @Override
    public void Talk() {  // will acouar dynamic binding.
        System.out.println("Im a Student!");
    }

    public String toString() {
        return "The student number " + NUMBER_OF_STS + " has created.\nname: " + name + "\navg: " + avg + "\nhight: " + hight + "\nsid: " + sid;
    }

    public void Specialst(){
        System.out.println("Special Students method");
    }
}

class Child2 extends Student {
    int age;

    Child2(String name, int hight, int avg, long sid, int age) {
        super(name, hight, avg, sid);
        this.age = age;
        NUMBER_OF_STS++;
    }

    @Override
    public void Talk(){
        System.out.println("I am Child and i am Student.");
    }

    @Override
    public String toString() {
        return super.toString() + "\nage: " + age;
    }
}

