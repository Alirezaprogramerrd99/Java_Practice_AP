package MultiThreds;

class B {
    float ba = 100;
    public  synchronized void des(float f){
        ba -= f;
    }

    public synchronized void inc(float f){
        ba += f;
    }
}


class T extends Thread{

     int x,y;
     B bank;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setBank(B bank) {
        this.bank = bank;
    }

    @Override
    public synchronized void run() {
        bank.des(x);
        //bank.inc(y);
        System.out.println(this.getName() + ":  " + bank.ba);
    }
}

public class Test3 {

    public static void p(int a){
        System.out.println(a);

    }


    public static void main(String[] args) {

        T t = new T();
        T t2 = new T();


        B bank = new B();

        t.setBank(bank);
        t2.setBank(bank);

        t.setX(50);
        t.setY(6);

        t2.setX(10);
        t2.setY(2);

        synchronized (bank){  // object that

            t.start();
            t2.start();

        }

    }
}
