package MidTermExersize;

class SingleTon{

    private static int NUMBER_OF_OBJECTS;
    private static SingleTon singleTon1;

    int number;

    private SingleTon(){
        NUMBER_OF_OBJECTS++;
        System.out.println("im here!");
    }

    public static SingleTon newObject(){
        if (NUMBER_OF_OBJECTS < 3) {
            singleTon1 = new SingleTon();
            System.out.println("Object created.");
            return singleTon1;
        }
        else return null;
    }

    public static int getNumberOfObjects() {
        return NUMBER_OF_OBJECTS;
    }
}

public class MathMetheds {

    public static void main(String[] args) {

        SingleTon s = SingleTon.newObject();

        s.number = 110;
        System.out.println(s.number);
        SingleTon s2 = SingleTon.newObject();
        SingleTon s3 = SingleTon.newObject();
        SingleTon s4 = SingleTon.newObject();
        s4.number = 20;
        //System.out.println(s4.number); // nullPointerExeption


    }
}
