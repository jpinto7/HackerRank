import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Tokens {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String sentence = scan.nextLine();
    scan.close();

    StringTokenizer tokenizer = new StringTokenizer(sentence, "[ !,?._'@]+");
    System.out.println(tokenizer.countTokens());

    while(tokenizer.hasMoreElements()) {
      System.out.println(tokenizer.nextToken());
    }
  }
}
