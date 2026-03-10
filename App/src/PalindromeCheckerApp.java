import java.util.Stack;
public class PalindromeCheckerApp {

        public static void main(String[] args) {
            String s = "madam";
            Stack<Character> st = new Stack<>();
            String rev = "";

            for(int i = 0; i < s.length(); i++) {
                st.push(s.charAt(i));
            }

            while(!st.isEmpty()) {
                rev = rev + st.pop();
            }

            System.out.println("Palindrome Checker App");
            System.out.println("UC5: Stack-Based Palindrome Checker");

            if(s.equals(rev)) {
                System.out.println(s + " is a Palindrome");
            } else {
                System.out.println(s + " is not a Palindrome");
            }
        }
    }