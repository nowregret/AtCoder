import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.stream.Collectors;
 
class Main {
 
	public static void main(String[] args) throws Exception {
 
		try {
 
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
			String[] inputString = br.readLine().split("\\s+");
 
			Map<String, List<String>> map = Arrays.asList(inputString)
					.stream()
					.sorted()
					.collect(Collectors.groupingBy(s -> s));
			
			for(Entry<String, List<String>> resultMap : map.entrySet()) {
				if(resultMap.getValue().size() == 1 || resultMap.getValue().size() > 2) {
					System.out.println(resultMap.getKey());
				}
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