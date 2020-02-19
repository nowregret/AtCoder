import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.util.regex.Pattern;
 
class Main {
  public static void main (String[] args) {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	try {
      String tmp = br.readLine();
      String[] tmp2 = tmp.split("\\s+");
      if (Integer.parseInt(tmp2[0]) > Integer.parseInt(tmp2[1])) {
        System.out.println(tmp2[0]);
      } else {
        System.out.println(tmp2[1]);
      }
    } catch (IOException e) {
      System.out.println("IOError");
    }
  }
}
