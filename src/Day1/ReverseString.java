package Day1;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        for(int i=input.length()-1;i>-1;i--) System.out.print(input.charAt(i));
    }
}
