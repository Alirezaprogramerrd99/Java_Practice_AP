package Hobys;

class NODE{

    private int max;
    private int min;

    NODE(int max, int min){

        this.max = max;
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }
}


public class Test{

    public static void main(String[] args) {

        NODE []list = new NODE[5];

        for (int i = 0; i < list.length; i++){
            list[i] = new NODE((int)(Math.random() *  10), (int) (Math.random() * 20));
        }

        for (int j = 0; j < list.length; j++){

            System.out.println("list s max: " + list[j].getMax() + "\t list s min: " + list[j].getMin());
        }

    }

}