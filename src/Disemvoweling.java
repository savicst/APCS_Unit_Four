import java.util.Scanner;
public class Disemvoweling {
    public static String disemDouble(String s){
       String returnStatement = "";
       int removedCount= 1;
        for (int i = 0; i < s.length() - 1; i++) {
               if (s.substring(i, i + 1).equals(s.substring(i + 1, i + 2))) {
               } else {
                   returnStatement += s.substring(i, i + 1);
               }
           }
                returnStatement += s.substring(s.length()-1);
        return returnStatement;
    }
    public static String disemVowel(String s){
        String vowels = "aeiouAEIOU";
        String returnStatement = "";
        for (int i=0; i<s.length(); i++){
            if (vowels.indexOf(s.substring(i, i + 1))==-1){
                returnStatement += (s.substring(i, i + 1));
            }
        }
        return returnStatement;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the disemvoweling utility.");
        System.out.println("Enter your phrase: ");
        String s = scan.nextLine();
        String x = disemVowel(s);
        String y = disemDouble(x);
        System.out.println("The disemvoweled phrase is: " + y);
        System.out.print("Reduced from " +  s.length() + " to " + y.length() + " characters. ");
        double reduc = 100 * (double)(s.length()-y.length())/ s.length();
        reduc+=.05;
        reduc = (int) (reduc*10);
        reduc/= 10;
        System.out.println("Reduction rate of " + reduc + "%.");
    }
}
