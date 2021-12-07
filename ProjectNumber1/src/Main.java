import java.util.Scanner;
public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s){
        int count = 0;

        for(int i = 0;i < s.length();i++){
            switch (s.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
            }
        }

        return count;
    }
    //Code you problem number two here
    static int problemTwo(String s){
        int count = 0;


        for (int i = 0;i <= s.length() - 3;i++){
            String substring = s.substring(i,i+3);
            if (substring.equals("bob"))
                count++;
        }

        return count;
    }
    //Code your solution to problem number 3 here
    static String problemThree(String s){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int A = 0;
        int B = 0;
        int success = 0;
        String temp;
        String bestCandidate = s.substring(0,1);

        for (int i = 0;i < s.length() - 1;i++) {
            for (int x = 0; x < 26; x++) {
                if (s.charAt(i) == alphabet.charAt(x)) {
                    A = x;
                }
                if (s.charAt(i + 1) == alphabet.charAt(x)) {
                    B = x;
                }
            }
            if (A <= B) {
                temp = s.substring(i - success, i + 2);
                if (temp.length() > bestCandidate.length()) bestCandidate = temp;
                success++;
            } else {
                success = 0;
            }
        }
        return bestCandidate;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the string:");
        String s = scan.nextLine();
        System.out.println("Number of vowels: " + problemOne(s));
        System.out.println("Number of times bob occurs is: " + problemTwo(s));
        System.out.println("Longest substring in alphabetical order is: " + problemThree(s));
    }
}
