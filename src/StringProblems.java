public class StringProblems {

    public static String addHyphens(String s) {
        //Pizza -> P-i-z-z-a
        String newString = "";
        for (int i=0; i < s.length(); i++){
            newString += s.substring(i, i+1) + "-";
        }
        return newString.substring(0,newString.length() -1);
    }

    public static String everyOtherLetter(String s) {
        String newString = "";
        for (int i=0; i < s.length(); i+=2){
            newString += s.substring(i, i+1);
        }
        return newString;
    }


    public static String differentStrings(String s1, String s2) {

        if (s1.compareTo(s2) == 0){
            return s1 + " and " + s2 + " are the same";
        }
        else{
            //not s1, also this doesn't stop at the diff letter
            int count = 0;
            for (int i=0; s1.substring(i, i+1).equals(s2.substring(i, i+1)); i++) {
                count++;
            }
            return s1 + " and " + s2 + " are not the same. They differ at letter number " + (count+1);
        }
    }

    public static boolean isPalindrome(String word) {
        return true;
    }
}
