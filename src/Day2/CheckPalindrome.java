package Day2;

public class CheckPalindrome {
    public static void main(String[] args) {
        String input="mmdam",rev="";
        for (char ch:input.toCharArray()) {
            rev=ch+rev;
        }
        if (rev.equals(input)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}
