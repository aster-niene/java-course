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
        String firstString = "Hello World";
        String [] words = firstString.split(" ");
        for (int i = words.length - 1; i >= 0; i--){
            System.out.print(words[i] + " ");
        }
    }




    public static void main(String[] args){
        getCharsRevers();
        splitRevers();

    }



}
