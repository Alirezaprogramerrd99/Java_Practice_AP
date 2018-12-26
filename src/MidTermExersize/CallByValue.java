package MidTermExersize;

public class CallByValue {

    public static int plusPlus(int value){
        value++;
        return value;
    }

    public static void main(String[] args) {
        int number = 10;
        System.out.println(number);

        number = plusPlus(number);
        System.out.println(number);
    }
}
