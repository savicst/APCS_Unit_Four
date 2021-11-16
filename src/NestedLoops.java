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
    public static void main(String[] args){
        for (int i=0; i<=5; i++) {
            for (int h = 4; h >= i; h--) {
                System.out.print(" ");
            }
            int g=i;
            for (int j = 1; j <= i; j++) {
                System.out.print(g);
                g--;
            }
            System.out.println();
        }
        //first half done!
        int x = 4;
        for (int i=1; i<=4; i++){
           for (int h=1; h<=i; h++){
               System.out.print(" ");
           }
           int g = x;
           for (int j = 4; j>=i; j--){
               System.out.print(g);
               g--;
           }
            x--;
            System.out.println();
        }
        }
    }


