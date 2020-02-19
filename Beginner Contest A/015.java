import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws Exception {
    String inFst;
    String inSnd;
    String result;
    
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      inFst = br.readLine();
      inSnd = br.readLine();
      
      if(inFst.length() > inSnd.length()){
        result = inFst;
      } else {
        result = inSnd;
      }
      
      System.out.println(result);
      
    } catch(IOException e) {
      e.printStackTrace();
      System.exit(0);
    } catch(Exception e) {
      e.printStackTrace();
      System.exit(0);
    }
  }
}
