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
      String[] a = tmp.split("\\s+");
      int xa = Integer.parseInt(a[0]);
      int ya = Integer.parseInt(a[1]);
      int xb = Integer.parseInt(a[2]);
      int yb = Integer.parseInt(a[3]);
      int xc = Integer.parseInt(a[4]);
      int yc = Integer.parseInt(a[5]);
      
      double result = Math.abs((xc-xb)*(ya-yb)-(xa-xb)*(yc-yb)); 
      
      System.out.println(result/2);
    } catch (IOException e) {
      System.out.println("IOError");
    }
  }
}
