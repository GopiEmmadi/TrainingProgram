package Day2;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine().toLowerCase();
        int vowelsCount=0;
        for (char inputItem:input.toCharArray()) {
            if (inputItem == 'a' || inputItem=='e' || inputItem=='i'|| inputItem=='o' || inputItem=='u') {
                vowelsCount++;
            }
        }
        System.out.println(vowelsCount);
    }
}
