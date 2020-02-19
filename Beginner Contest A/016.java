import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws Exception {
    int inMonth;
    int inDay;
    String inTmp;
    String result;
    
    try {
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      inTmp = br.readLine();
      String split[] = inTmp.split(" ");
      inMonth = Integer.parseInt(split[0]);
      inDay = Integer.parseInt(split[1]);
      
      if(inMonth % inDay == 0) {
        result = "YES";
      } else {
        result = "NO";
      }
      
      System.out.println(result);
      
    } catch(NumberFormatException | IOException e) {
      e.printStackTrace();
      System.exit(0);
    } catch(Exception e) {
      e.printStackTrace();
      System.exit(0);
    }
  }
}
