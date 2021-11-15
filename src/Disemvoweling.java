import java.util.Scanner;
public class Disemvoweling {
    public static String disemDouble(String s){
        //if letter is same as letter +1 then don't print it
        //if statement within a for loop to analyze each letter
        return "";
    }
    public static String disemVowel(String s){
        return "";
    }
    public static void main(String args []){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the disemvoweling utility.");
        System.out.println("Enter your phrase: ");
        String s = scan.nextLine();
        String x = disemDouble(s);
        String y = disemVowel(x);
        System.out.println("The disemvoweled phrase is: " + y);
        System.out.print("Reduced from " +  s.length() + " to " + y.length() + " characters.");
        double reduc = s.length() * 100 / (double)(s.length()-y.length());
        System.out.println("Reduction rate of " + reduc + "%.");
    }
}
