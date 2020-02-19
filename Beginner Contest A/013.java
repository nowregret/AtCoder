import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
  
  public static void main(String[] args) throws Exception {
    
    List<String> AtoE = new ArrayList<>();
    AtoE.add("A");
    AtoE.add("B");
    AtoE.add("C");
    AtoE.add("D");
    AtoE.add("E");
    
    try {
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      String input = br.readLine();
      
      if (AtoE.indexOf(input) == -1) {
        System.out.println("Please enter A to E");
      } else {
      	System.out.println(AtoE.indexOf(input) + 1);
      }
      
    } catch(IOException | NumberFormatException e) {
      e.printStackTrace();
      System.exit(0);
    } catch(Exception e) {
      e.printStackTrace();
      System.exit(0);
    }
  }
}
