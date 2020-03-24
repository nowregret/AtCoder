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

			/*
			 * 直方体の表面積の求め方にも公式があるよ。
			 * タテの長さをa、ヨコの長さをb、高さをcとすると、
			 * 2(ab+bc+ac)
			 *
			 */
			int a = map.get(0);
			int b = map.get(1);
			int c = map.get(2);

			System.out.println(2 * (a * b + b* c + a * c));

		} catch (IOException | NumberFormatException e) {
			e.printStackTrace();
			System.exit(0);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}

	}
}