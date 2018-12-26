package MidTermExersize;

public class ArrayCopyExersize {

    public static void printArray(int []array){
        System.out.println();
        for (int elements: array){
            System.out.print(elements + " , ");
        }
    }

    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7};
        int []arr2 = new int[arr.length * 2];
        System.arraycopy(arr,0,arr2,0, arr.length );
        printArray(arr);
        printArray(arr2);

    }
}
