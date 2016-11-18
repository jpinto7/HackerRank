import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Compare {

  public static void main(String[] args) {

    /* Variables to hold the results */
    String largest = "";
    String smallest = "";

    /* Read user input */
    Scanner scan = new Scanner(System.in);
    String userString = scan.nextLine();
    int substringLength = scan.nextInt();

    /* To avoid an exception when using substring method */
    int limit = userString.length() - substringLength;

    /* This loop checks for the required substrings */
    for (int i = 0; i <= limit; i++) {
      String sub = userString.substring(i, substringLength + i);
      if (i == 0) {
        smallest = sub;
      }
      if (sub.compareTo(largest) > 0) {
        largest = sub;
      } else if (sub.compareTo(smallest) < 0) {
        smallest = sub;
      }
    }

    /* Print the results */
    System.out.println(smallest);
    System.out.println(largest);
  }
}
