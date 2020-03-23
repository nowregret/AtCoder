import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class Main {
 
  public static void main(String[] args) throws Exception {

    try {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int score = Integer.parseInt(br.readLine());

      if (score <= 59) {
        System.out.println("Bad");
      } else if (score <= 89) {
        System.out.println("Good");
      } else if (score <= 99) {
        System.out.println("Great");
      } else if (score == 100) {
        System.out.println("Perfect");
      }

    } catch (IOException | NumberFormatException e) {
      e.printStackTrace();
      System.exit(0);
    } catch (Exception e) {
      e.printStackTrace();
      System.exit(0);
    }
  }
}