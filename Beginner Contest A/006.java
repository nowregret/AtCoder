import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    try {
      String tmp = br.readLine();
      String result = "";
      int N = 0;
      
      
      if(tmp != null) {
        N = Integer.parseInt(tmp);
      }
      
      if(N%3 == 0) {
        result = "YES";
      } else {
        result = "NO";
      }
      
      System.out.println(result);
      
    } catch (IOException e) {
      System.out.println("IOExeception");
    }
  }
}
