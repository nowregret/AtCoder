import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    try {
      String tmp = br.readLine();
      int result = 0;
      
      if (tmp != null) {
        result = Integer.parseInt(tmp) - 1;
		System.out.println(result);      
      }
      
    } catch (IOException e) {
      System.out.println("Error");
    }
  }
}
