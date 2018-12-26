package MidTermExersize;


import java.util.Date;

class Shape {

    private String color;
    private boolean filled;
    private Date CreatedDate;

    Shape() {
        CreatedDate = new Date();

    }

    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        CreatedDate = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

            public void setFilled ( boolean filled){
            this.filled = filled;
        }

            public Date getDate () {
            return CreatedDate;
        }

            @Override
            public String toString () {
            return "\n" + "Color: " + color + "Creation Date is: " + CreatedDate + ((filled) ? "this shape is filled!" : "this shape is not filled!");
        }
}

        class Rectangle extends Shape {

            private double hight;
            private double width;

            Rectangle() {
                hight = 10;
                width = 3;
            }

            Rectangle(double hight, double width) {
                this();  // invoking default constractor in to the this constractor.
                this.hight = hight;
                this.width = width;

            }

            Rectangle(double hight, double width, String color, boolean filled) {
                super(color, filled);
                this.hight = hight;
                this.width = width;
            }
        }

        public class ShapeTest {

            public static void main(String[] args) {


            }

        }