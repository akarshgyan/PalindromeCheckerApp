public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String s = "radar";
        char[] ch = s.toCharArray();

        int start = 0;
        int end = ch.length - 1;
        boolean flag = true;

        while(start < end) {
            if(ch[start] != ch[end]) {
                flag = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Palindrome Checker App");
        System.out.println("UC4: Character Array Based Palindrome Check");

        if(flag) {
            System.out.println(s + " is a Palindrome");
        } else {
            System.out.println(s + " is not a Palindrome");
        }
    }
}