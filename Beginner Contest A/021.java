import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main {

  public static void main(String[] args) throws Exception {

    try {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int N = Integer.parseInt(br.readLine());

      List<Integer> numbers = new ArrayList<>();

      while(N > 1) {
    	  N = N - 2;
    	  numbers.add(2);
      }

      if (N == 1) {
    	  numbers.add(1);
      }

      System.out.println(numbers.size());
      for(int number : numbers) {
    	 System.out.println(number);
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
