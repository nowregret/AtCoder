import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.util.regex.Pattern;

class Main {
  public static void main (String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    try {
      String inTmp = br.readLine();
      String[] inList = inTmp.split("\\s+");
      
      int startNum = Integer.parseInt(inList[0]);
      int endNum = Integer.parseInt(inList[1]);
      List<Integer> resultArray = new ArrayList<>();
      
      for (int i = startNum; i <= endNum; i++) {
        resultArray.add(i);
      }
      
      System.out.println(resultArray.size());
    } catch (IOException | NumberFormatException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
