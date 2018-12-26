

public class testRandom{

public static void main(String[] args){
	
	int randomSize = (int)((Math.random() * (25 - 5))) + 5;
	System.out.println("Random size of array is: " + randomSize);
	
	int [] myArr = new int[randomSize];
	
	for(int i = 0; i < myArr.length; i++){
		myArr[i] = (int)(Math.random() * (70 - 2)) + 2;
	}
	
	System.out.println("Genarated array:");
	
	for(int j = 0 ; j < myArr.length; j++){
		System.out.print(myArr[j] + "   ");
	}
	int index = 0;
	// suffle part.
	
	for(int i = 0; i < myArr.length; i++){
		
		index = (int)(Math.random() * myArr.length);
		int temp = myArr[i];
		myArr[i] = myArr[index];
		myArr[index] = temp;
		
	}
	
	System.out.println("\nAfter suffle:");
	
		for(int j = 0 ; j < myArr.length; j++){
		System.out.print(myArr[j] + "   ");
	}

	}
}