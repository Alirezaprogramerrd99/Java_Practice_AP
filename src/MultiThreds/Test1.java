package MultiThreds;

class MyT extends Thread{

    @Override
    public void run() {
        System.out.println("Hello in class MyT");
        System.out.println("GoodBay!!");
    }
}

class MyRunAble implements Runnable{

    @Override
    public void run() {
        System.out.println("Im Runable!!");
    }
}

public class Test1 {

    public static void main(String[] args) {
        MyT t = new MyT();

        Thread t2 = new Thread(new MyRunAble());
        System.out.println("Salam In main!");

        t.start();

        t2.start();
        t2.setPriority(10);
        System.out.println("by by!");
    }
}
