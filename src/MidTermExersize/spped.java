package MidTermExersize;

class Bike{
    int speed = 150;
    public String toString(){
        return "\n" + "speed is: " + speed;
    }
}

class Honda3 extends Bike{
    int speed = 90;

    @Override
    public String toString() {
        return super.toString() + " Honad!!";
    }
}

public class spped {

    public static void main(String[] args) {
        Bike b = new Honda3();
        Honda3 h = new Honda3();
        Object o = new Honda3();  // up casting.
        System.out.println(o.toString());

        System.out.println(b.speed);
        System.out.println(((Honda3)b).speed);
        //--------------------------------------------
        System.out.println(h.speed);
        System.out.println(o instanceof Honda3);
    }
}
