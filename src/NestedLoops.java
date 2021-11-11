public class NestedLoops {

    public static String xSquare(int n) {
       String returnString = "";
        for (int i=1; i<=n; i++ ){
            for (int j=1; j<=n; j++){
                returnString += "X";
            }
            returnString += "\n";
        }
        return returnString;
    }

    public static String flippedTriangle(int n) {
       String returnString = "";
        for(int i=1; i<=n; i++) {
            for (int j=n; j >= i; j--){
                returnString += "*";
            }
            returnString += "\n";
        }
                return returnString;
    }

    public static String fizzBuzz(int n) {
        String returnString = "";
        for(int i=1; i<=n; i++) {
            if (i % 15 == 0) {
                returnString += "FizzBuzz";
            } else if (i % 3 == 0) {
                returnString += "Fizz";
            } else if (i % 5 == 0) {
                returnString += "Buzz";
            } else {
                returnString +=  i ;
            }
            if (i % 20 == 0) {
                returnString += "\n";
            }
            else {
                returnString += " ";
            }
        }
        return returnString;
    }
    public static void main(String args[]){
        for (int i=1; i<=5; i++){
            for (int j=1; j<=i-1; j++){
                System.out.print(" l");
            }
        }
    }
}

