import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

class Main {

  public static void main(String[] args) throws Exception {

    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      HashMap<String, Integer> score = new HashMap<>();
      String[] names = { "A", "B", "C"};

      for(String name : names) {
    	  score.put(name, Integer.parseInt(br.readLine()));
      }

      List<Entry<String, Integer>> sort = score.entrySet().
      stream().sorted((a, b) -> b.getValue() - a.getValue()).collect(Collectors.toList());

      for(int i = 0; i < sort.size(); i++) {
    	  score.put(sort.get(i).getKey().toString(), i + 1);
      }

      score.entrySet().stream().forEach(v -> System.out.println(v.getValue()));
    } catch(IOException | NumberFormatException e) {
      e.printStackTrace();
      System.exit(0);
    } catch(Exception e) {
      e.printStackTrace();
      System.exit(0);
    }
  }
}
