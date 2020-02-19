import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) {
    
    
    
    try {
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int result = 0;
      String inTmp = "";
      
      for(int i = 0; i < 3; i++) {
        inTmp = br.readLine();
        String splitStr[] = inTmp.split(" ");
        result += Integer.parseInt(splitStr[0]) * Integer.parseInt(splitStr[1]) / 10;
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
