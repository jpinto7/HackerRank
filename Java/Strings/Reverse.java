import java.io.*;
import java.util.*;

public class Reverse {

  /* Function to check if the word is the same backward and forward */
  public static boolean isPalindrome(String strg) {
    return strg.equals(reverse(strg));
  }

  /* Function to reverse a string */
  public static String reverse(String strg) {
    return new StringBuffer(strg).reverse().toString();
  }

  public static void main(String[] args) {

    /* Read user input */
    Scanner scan = new Scanner(System.in);
    String word = scan.next();
    scan.close();

    /* Variable to hold the answer */
    String answer = "";

    /* Check the condition */
    if (isPalindrome(word)) {
      answer = "Yes";
    } else {
      answer = "No";
    }

    /* Print out the answer */
    System.out.println(answer);
  }
}
