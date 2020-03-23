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

			int horizontal = map.get(0);
			int vertical = map.get(1);

			String result = horizontal % 16 == 0 && vertical % 9 == 0
					        ? "16:9"
				        	: horizontal % 4 == 0 && vertical % 3 == 0
				        	? "4:3"
		        			: "This Aspect ratio is unsupported";

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