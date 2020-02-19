import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
  
  public static void main(String[] args) throws Exception {
    
    int inTmpFstAndResult = 0;
    int inTmpSnd = 0;
    
    try {
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      inTmpFstAndResult = Integer.parseInt(br.readLine());
      inTmpSnd = Integer.parseInt(br.readLine());
            
      for (int i = 1; 0 < i;) {
        i = inTmpFstAndResult - inTmpSnd;
        inTmpFstAndResult = i;
      }
      
      System.out.println(inTmpFstAndResult * -1);
      
    } catch(NumberFormatException | IOException e) {
      
      e.printStackTrace();
      System.exit(0);
    
    } catch(Exception e) {
    
      e.printStackTrace();
      System.exit(0);
    
    }
  }
}
