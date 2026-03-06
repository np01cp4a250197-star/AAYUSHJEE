package Week16;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.print("Enter an index to retrieve character: ");
        int index = sc.nextInt();
        System.out.println("Character at index " + index + ": " + text.charAt(index));

        System.out.print("Enter a character to find its first occurrence: ");
        char ch = sc.next().charAt(0);
        int charIndex = text.indexOf(ch);

        if (charIndex != -1) {
            System.out.println("First occurrence of '" + ch + "' is at index: " + charIndex);
        } else {
            System.out.println("Character not found.");
        }

        sc.nextLine();

        System.out.print("Enter a word to search in the string: ");
        String word = sc.nextLine();

        if (text.contains(word)) {
            int wordIndex = text.indexOf(word);
            System.out.println("The word \"" + word + "\" is found at index: " + wordIndex);
        } else {
            System.out.println("The word \"" + word + "\" is not present in the string.");
        }

        sc.close();
    }
}
