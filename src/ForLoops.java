public class ForLoops {

    /**
     * Sample usage:
     * printingHashTags(0) returns ""
     * printingHashTags(4) returns "####"
     * @param num Integer representing the number of hashtags to draw
     * @return A string of hashtags
     */
    public static String printingHashTags(int num) {
      String retStatement= "";
       //you could also do (int i = 0; i< num; i++) which is more customary
        for (int i = num; i > 0; i--){
        retStatement += "#";
        }
        return retStatement; // update or remove this line. It is only there so the tests do not show an error.
    }

    /**
     * Sample usage:
     * countDown(0, 10) -> “10 9 8 7 6 5 4 3 2 1 0 ”
     * countDown(10, 0) -> “10 9 8 7 6 5 4 3 2 1 0 “
     * @param num1 an integer
     * @param num2 an integer
     * @return a countdown from the largest parameter to the smallest.
     */
    public static String countDown(int num1, int num2) {
        int big, little;
        if (num1 >= num2) {
            big = num1;
            little = num2;
        } else {
            big = num2;
            little = num1;
        }
        String countDown = "";
        for (int i = big; i >= little; i--) {
            countDown += i + " ";
        }
        return countDown; // update or remove this line. It is only there so the tests do not show an error.

    }
    public static int sumNumbers(int num1, int num2 ){
        int big, little;
        if (num1 >= num2) {
            big = num1;
            little = num2;
        } else {
            big = num2;
            little = num1;
        }
        int sum = 0;
        for (int i = little; i<= big; i++){
            sum += i;
        }
        return sum;
    }
    public static int power(int base, int exp){
       int ret = 1;
        for (int i=0; i< exp; i++){
            ret*= base;
        }
        return ret;
    }
    }

