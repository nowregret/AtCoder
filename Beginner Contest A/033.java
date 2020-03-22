import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws Exception {

		try {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int firstDigit = Character.getNumericValue((char) br.read());
			int twoDigit = Character.getNumericValue((char) br.read());
			int threeDigit = Character.getNumericValue((char) br.read());
			int fourDigit = Character.getNumericValue((char) br.read());
			
			String result = firstDigit == twoDigit
						 && firstDigit == threeDigit
						 && firstDigit == fourDigit
						 && twoDigit   == threeDigit
						 && twoDigit   == fourDigit
						 && threeDigit == fourDigit ? "SAME" : "DIFFERENT";
			
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