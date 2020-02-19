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
      String[] trash = {"a", "i", "u", "e", "o"};
      for(String rpc : trash) {
        tmp = tmp.replaceAll(rpc, "");
      }
      System.out.println(tmp);
    } catch (IOException e) {
      System.out.println("IOError");
    }
  }
}
