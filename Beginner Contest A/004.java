import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
 
class Main {
  public static void main (String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
      String tmp = br.readLine();
      if(tmp != null) {
        int toInt = Integer.parseInt(tmp);
        int result = toInt * 2;
        System.out.println(result);
      }
      
    } catch (IOException e) {
      System.out.println("IOError");
    }
  }
}
