import java.util.*;

public class WorkWithString {


    public static void getCharsRevers(){
        String firstString = "Hello World";
        int firstWordBegin = 0;
        int firstWordEnd = 5;
        int secondWordBegin = 6;
        int secondWordEnd = 11;
        char[] firstWord = new char[firstWordEnd - firstWordBegin];
        char[] secondWord = new char[secondWordEnd - secondWordBegin];

        firstString.getChars(firstWordBegin, firstWordEnd, firstWord,0);
        firstString.getChars(secondWordBegin, secondWordEnd, secondWord, 0);
        System.out.println(secondWord);
        System.out.println(firstWord);

    }

    public static void splitRevers(){
        String firstString = "Hello World Some Word";
        String [] words = firstString.split(" ");
        //for (int i = words.length - 1; i >= 0; i--){
            //System.out.println(words[i] + " ");
        //}

        for (String word: words
             ) {
            System.out.println(word);
        }
    }

    public static void reversString(String string){
        String[] strings = string.split(" ");
        for (int i = strings.length-1; i>=0; i--){
            System.out.println(strings[i]);
        }
    }

    public static void reversStringArray(String string){
        ArrayList<String> strings = new ArrayList<String>(List.of(string.split(" ")));
        System.out.println(strings.get(1));
    }

    public static void stringToArray (){
        String str = "ABC";
        char[] result = str.toCharArray();
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static void main(String[] args){
        //getCharsRevers();
        splitRevers();
        //reversString("Mom washed frame");
        //reversStringArray("Mom washed frame");

        //String string = "SENIOR QA ENGINEER (AUTOMATION)";
        //System.out.println(string.toLowerCase(Locale.ROOT));

        //stringToArray();




    }









}
