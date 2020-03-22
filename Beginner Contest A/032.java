import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws Exception {

		try {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int aokiNumber = Integer.parseInt(br.readLine());
			int takahashiNumber = Integer.parseInt(br.readLine());
			int conditionNumber = Integer.parseInt(br.readLine());
			int result = conditionNumber;

			for(int i = conditionNumber; !(i % aokiNumber == 0 && i % takahashiNumber == 0); i++) {
				result = i + 1;
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