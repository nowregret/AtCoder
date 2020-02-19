import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main {

  public static void main(String[] args) throws Exception {

    try {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      String[] input1 = br.readLine().split(" ");
      List<Integer> weight = new ArrayList<>();

      int N = Integer.parseInt(input1[0]);
      int S = Integer.parseInt(input1[1]);
      int T = Integer.parseInt(input1[2]);

      for(int i = 0; i < N; i++ ) {
    	  weight.add(Integer.parseInt(br.readLine()));
      }

      for(int j = 0; j < weight.size(); j++) {
    	  if(j > 0) {
    		  weight.set(j, (weight.get(j-1) + weight.get(j)));
    	  }
      }

      System.out.println(weight.stream().filter(w -> w >= S && w <= T).count());

    } catch(IOException | NumberFormatException e) {
      e.printStackTrace();
      System.exit(0);
    } catch(Exception e) {
      e.printStackTrace();
      System.exit(0);
    }
  }
}
