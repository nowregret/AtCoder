import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Main {

  public static void main(String[] args) throws Exception {

    try {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      List<Integer> ages = Arrays.asList(br.readLine().split(" "))
    		  .stream()
    		  .map(s -> Integer.parseInt(s))
    		  .sorted((a, b) -> a - b).collect(Collectors.toList());

      int median = 0;

      if(ages.size() % 2 == 0) {
    	  median = (ages.get(ages.size() / 2)+ ages.get(ages.size() / 2 + 1)) / 2;
      } else {
    	  median = ages.get(ages.size() / 2);
      }

      System.out.println(median);

    } catch(IOException | NumberFormatException e) {
      e.printStackTrace();
      System.exit(0);
    } catch(Exception e) {
      e.printStackTrace();
      System.exit(0);
    }
  }
}
