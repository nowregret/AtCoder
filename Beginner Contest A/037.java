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

			List<Integer> map = Arrays.asList(inputString)
					.stream()
					.map(s -> Integer.parseInt(s))
					.collect(Collectors.toList());

			int whiteBunPrice = map.get(0);
			int greenBunPrice = map.get(1);
			int myMoney = map.get(2);
			
			int lowerPrice = whiteBunPrice > greenBunPrice ? greenBunPrice : whiteBunPrice;
			int higherPrice = whiteBunPrice > greenBunPrice ? whiteBunPrice : greenBunPrice;
			
			int result = 0;
			
			while(myMoney >= lowerPrice) {
				myMoney -= lowerPrice;
				result += 1;
			}

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
