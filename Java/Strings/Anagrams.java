import java.io.*;
import java.util.*;

public class Anagrams {

  public static boolean isAnagram(String a, String b) {
    String orderedA = sortString(a);
    String orderedB = sortString(b);
    return orderedA.equals(orderedB);
  }

  public static String sortString(String x) {
    char[] stringChars = x.toLowerCase().toCharArray();
    Arrays.sort(stringChars);
    return String.valueOf(stringChars);
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String firstWord = scan.next();
    String secondWord = scan.next();
    scan.close();
    
    String answer = "";

    if (isAnagram(firstWord, secondWord)) {
      answer = "Anagrams";
    } else {
      answer = "Not Anagrams";
    }

    System.out.println(answer);
  }
}
