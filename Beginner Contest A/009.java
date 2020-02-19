import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.math.*;
 
class Main {
  public static void main (String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    try {
      String inTmp = br.readLine();
      
      float num = Integer.parseInt(inTmp);
      int result = Math.round(num/2);
      System.out.println(result);
    } catch (IOException | NumberFormatException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
