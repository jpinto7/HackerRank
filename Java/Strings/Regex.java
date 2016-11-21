import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class MyRegex {
  public String pattern;

  public MyRegex() {
    this.pattern = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
  }
}

public class Regex {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while (in.hasNext()) {
        String IP = in.next();
        System.out.println(IP.matches(new MyRegex().pattern));
    }
  }
}
