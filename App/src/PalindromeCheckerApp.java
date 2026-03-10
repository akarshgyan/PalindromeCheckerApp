public class PalindromeCheckerApp {
    public static void main(String[] args) {
            String s = "madam";
            String rev = "";

            for(int i = s.length() - 1; i >= 0; i--) {
                rev = rev + s.charAt(i);
            }

            System.out.println("Palindrome Checker App");
            System.out.println("UC2: Print a Hardcoded Palindrome Result");

            if(s.equals(rev)) {
                System.out.println(s + " is a Palindrome");
            } else {
                System.out.println(s + " is not a Palindrome");
            }
        }
    }