import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;

class Main {
  public static void main (String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    try {
      int inTmp = Integer.parseInt(br.readLine());
      int result = 0;
      
      if (inTmp == 12) {
        result = 1;
      } else if (inTmp >= 1 && inTmp <= 11) {
        result = inTmp + 1;
      } else {
        throw new Exception();
      }
      
      System.out.println(result);
      
    } catch (IOException | NumberFormatException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
