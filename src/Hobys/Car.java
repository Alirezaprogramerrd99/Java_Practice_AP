package Hobys;

class Test123{
    int speed = 70;
}


public class Car extends Test123 {

    private int speed;
    Car(int speed){
        this.speed = speed;

    }

    public int getSpeed() {
        return speed;
    }

    public static void main(String[] args) {
        Car []cars = {new Car(1), new Car(2), new Car(3), new Car(4)};

        for (Car element: cars){
            System.out.println(element.getSpeed());
        }

        Car[] cars2 = {};
        for (int j = 0; j < cars.length; j++){
            cars2[j] = cars[j];
        }

    }


}
