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
 
			String[] inputString = br.readLine().split("\\s+");
 
			List<Double> map = Arrays.asList(inputString)
					.stream()
					.map(s -> Double.parseDouble(s))
					.collect(Collectors.toList());
			
			double takahashiWinRate = map.get(1) / map.get(0);
			double aokiWinRate = map.get(3) / map.get(2);
			
			String result = takahashiWinRate == aokiWinRate ? "DRAW"
							: takahashiWinRate > aokiWinRate ? "TAKAHASHI"
							: "AOKI";

			System.out.println(result);
			
		} catch (IOException | NumberFormatException e) {
			e.printStackTrace();
			System.exit(0);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
}