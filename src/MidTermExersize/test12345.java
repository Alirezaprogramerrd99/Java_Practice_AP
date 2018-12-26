package MidTermExersize;

class TT{
    TT(){
        System.out.println("Default constractor has invoked!");
    }
    public void run(){
        System.out.println("rrr");
    }

    public static void Print(){
        System.out.println("efef");
    }
}

class CC extends TT{
    CC(String name, int id){
        System.out.println("CC 2 arg has invoked! ");
    }

    public void run(){
        System.out.println("wdwd");
    }
}

public class test12345 {

    public static void main(String[] args) {
//        new CC("Alireza", 1332).Print();
//        CC.Print();
//
//        System.out.println(new CC("eded",212));
        TT t = new CC("121",12121);
        CC c = new CC("sdew",12);
        t.run();
        c.run();

    }


}
