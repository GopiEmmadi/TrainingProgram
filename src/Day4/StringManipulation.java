package Day4;

import java.util.Scanner;

public class StringManipulation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Remove all whitespace characters from the sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String withoutWhitespace = removeWhitespace(sentence);
        System.out.println("Sentence without whitespace: " + withoutWhitespace);

        // Step 2: Replace all occurrences of a specific word with another word
        System.out.print("Enter the word to replace: ");
        String wordToReplace = scanner.nextLine();
        System.out.print("Enter the new word: ");
        String newWord = scanner.nextLine();
        String replacedSentence = replaceWord(sentence, wordToReplace, newWord);
        System.out.println("Replaced sentence: " + replacedSentence);

        // Step 3: Split the sentence into individual words and display them in reverse order
        String[] words = splitAndReverse(sentence);
        System.out.println("Words in reverse order:");
        for (String word : words) {
            System.out.print(word+" ");
        }

        scanner.close();
    }

    private static String removeWhitespace(String sentence) {
        return sentence.replaceAll("\\s+", "");
    }

    private static String replaceWord(String sentence, String wordToReplace, String newWord) {
        return sentence.replaceAll("\\b" + wordToReplace + "\\b", newWord);
    }

    private static String[] splitAndReverse(String sentence) {
        String[] words = sentence.split("\\s+");
        int left = 0;
        int right = words.length - 1;
        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }
        return words;
    }
}
