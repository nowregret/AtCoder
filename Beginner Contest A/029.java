import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class Main {
 
  public static void main(String[] args) throws Exception {
 
    try {
 
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
      String singular = br.readLine();
      
      String plural = singular + 's';
      
      System.out.println(plural);
 
    } catch (IOException | NumberFormatException e) {
      e.printStackTrace();
      System.exit(0);
    } catch (Exception e) {
      e.printStackTrace();
      System.exit(0);
    }
  }
}