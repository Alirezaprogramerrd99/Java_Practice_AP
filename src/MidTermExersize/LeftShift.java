package MidTermExersize;

public class LeftShift {

    public static void shiftLeftArray(int []list){

        int temp = list[0];
        for (int i = 1; i < list.length; i++){
            list[i - 1] = list[i];
        }
        list[list.length - 1] = temp;

    }

    public static void shiftRightArray(int []list){
        int temp = list[list.length - 1];

        for (int i = list.length - 2; i >= 0; i--){
            list[i + 1] = list[i];
        }
        list[0] = temp;

    }

    public static void printArray(int []array){
        System.out.println();
        for (int elements: array){
            System.out.print(elements + " , ");
        }
    }

    public static void suffle(int []list){

        int tmpi, temp;
        for (int i = 0; i < list.length; i++){
            tmpi = (int)(Math.random() * list.length);
            temp = list[i];
            list[i] = list[tmpi];
            list[tmpi] = temp;
        }
    }

    public static void main(String[] args) {
        int list[] = new int[]{1,3,4,5,6,7,8,10};
        printArray(list);
        System.out.println("\n-------------------");
        //shiftLeftArray(list);

        //shiftRightArray(list);
        suffle(list);
        printArray(list);
        printArray(new int[] {1,2,3,4,5});

    }
}
