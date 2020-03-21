import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

  public static void main(String[] args) throws Exception {

    try {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int input = Integer.parseInt(br.readLine());

      System.out.println((int)Math.pow(input/2, 2));

    } catch(IOException | NumberFormatException e) {
      e.printStackTrace();
      System.exit(0);
    } catch(Exception e) {
      e.printStackTrace();
      System.exit(0);
    }
  }
}