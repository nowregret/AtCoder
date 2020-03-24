import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws Exception {

		try {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String teaName = br.readLine();
			char lastCharacter = teaName.charAt(teaName.length() - 1);
			
			String result = lastCharacter == 'T' ? "YES" : "NO";
			
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