import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

       int[] arr = {1, 2, 3, 4};
       String letters = "abcde";
       String letters2 = "fghij";
       int times = 4;
       ArrayList<String> arr1 = new ArrayList<String>();
       arr1.add("abc");
       arr1.add("def");
       arr1.add("ghi");

       // #1 doubleNumbers
        ArrayList<Integer> doubleNumbersResult = doubleNumbers(arr);
        System.out.println("doubleNumbers: " + doubleNumbersResult);

        // #2 multiplyNumbers
        ArrayList<Integer> multiplyNumbersResult = multiplyNumbers(arr, 5);
        System.out.println("multiplyNumbers: " + multiplyNumbersResult);

        // #3 doubleLetters
        String doubleLettersResult = doubleLetters(letters);
        System.out.println("doubleLetters: " + doubleLettersResult);

        // #4 interleave
        String interleaveResult = interleave(letters, letters2);
        System.out.println("interleave: " + interleaveResult);

        // #5 createRange
        ArrayList<String> createRangeResult = createRange(letters, times);
        System.out.println("createRange: " + createRangeResult);

        // #6 flipArray
        HashMap<String, Integer> flipArrayResult = flipArray(arr1);
        System.out.println("flipArray: " + flipArrayResult);
    }

    // #1 doubleNumbers
    public static ArrayList<Integer> doubleNumbers(int[] numArr){

        ArrayList<Integer> acc = new ArrayList<>();

        for (int i = 0; i < numArr.length; i++){
            acc.add(numArr[i]*2);
        }
        return acc;
    }

    // #2 multiplyNumbers
    public static ArrayList<Integer> multiplyNumbers(int[] intArr, int multiplier){

        ArrayList<Integer> acc = new ArrayList<>();

        for (int i = 0; i < intArr.length; i++){
            acc.add(intArr[i] * multiplier);
        }
        return acc;
    }

    // #3 doubleLetters
    public static String doubleLetters (String str){

        String acc = "";

        for (int i = 0; i < str.length(); i++){
            acc += String.valueOf(str.charAt(i))+String.valueOf(str.charAt(i));
        }
        return acc;
    }

    //#4 interleave
    public static String interleave (String str1, String str2){
        String acc = "";

        for (int i = 0; i < str1.length(); i++){
            acc += String.valueOf(str1.charAt(i))+String.valueOf(str2.charAt(i));
        }
        return acc;
    }

    //#5 createRange
    public static ArrayList<String> createRange(String string, int times){

        ArrayList<String> acc = new ArrayList<>();

        for (int i = 0; i < times; i++) {
            acc.add(string);
        }
        return acc;
    }

    //#6 flipArray
    public static HashMap<String, Integer> flipArray(ArrayList<String> arrOfStr) {

        HashMap<String, Integer> acc = new HashMap<>();

        for(int i =0; i < arrOfStr.size(); i++){
            acc.put(arrOfStr.get(i),i);
        }
        return acc;
    }


}

