package MidTermExersize;

public class CharOcuur {

    public static int[] countLetters(char[]chs){
        int []counts = new int[26];

        for (int i = 0; i < chs.length; i++){
            counts[chs[i] - 'a']++;
        }
        return counts;
    }

    public static void displayCounts(int[] counts){

        for (int j = 0; j < counts.length; j++){
            if ((j + 1) % 10 == 0)
                System.out.println( "number of " + ((char) (j + 'a')) + " is: "+ counts[j]);
            else
                System.out.print("number of " + ((char) (j + 'a')) + " is: "+ counts[j] + "  ");
        }
    }


    public static void main(String[] args) {
        char[] chars ={'t','h','i','s','i','s','n','e','w','s','a','m','p','l','e','o','f','j','a','v','a'};
        int []counts = countLetters(chars);
        displayCounts(counts);

        int cg = 'b';
        System.out.println(cg);
    }
}
