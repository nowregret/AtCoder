import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

  public static void main(String[] args) throws Exception {

    try {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int a = Character.getNumericValue((char) br.read());
      int b = Character.getNumericValue((char) br.read());

      System.out.println(a + b);

    } catch(IOException | NumberFormatException e) {
      e.printStackTrace();
      System.exit(0);
    } catch(Exception e) {
      e.printStackTrace();
      System.exit(0);
    }
  }
}
