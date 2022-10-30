package leetcode;

public class LengthOfLastWord {

    public static String s = "Length of Last Word";

    public static void main(String[] args) {
        lengthOfLastWord(s);
    }

    public static int lengthOfLastWord(String s) {
        String[] strings = s.split(" ");
        String lastString = strings[strings.length - 1];
        char[] lastStringToChar = lastString.toCharArray();
        return lastStringToChar.length;
        //return s.split(" ")[s.split(" ").length - 1].toCharArray().length;
    }
}
