import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.util.regex.Pattern;
import java.math.BigDecimal;
 
class Main {
  public static void main (String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    try {
      String tmp = br.readLine();
      String[] tmp2 = tmp.split("\\s+");
      double result = 0;
      double resultTmp1 = 0;
      double resultTmp2 = 0;
      
      if(tmp != null) {
        resultTmp2 = Integer.parseInt(tmp2[0]);
        resultTmp1 = Integer.parseInt(tmp2[1]);
      }
      
      result = resultTmp1/resultTmp2;
      
      BigDecimal bd = new BigDecimal(result);
      BigDecimal bd1 = bd.setScale(0, BigDecimal.ROUND_DOWN);
      System.out.println(bd1);
    
    } catch (IOException e) {
      System.out.println("IO Error");
    }
  }
}
