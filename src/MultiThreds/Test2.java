package MultiThreds;

class MyR implements Runnable{


    public void run() {

        for (int i = 0; i < 100; i++){
            try {
                Thread.sleep(13);
                System.out.println(i);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class Test2 {

    public static void main(String[] args) throws InterruptedException{

       Thread t = new Thread(new MyR());

       t.start();
       t.join();
        for (char c = 'A'; c <= 'Z'; c++){

            try {
                Thread.sleep(13);
                System.out.println(c);

            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
