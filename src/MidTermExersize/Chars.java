package MidTermExersize;

public class Chars {

    /** Count the occurrences of each letter */
    public static int[] countLetters(char[] chars) {
        // Declare and create an array of 26 int
        int[] counts = new int[26];

        // For each lowercase letter in the array, count it
        for (int i = 0; i < chars.length; i++)
            counts[chars[i] - 'a']++;

        return counts;
    }

    /** Display counts */
    public static void displayCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            if ((i + 1) % 10 == 0)
                System.out.println(counts[i] + " " + (char)(i + 'a'));
            else
                System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
        }
    }

    public static void main(String[] args) {

        // Declare and create an array
        char[] chars ={'t','h','i','s','i','s','n','e','w','s','a','m','p','l','e','o','f','j','a','v','a'};

        // Display the array
        System.out.println("The lowercase letters are:");
        displayArray(chars);

        // Count the occurrences of each letter
        int[] counts = countLetters(chars);

        // Display counts
        System.out.println();
        System.out.println("The occurrences of each letter are:");
        displayCounts(counts);
    }

    /** Display the array of characters */
    public static void displayArray(char[] chars) {
        // Display the characters in the array 20 on each line
        for (int i = 0; i < chars.length; i++) {
            if ((i + 1) % 20 == 0)
                System.out.println(chars[i]);
            else
                System.out.print(chars[i] + " ");
        }
    }
}

