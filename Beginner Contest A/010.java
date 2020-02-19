import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;

class Main {
  public static void main (String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    try {
      String inTmp = br.readLine();
      String result = inTmp + "pp";
      
      System.out.println(result);
    } catch (IOException | NumberFormatException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
